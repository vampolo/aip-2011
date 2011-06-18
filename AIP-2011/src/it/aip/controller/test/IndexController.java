package it.aip.controller.test;

import it.aip.models.BioProducer;
import it.aip.models.OrganicProduct;
import it.aip.models.Recipe;
import org.slim3.controller.Controller;
import org.slim3.controller.Navigation;

public class IndexController extends Controller {

    @Override
    public Navigation run() throws Exception {
        
        
        // TESTING CODE --------------------------------
        
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

        
        // COSE DA FARE DOMANI, ORA ESCO :)
        // Linko i prodotti al produttore
        // Linko 3 prodotti alla terza ricetta
        // Linko 2 prodotti alla seconda ricetta
        // Linko 1 prodotto alla prima ricetta
        // Salvataggio e recupero dati dalla Big Table

        
        return forward("index.jsp");
    }
}
