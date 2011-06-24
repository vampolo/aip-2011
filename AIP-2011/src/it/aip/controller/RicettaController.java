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

public class RicettaController extends Controller {

    private RecipeService rs = new RecipeService();
    private OrganicProductService ops = new OrganicProductService();
    
    @Override
    public Navigation run() throws Exception {
        
        String key = request.getParameter("key");
        Recipe recipe = rs.getRecipe(key);
        requestScope("ricetta", recipe);
        
        // Creo la lista degli ingredienti
        List<OrganicProduct> ingredienti = new ArrayList<OrganicProduct>();
        for (RecipeProduct rp : recipe.getRecipeProductListRef().getModelList()) {
            OrganicProduct p = rp.getProductRef().getModel();
            ingredienti.add(p);
        }       
        requestScope("ingredienti", ingredienti);
        
        
        Recipe precedente = null, successivo = null;
        List<Recipe> recipes = new ArrayList<Recipe>();;
        String prodotto = request.getParameter("fromProduct");
        if(prodotto == null){
            recipes = rs.getAllRecipes();
            
        }
        else{
            requestScope("prodotto", prodotto);
            
            OrganicProduct product = ops.getProduct(prodotto);
            
            for (RecipeProduct rp : product.getRecipeProductListRef().getModelList()) {
                Recipe r = rp.getRecipeRef().getModel();
                recipes.add(r);
            } 
                
        }
            
        // Se c'è almeno una ricetta, la cerco ed estraggo la precedente e la successiva
        boolean found = false;
        for(int i = 0; i<recipes.size() && recipes.size()>1 && !found; i++){
            Recipe currentRecipe = recipes.get(i);
            
            if(i>0)
                precedente = recipes.get(i-1);
            else
                precedente = null;
            
            if(i+1<recipes.size())
                successivo = recipes.get(i+1); 
            else
                successivo = null;
                
            if(recipe.getKey().equals(currentRecipe.getKey())){
                found = true;
            }                
        }
            
        requestScope("precedente", precedente);
        requestScope("successivo", successivo);
                
        return forward("ricetta.jsp");
    }
}
