package it.aip.models;

import java.io.Serializable;
import java.util.List;

import com.google.appengine.api.datastore.Key;
import org.slim3.datastore.Attribute;
import org.slim3.datastore.Model;

@Model
public class Recipe implements Serializable {

    @Attribute(primaryKey = true)
    private Key key;
    
    private String recipeName;              // nome della ricetta
    private List<Key> relatedProducts;      // lista di prodotti contenuti
    private List<Key> relatedDiets;         // lista di diete correlate alla ricetta
    private String recipeDescription;       // descrizione della ricetta
    private List<String> relatedPhotos;     // (OPZIONALE) lista di foto
    
    public void setKey(Key key) {
        this.key = key;
    }
    public Key getKey() {
        return key;
    }
    
    public void setRecipeName(String recipeName) {
        this.recipeName = recipeName;
    }
    public String getRecipeName() {
        return recipeName;
    }
    
    public void setRelatedProducts(List<Key> relatedProducts) {
        this.relatedProducts = relatedProducts;
    }
    public List<Key> getRelatedProducts() {
        return relatedProducts;
    }
    
    public void setRelatedDiets(List<Key> relatedDiets) {
        this.relatedDiets = relatedDiets;
    }
    public List<Key> getRelatedDiets() {
        return relatedDiets;
    }
    
    public void setRecipeDescription(String recipeDescription) {
        this.recipeDescription = recipeDescription;
    }
    public String getRecipeDescription() {
        return recipeDescription;
    }
    
    public void setRelatedPhotos(List<String> relatedPhotos) {
        this.relatedPhotos = relatedPhotos;
    }
    public List<String> getRelatedPhotos() {
        return relatedPhotos;
    }
    
}
