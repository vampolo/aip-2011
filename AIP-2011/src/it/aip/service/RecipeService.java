package it.aip.service;

import it.aip.models.Recipe;
import it.aip.models.RecipeMeta;

import java.util.List;
import java.util.Map;

import org.slim3.datastore.Datastore;
import org.slim3.util.BeanUtil;

import com.google.appengine.api.datastore.Transaction;

public class RecipeService {
    private RecipeMeta recipeMeta = new RecipeMeta();

    // Metodo per la creazione di un nuovo BioProducer
    public Recipe createRecipe(Map<String, Object> requestParameters) {
        
        Recipe recipe = new Recipe();
        
        // Copio tutti i parametri della request nei rispettivi campi del produttore
        BeanUtil.copy(requestParameters, recipe);
        
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
