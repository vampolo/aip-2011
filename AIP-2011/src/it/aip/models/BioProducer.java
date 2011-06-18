package it.aip.models;

import java.io.Serializable;
import java.util.List;

import com.google.appengine.api.datastore.Key;
import org.slim3.datastore.Attribute;
import org.slim3.datastore.InverseModelListRef;
import org.slim3.datastore.Model;

@SuppressWarnings("serial")
@Model
public class BioProducer implements Serializable {
    
    @Attribute(primaryKey = true)
    private Key key;
  
    private String producerName;        // nome del produttore
    private List<String> relatedPhotos; // lista delle url delle foto
    
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
    
    
    public BioProducer() {
        super();
    }
    public BioProducer(Key key, String producerName,
            List<String> relatedPhotos,
            InverseModelListRef<OrganicProduct, BioProducer> productsListRef,
            String infoAzienda, String productionMethod, String practicalInfo) {
        super();
        this.key = key;
        this.producerName = producerName;
        this.relatedPhotos = relatedPhotos;
        this.productsListRef = productsListRef;
        this.infoAzienda = infoAzienda;
        this.productionMethod = productionMethod;
        this.practicalInfo = practicalInfo;
    }

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
    
    public InverseModelListRef<OrganicProduct, BioProducer> getProductsListRef() {
        return productsListRef;
    }

}