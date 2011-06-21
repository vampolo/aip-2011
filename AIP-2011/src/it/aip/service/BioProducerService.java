package it.aip.service;

import it.aip.models.BioProducer;
import it.aip.models.BioProducerMeta;
import it.aip.models.OrganicProduct;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.slim3.datastore.Datastore;
import org.slim3.util.BeanUtil;

import com.google.appengine.api.datastore.Transaction;

public class BioProducerService {
    
    private BioProducerMeta bioProducerMeta = new BioProducerMeta();

    // Metodo per la creazione di un nuovo BioProducer
    @SuppressWarnings("rawtypes")
    public BioProducer createBioProducer(Map<String, Object> requestParameters) {
        
        BioProducer producer = new BioProducer();
        
        // Copio tutti i parametri della request nei rispettivi campi del produttore
        BeanUtil.copy(requestParameters, producer);
        
        if(requestParameters.containsValue("on")){
            
            // Scandisco tutte le chiavi
            Set keysSet = requestParameters.keySet();
            Iterator iterator = keysSet.iterator();
            while(iterator.hasNext()){
                String key = (String) iterator.next();
                
                // Se trovo una chiave con valore "on" (checkbox selezionata)
                if(requestParameters.get(key).equals("on")){
                    // Setto la relazione
                    OrganicProduct product = Datastore.get(OrganicProduct.class, Datastore.stringToKey(key));
                    product.getProducerRef().setModel(producer);
                    
                    // TEST CODE 
                    /*
                    System.out.println(product.getProductName() + " linkato a " + product.getProducerRef().getModel().getProducerName());
                    System.out.println(product.getProducerRef().getModel().getProducerName() + " linkato a " + producer.getProductsListRef().getModelList().size() + " oggetti");
                    */
                }
            }
        }
                                
        // Storing...
        Transaction tx = Datastore.beginTransaction();
        Datastore.put(producer);
        tx.commit();
        
        return producer;
    }
    
    // Metodo per l'estrazione di tutti i BioProducers
    public List<BioProducer> getAllBioProducers() {
        return Datastore.query(bioProducerMeta).asList();
    } 
    
}