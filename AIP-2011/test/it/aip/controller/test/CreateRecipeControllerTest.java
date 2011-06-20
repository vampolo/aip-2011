package it.aip.controller.test;

import it.aip.models.Recipe;

import org.slim3.datastore.Datastore;
import org.slim3.tester.ControllerTestCase;
import org.junit.Test;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

public class CreateRecipeControllerTest extends ControllerTestCase {

    @Test
    public void run() throws Exception {
        tester.param("recipeName", "recipeTEST");
        tester.start("/test/createRecipe");
        
        CreateRecipeController controller = tester.getController();
        assertThat(controller, is(notNullValue()));
        assertThat(tester.isRedirect(), is(true));
        assertThat(tester.getDestinationPath(), is("/test/"));
        
        Recipe recipeStored = Datastore.query(Recipe.class).asSingle();
        assertThat(recipeStored, is(notNullValue()));
        assertThat(recipeStored.getRecipeName(), is("recipeTEST"));
        
        
    }
}
