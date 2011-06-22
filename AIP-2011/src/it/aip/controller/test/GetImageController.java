package it.aip.controller.test;

import it.aip.models.BioProducer;
import it.aip.models.ImageFile;
import it.aip.models.OrganicProduct;
import it.aip.models.Recipe;

import org.slim3.controller.Controller;
import org.slim3.controller.Navigation;
import org.slim3.datastore.Datastore;

import com.google.appengine.api.datastore.Key;

public class GetImageController extends Controller {
    
    @Override
    public Navigation run() throws Exception {
        
        // Cerco le chiavi di un produttore, di un prodotto, di una ricetta
        String producerKey = (String) request.getAttribute("producerKey");
        String productKey = (String) request.getAttribute("productKey");
        String recipeKey = (String) request.getAttribute("recipeKey");
        // Cerco l'indice dell'immagine
        int imageIndex = -1;
        if(request.getAttribute("imageIndex") != null){
            imageIndex = Integer.parseInt((String) request.getAttribute("imageIndex"));
       
            if(producerKey != null){
                // Estraggo l'immagine
                BioProducer producer = Datastore.get(BioProducer.class, Datastore.stringToKey(producerKey));
                ImageFile image = producer.getImages().get(imageIndex);
                
                if(image != null){
                    // La inserisco nella response
                    response.setContentType("image/jpeg");
                    response.setHeader("Cache-Control", "max-age=1209600");
                    response.getOutputStream().write(image.getData());                
                }
                
            }else if(productKey != null){
                // Estraggo l'immagine
                OrganicProduct product = Datastore.get(OrganicProduct.class, Datastore.stringToKey(productKey));
                ImageFile image = product.getImages().get(imageIndex);
                
                if(image != null){
                    // La inserisco nella response
                    response.setContentType("image/jpeg");
                    response.setHeader("Cache-Control", "max-age=1209600");
                    response.getOutputStream().write(image.getData());                
                }
            }else if(recipeKey != null){
                // Estraggo l'immagine
                Recipe recipe = Datastore.get(Recipe.class, Datastore.stringToKey(producerKey));
                ImageFile image = recipe.getImages().get(imageIndex);
                
                if(image != null){
                    // La inserisco nella response
                    response.setContentType("image/jpeg");
                    response.setHeader("Cache-Control", "max-age=1209600");
                    response.getOutputStream().write(image.getData());                
                }
            }

        }        

        return null;
    }
}
