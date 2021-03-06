package it.aip.models;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import com.google.appengine.api.datastore.Key;

import org.slim3.datastore.Attribute;
import org.slim3.datastore.InverseModelListRef;
import org.slim3.datastore.Model;

@Model
public class BioProducer implements Serializable {
    
    private static final long serialVersionUID = 1L;

    @Attribute(primaryKey = true)
    private Key key;
  
    private String producerName;            // nome del produttore
    
    @Attribute(lob = true)
    private List<ImageFile> images = new ArrayList<ImageFile>();         // immagini del produttore
    
    // Riferimento ai prodotti (one-to-many)
    @Attribute(persistent = false)
    private InverseModelListRef<OrganicProduct, BioProducer> productsListRef 
        = new InverseModelListRef<OrganicProduct, BioProducer>(OrganicProduct.class, "producerRef", this);
    
    @Attribute(lob = true)
    private String infoAzienda;         // informazioni generali
    @Attribute(lob = true)
    private String productionMethod;    // metodi di produzione 
    @Attribute(lob = true)
    private String practicalInfo;       // informazioni pratiche    
    
       
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
   
    public InverseModelListRef<OrganicProduct, BioProducer> getProductsListRef() {
        return productsListRef;
    }
    
    public void setImages(List<ImageFile> images) {
        this.images = images;
    }
    public List<ImageFile> getImages() {
        return images;
    }
    
}