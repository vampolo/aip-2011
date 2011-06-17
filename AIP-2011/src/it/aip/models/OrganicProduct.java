package it.aip.models;

import java.io.Serializable;
import java.util.List;

import com.google.appengine.api.datastore.Key;
import org.slim3.datastore.Attribute;
import org.slim3.datastore.Model;

@Model
public class OrganicProduct implements Serializable {
    
    @Attribute(primaryKey = true)
    private Key key;
    
    private String productName;         // nome del prodotto    
    private Key producer;               // chiave del produttore
    private String productImage;        // url dell'immagine associata al prodotto
    private String generalInfo;         // informazioni generiche sul prodotto
    private String healthBenefits;      // informazioni sui benefici
    private List<Key> relatedRecipes;   // lista di ricette correlate
    private List<Key> relatedDiets;     // lista di diete correlate
    private List<Key> relatedOffers;       // lista di offerte correlate
    
    public void setKey(Key key) {
        this.key = key;
    }
    public Key getKey() {
        return key;
    }
    
    public void setProductName(String productName) {
        this.productName = productName;
    }
    public String getProductName() {
        return productName;
    }
    
    public void setProducer(Key producer) {
        this.producer = producer;
    }
    public Key getProducer() {
        return producer;
    }
    
    public void setProductImage(String productImage) {
        this.productImage = productImage;
    }
    public String getProductImage() {
        return productImage;
    }
    
    public void setGeneralInfo(String generalInfo) {
        this.generalInfo = generalInfo;
    }
    public String getGeneralInfo() {
        return generalInfo;
    }
    
    public void setHealthBenefits(String healthBenefits) {
        this.healthBenefits = healthBenefits;
    }
    public String getHealthBenefits() {
        return healthBenefits;
    }
    
    public void setRelatedRecipes(List<Key> relatedRecipes) {
        this.relatedRecipes = relatedRecipes;
    }
    public List<Key> getRelatedRecipes() {
        return relatedRecipes;
    }
    
    public void setRelatedDiets(List<Key> relatedDiets) {
        this.relatedDiets = relatedDiets;
    }
    public List<Key> getRelatedDiets() {
        return relatedDiets;
    }
    
    public void setRelatedOffers(List<Key> offersList) {
        this.relatedOffers = offersList;
    }
    public List<Key> getRelatedOffers() {
        return relatedOffers;
    }
    
}
