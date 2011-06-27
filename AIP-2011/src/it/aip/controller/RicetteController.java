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

public class RicetteController extends Controller {

    private RecipeService rs = new RecipeService();
    private OrganicProductService ops = new OrganicProductService();
    
    @Override
    public Navigation run() throws Exception {
        
        List<Recipe> recipes = new ArrayList<Recipe>(); 
        
        String prodotto = request.getParameter("fromProduct");
        
        // Se non viene specificato un prodotto
        if(prodotto == null){
            
            // mostro l'elenco dei tipi di ricette
            return forward("ricette.jsp");
        }
        else if(prodotto.equals("all")) {
            
            // se il parametro è "all", mostro l'elenco di tutte le ricette
            recipes = rs.getAllRecipes();  
            requestScope("ricette", recipes);
            return forward("ricette.jsp");
        }else{
            
            // se è specificato un prodotto, elenco le ricette correlate
            OrganicProduct product = ops.getProduct(prodotto);
            requestScope("prodotto", product);
            for (RecipeProduct rp : product.getRecipeProductListRef().getModelList()) {
                Recipe r = rp.getRecipeRef().getModel();
                recipes.add(r);
            }
            requestScope("ricette", recipes);
            return forward("ricetteByProduct.jsp");
        }   
        
    }
}

