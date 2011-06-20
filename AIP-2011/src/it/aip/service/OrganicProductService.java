package it.aip.service;

import it.aip.models.OrganicProduct;
import it.aip.models.OrganicProductMeta;

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
}
