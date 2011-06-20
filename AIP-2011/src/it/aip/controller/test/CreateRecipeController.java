package it.aip.controller.test;

import it.aip.service.RecipeService;

import org.slim3.controller.Controller;
import org.slim3.controller.Navigation;
import org.slim3.util.RequestMap;

public class CreateRecipeController extends Controller {

    private RecipeService service = new RecipeService();
    
    @Override
    public Navigation run() throws Exception {
        
        // Invoco il servizio, passandogli la Map con i parametri della request
        service.createRecipe(new RequestMap(request));
        
        return redirect(basePath);
    }
}
