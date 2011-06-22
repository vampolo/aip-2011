package it.aip.controller.test;

import java.util.Iterator;
import java.util.List;

import it.aip.models.BioProducer;
import it.aip.models.OrganicProduct;
import it.aip.models.Recipe;
import it.aip.service.BioProducerService;
import it.aip.service.OrganicProductService;
import it.aip.service.RecipeService;

import org.slim3.controller.Controller;
import org.slim3.controller.Navigation;

import com.google.appengine.api.datastore.Key;

public class IndexController extends Controller {

    private BioProducerService bioProducerService = new BioProducerService();
    private OrganicProductService organicProductService = new OrganicProductService();
    private RecipeService recipeService = new RecipeService();
    
    
    @Override
    public Navigation run() throws Exception {
        
        // Preparo la lista di produttori, da inserire nella pagina di amministrazione
        List<BioProducer> bioProducersList = bioProducerService.getAllBioProducers();
        
        requestScope("bioProducersList", bioProducersList);
               
        // Preparo la lista di prodotti, da inserire nella pagina di amministrazione
        List<OrganicProduct> organicProductsList = organicProductService.getAllOrganicProducts();
        requestScope("organicProductsList", organicProductsList);
        
        // Preparo la lista di ricette, da inserire nella pagina di amministrazione
        List<Recipe> recipesList = recipeService.getAllRecipes();
        requestScope("recipesList", recipesList);
        
        return forward("index.jsp");
        
        
    }
}
