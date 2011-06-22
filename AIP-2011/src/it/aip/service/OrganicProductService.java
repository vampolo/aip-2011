package it.aip.service;

import it.aip.models.BioProducer;
import it.aip.models.OrganicProduct;
import it.aip.models.OrganicProductMeta;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

import org.slim3.datastore.Datastore;
import org.slim3.util.BeanUtil;

import com.google.appengine.api.datastore.Transaction;

public class OrganicProductService {
    private OrganicProductMeta organicProductMeta = new OrganicProductMeta();

    // Metodo per la creazione di un nuovo BioProducer
    public OrganicProduct createOrganicProduct(Map<String, Object> requestParameters) {
        
        OrganicProduct product = new OrganicProduct();
        
        // Copio tutti i parametri della request nei rispettivi campi del produttore
        BeanUtil.copy(requestParameters, product);
        
        // Se è stato specificato un produttore, lo linko al prodotto
        if(requestParameters.containsKey("producerKey")){
            String key = (String) requestParameters.get("producerKey");
            BioProducer producer = Datastore.get(BioProducer.class, Datastore.stringToKey(key));
            product.getProducerRef().setModel(producer);
            
            // TEST CODE 
            // System.out.println(product.getProductName() + " linkato a " + product.getProducerRef().getModel().getProducerName());
        }
        
        // Storing...
        Transaction tx = Datastore.beginTransaction();
        Datastore.put(product);
        tx.commit();
        
        return product;
    }
    
    // Metodo per l'estrazione di tutti i BioProducers
    public List<OrganicProduct> getAllOrganicProducts() {
        return Datastore.query(organicProductMeta).asList();
    }
    
    // Metodo per l'estrazione di tutti i BioProducers
    public List<String> getAllCategories() {
        List<OrganicProduct> organic_products = this.getAllOrganicProducts();  
        List<String> categorie = new ArrayList<String>();
        
        for(OrganicProduct x : organic_products){
            if(x.getProductCategory() != "")
                categorie.add(x.getProductCategory());
        }
        
        HashSet hashSet = new HashSet(categorie);
        ArrayList categories_no_duplicates = new ArrayList(hashSet);
        Collections.sort(categories_no_duplicates);
        return categories_no_duplicates;
    }
    
    public List<OrganicProduct> getProductByCategory(String category) {
        return Datastore.query(organicProductMeta).filter(organicProductMeta.productCategory.equal(category)).asList();
    }
}
