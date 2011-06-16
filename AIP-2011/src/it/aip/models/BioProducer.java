package it.aip.models;

import java.io.Serializable;
import java.util.List;

import com.google.appengine.api.datastore.Key;
import org.slim3.datastore.Attribute;
import org.slim3.datastore.Model;

@Model
public class BioProducer implements Serializable {
    
    @Attribute(primaryKey = true)
    private Key key;
    
    private String producerName;        // nome del produttore
    private String infoAzienda;         // informazioni generali
    private String productionMethod;    // metodi di produzione 
    private String practicalInfo;       // informazioni pratiche
    private List<String> relatedPhotos; // lista delle url delle foto
    private List<Key> relatedProducts;  // lista di prodotti offerti
    
    
    public void setKey(Key key) {
        this.key = key;
    }
    public Key getKey() {
        return key;
    }
    
    public void setProducerName(String producerName) {
        this.producerName = producerName;
    }
    public String getProducerName() {
        return producerName;
    }
    
    public void setInfoAzienda(String infoAzienda) {
        this.infoAzienda = infoAzienda;
    }
    public String getInfoAzienda() {
        return infoAzienda;
    }
    
    public void setProductionMethod(String productionMethod) {
        this.productionMethod = productionMethod;
    }
    public String getProductionMethod() {
        return productionMethod;
    }
    
    public void setPracticalInfo(String practicalInfo) {
        this.practicalInfo = practicalInfo;
    }
    public String getPracticalInfo() {
        return practicalInfo;
    }

    public void setRelatedPhotos(List<String> photo) {
        this.relatedPhotos = photo;
    }
    public List<String> getRelatedPhotos() {
        return relatedPhotos;
    }

    public void setRelatedProducts(List<Key> products) {
        this.relatedProducts = products;
    }
    public List<Key> getRelatedProducts() {
        return relatedProducts;
    }

}