package it.aip.controller;

import java.util.ArrayList;
import java.util.List;

import it.aip.models.OrganicProduct;
import it.aip.models.Recipe;
import it.aip.models.RecipeProduct;
import it.aip.service.OrganicProductService;
import it.aip.service.RecipeService;

import org.slim3.controller.Controller;
import org.slim3.controller.Navigation;

public class ProdottoController extends Controller {

    private OrganicProductService ops = new OrganicProductService();
    private RecipeService rs = new RecipeService();
    
    @Override
    public Navigation run() throws Exception {
        String key = request.getParameter("key");
        OrganicProduct product = ops.getProduct(key);
        requestScope("prodotto", product);    
        
        OrganicProduct precedente = null, successivo = null;
        List<OrganicProduct> products = new ArrayList<OrganicProduct>();;
                        
        String recipeKey = request.getParameter("fromRecipe");
        if(recipeKey != null){
            requestScope("ricetta", recipeKey);
            
            Recipe ricetta = rs.getRecipe(recipeKey);            
            // Creo la lista degli ingredienti
            for (RecipeProduct rp : ricetta.getRecipeProductListRef().getModelList()) {
                OrganicProduct p = rp.getProductRef().getModel();
                products.add(p);
            }
                      
        }
        
        String categoria = request.getParameter("fromCategory");
        if(categoria != null){
            requestScope("categoria", categoria);
            
            if(categoria.equals("all")){
                products = ops.getAllOrganicProducts();
            }
            else {
                products = ops.getProductByCategory(categoria);
            }           
                         
        }
        
        // Se c'è almeno un prodotto, lo cerco ed estraggo il precedente e il successivo
        boolean found = false;
        for(int i = 0; i<products.size() && products.size()>1 && !found; i++){
            OrganicProduct currentProduct = products.get(i);
            
            if(i>0)
                precedente = products.get(i-1);
            else
                precedente = null;
            
            if(i+1<products.size())
                successivo = products.get(i+1); 
            else
                successivo = null;
            
            if(product.getKey().equals(currentProduct.getKey())){
                found = true;
            }                
        }
        
        requestScope("precedente", precedente);
        requestScope("successivo", successivo);
        
        return forward("prodotto.jsp");
    }
}
