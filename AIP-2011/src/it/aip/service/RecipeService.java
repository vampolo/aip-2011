package it.aip.service;

import it.aip.models.OrganicProduct;
import it.aip.models.Recipe;
import it.aip.models.RecipeMeta;
import it.aip.models.RecipeProduct;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.slim3.datastore.Datastore;
import org.slim3.util.BeanUtil;

import com.google.appengine.api.datastore.Transaction;

public class RecipeService {
    private RecipeMeta recipeMeta = new RecipeMeta();

    // Metodo per la creazione di un nuovo BioProducer
    @SuppressWarnings("rawtypes")
    public Recipe createRecipe(Map<String, Object> requestParameters) {
        
        Recipe recipe = new Recipe();
        
        // Copio tutti i parametri della request nei rispettivi campi del produttore
        BeanUtil.copy(requestParameters, recipe);
        
        if(requestParameters.containsValue("on")){
            
            // Scandisco tutte le chiavi
            Set keysSet = requestParameters.keySet();
            Iterator iterator = keysSet.iterator();
            while(iterator.hasNext()){
                String key = (String) iterator.next();
                
                // Se trovo una chiave con valore "on" (checkbox selezionata)
                if(requestParameters.get(key).equals("on")){
                    // Setto la relazione
                    OrganicProduct product = Datastore.get(OrganicProduct.class, Datastore.stringToKey(key));
                    
                    RecipeProduct recipeProduct = new RecipeProduct();
                    recipeProduct.getProductRef().setModel(product);
                    recipeProduct.getRecipeRef().setModel(recipe);                    
                    
                    // TEST CODE
                    // System.out.println(recipeProduct.getProductRef().getModel().getProductName() + " linkato a " + recipeProduct.getRecipeRef().getModel().getRecipeName());
           
                }
            }
        }
        
        // Storing...
        Transaction tx = Datastore.beginTransaction();
        Datastore.put(recipe);
        tx.commit();
        
        return recipe;
    }

    // Metodo per l'estrazione di tutti i BioProducers
    public List<Recipe> getAllRecipes() {
        return Datastore.query(recipeMeta).asList();
    } 

}
