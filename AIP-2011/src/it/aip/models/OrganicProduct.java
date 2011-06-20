package it.aip.models;

import java.io.Serializable;

import com.google.appengine.api.datastore.Blob;
import com.google.appengine.api.datastore.Key;
import org.slim3.datastore.Attribute;
import org.slim3.datastore.InverseModelListRef;
import org.slim3.datastore.Model;
import org.slim3.datastore.ModelRef;

@SuppressWarnings("serial")
@Model
public class OrganicProduct implements Serializable {
    
    @Attribute(primaryKey = true)
    private Key key;
    
    private String productName;         // nome del prodotto    
    private String productCategory;     // categoria di prodotto
    private Blob productImage;          // immagine del prodotto
    
    // Riferimento al produttore (one-to-one)
    private ModelRef<BioProducer> producerRef 
        = new ModelRef<BioProducer>(BioProducer.class);
    
    // Riferimento alle ricette (one-to-many)
    @Attribute(persistent = false)
    private InverseModelListRef<RecipeProduct, OrganicProduct> recipeProductListRef
        = new  InverseModelListRef<RecipeProduct, OrganicProduct>(RecipeProduct.class,  "productRef", this);
    
    // relatedDiets;     // lista di diete correlate (MULTIPLE TOPIC NON IMPLEMENTATO)
    // relatedOffers;    // lista di offerte correlate (MULTIPLE TOPIC NON IMPLEMENTATO)
    
    @Attribute(lob = true)
    private String generalInfo;         // informazioni generiche sul prodotto
    @Attribute(lob = true)
    private String healthBenefits;      // informazioni sui benefici   
    
        
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
       
    public ModelRef<BioProducer> getProducerRef() {
        return producerRef;
    }
    
    public void setProductCategory(String productCategory) {
        this.productCategory = productCategory;
    }
    
    public String getProductCategory() {
        return productCategory;
    }

    public InverseModelListRef<RecipeProduct, OrganicProduct> getRecipeProductListRef() {
        return recipeProductListRef;
    }
    
    public void setProductImage(Blob productImage) {
        this.productImage = productImage;
    }
    public Blob getProductImage() {
        return productImage;
    }
    
}
