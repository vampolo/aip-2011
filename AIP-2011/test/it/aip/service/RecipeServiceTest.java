package it.aip.service;

import it.aip.models.Recipe;

import java.util.HashMap;
import java.util.Map;

import org.slim3.datastore.Datastore;
import org.slim3.tester.AppEngineTestCase;
import org.junit.Test;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

public class RecipeServiceTest extends AppEngineTestCase {

    private RecipeService service = new RecipeService();

    @Test
    public void test() throws Exception {
        assertThat(service, is(notNullValue()));
    }
    
    @Test
    public void createRecipe() throws Exception {
        Map<String, Object> input = new HashMap<String, Object>();
        input.put("recipeName", "recipeTEST");
        Recipe recipeSubmitted = service.createRecipe(input);
        assertThat(recipeSubmitted, is(notNullValue()));
        Recipe recipeStored = Datastore.get(Recipe.class, recipeSubmitted.getKey());
        assertThat(recipeStored.getRecipeName(), is("recipeTEST"));
    }
}
