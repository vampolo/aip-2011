package it.aip.controller.test;

import java.util.ArrayList;
import java.util.List;

import it.aip.models.BioProducer;
import it.aip.models.OrganicProduct;
import it.aip.models.Recipe;
import it.aip.models.RecipeProduct;

import org.slim3.controller.Controller;
import org.slim3.controller.Navigation;
import org.slim3.datastore.Datastore;

public class IndexController extends Controller {

    @Override
    public Navigation run() throws Exception {
        
        
        // TESTING --------------------------------
        
        // Creo un produttore
        BioProducer producer1 = new BioProducer(null, "producer1", null, null, "infoAzienda1", "productionMethod1", "practicalInfo1");
        
        // Creo 3 prodotti
        OrganicProduct product1 = new OrganicProduct(null, "product1", "category1", "imageProduct1", null, null, "generalInfoProduct1", "healthBenefitsProduct1");
        OrganicProduct product2 = new OrganicProduct(null, "product2", "category2", "imageProduct2", null, null, "generalInfoProduct2", "healthBenefitsProduct2");
        OrganicProduct product3 = new OrganicProduct(null, "product3", "category3", "imageProduct3", null, null, "generalInfoProduct3", "healthBenefitsProduct3");

        // Creo 3 ricette
        Recipe recipe1 = new Recipe(null, "recipe1", "type1", null, null, "descriptionRecipe1");
        Recipe recipe2 = new Recipe(null, "recipe2", "type2", null, null, "descriptionRecipe2");
        Recipe recipe3 = new Recipe(null, "recipe3", "type3", null, null, "descriptionRecipe3");

        
  /*      // Linko i prodotti al produttore
        product1.getProducerRef().setModel(producer1);
        product2.getProducerRef().setModel(producer1);
        product3.getProducerRef().setModel(producer1);
        
        // Linko 1 prodotto alla prima ricetta
        RecipeProduct recipeProduct11 = new RecipeProduct();
        recipeProduct11.getRecipeRef().setModel(recipe1);
        recipeProduct11.getProductRef().setModel(product1);
        
        // Linko 2 prodotti alla seconda ricetta
        RecipeProduct recipeProduct21 = new RecipeProduct();
        recipeProduct21.getRecipeRef().setModel(recipe2);
        recipeProduct21.getProductRef().setModel(product1);
        
        RecipeProduct recipeProduct22 = new RecipeProduct();
        recipeProduct22.getRecipeRef().setModel(recipe2);
        recipeProduct22.getProductRef().setModel(product2);
        
        // Linko 3 prodotti alla terza ricetta
        RecipeProduct recipeProduct31 = new RecipeProduct();
        recipeProduct31.getRecipeRef().setModel(recipe3);
        recipeProduct31.getProductRef().setModel(product1);
        
        RecipeProduct recipeProduct32 = new RecipeProduct();
        recipeProduct32.getRecipeRef().setModel(recipe3);
        recipeProduct32.getProductRef().setModel(product2);
        
        RecipeProduct recipeProduct33 = new RecipeProduct();
        recipeProduct33.getRecipeRef().setModel(recipe3);
        recipeProduct33.getProductRef().setModel(product3);
        
        // Salvataggio dati nella Big Table
        Datastore.put(
            producer1, 
            product1, product2, product3, 
            recipe1, recipe2, recipe3, 
            recipeProduct11, recipeProduct21, recipeProduct22, recipeProduct31, recipeProduct32, recipeProduct33);
        */
        
        // Creo una lista di prodotti (per vedere se riesco a visualizzarla)
        /*
        List<OrganicProduct> productsList = new ArrayList<OrganicProduct>();
        productsList.add(product1);
        productsList.add(product2);
        productsList.add(product3);
        requestScope("productsList", productsList);
        */
        return forward("index.jsp");
    }
}
