package it.aip.service;

import it.aip.models.BioProducer;
import it.aip.models.BioProducerMeta;
import it.aip.models.ImageFile;
import it.aip.models.OrganicProduct;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.slim3.controller.upload.FileItem;
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
                    // System.out.println(product.getProductName() + " linkato a " + product.getProducerRef().getModel().getProducerName());
                    
                }
            }
        }
        
        // Suppongo che l'utente possa inserire fino ad un massimo di 4 immagini
        int imageCount = 4;
        for(int i = 1; i<=imageCount; i++){
            // Per ogni immagine che l'utente può inserire
            if(requestParameters.containsKey("imageProducer" + i)){
                // Estraggo dalla request
                FileItem tempFile = (FileItem) requestParameters.get("imageProducer" + i);
                ImageFile tempImage = new ImageFile(tempFile.getFileName(), tempFile.getContentType(), tempFile.getData());
                
                // La aggiungo alla lista del produttore
                if(producer.getImages() == null){
                    producer.setImages(new ArrayList<ImageFile>());
                }
                producer.getImages().add(tempImage);
               
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
    
    /**
     * Metodo per avere prendere un produttore data la sua chiave
     * @param key
     * @return OrganicProduct
     */
    public BioProducer getProducer(String key){
        return Datastore.get(bioProducerMeta, Datastore.stringToKey(key));
    }
    
}
