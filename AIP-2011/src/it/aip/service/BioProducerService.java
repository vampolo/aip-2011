package it.aip.service;

import it.aip.models.BioProducer;
import it.aip.models.BioProducerMeta;

import java.util.List;
import java.util.Map;

import org.slim3.datastore.Datastore;
import org.slim3.util.BeanUtil;

import com.google.appengine.api.datastore.Transaction;

public class BioProducerService {
    
    private BioProducerMeta bioProducerMeta = new BioProducerMeta();

    // Metodo per la creazione di un nuovo BioProducer
    public BioProducer createBioProducer(Map<String, Object> requestParameters) {
        
        BioProducer producer = new BioProducer();
        
        // Copio tutti i parametri della request nei rispettivi campi del produttore
        BeanUtil.copy(requestParameters, producer);
        
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
