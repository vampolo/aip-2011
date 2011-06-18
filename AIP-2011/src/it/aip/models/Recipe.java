package it.aip.models;

import java.io.Serializable;
import java.util.List;

import com.google.appengine.api.datastore.Key;
import org.slim3.datastore.Attribute;
import org.slim3.datastore.InverseModelListRef;
import org.slim3.datastore.Model;

@SuppressWarnings("serial")
@Model
public class Recipe implements Serializable {

    @Attribute(primaryKey = true)
    private Key key;
    
    private String recipeName;              // nome della ricetta
    private String recipeType;              // tipo di ricetta
    private List<String> relatedPhotos;     // (OPZIONALE) lista di foto
    
    // Riferimento ai prodotti (one-to-many)
    @Attribute(persistent = false)
    private InverseModelListRef<RecipeProduct, Recipe> recipeProductListRef
        = new InverseModelListRef<RecipeProduct, Recipe>(RecipeProduct.class,  "recipeRef", this);
  
    // relatedDiets;         // lista di diete correlate alla ricetta (MULTIPLE TOPIC NON IMPLEMENTATO)

    @Attribute(lob = true)
    private String recipeDescription;       // descrizione della ricetta
    
    
    public Recipe() {
        super();
    }
    public Recipe(Key key, String recipeName, String recipeType,
            List<String> relatedPhotos,
            InverseModelListRef<RecipeProduct, Recipe> recipeProductListRef,
            String recipeDescription) {
        super();
        this.key = key;
        this.recipeName = recipeName;
        this.recipeType = recipeType;
        this.relatedPhotos = relatedPhotos;
        this.recipeProductListRef = recipeProductListRef;
        this.recipeDescription = recipeDescription;
    }

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
    
    public void setRecipeType(String recipeType) {
        this.recipeType = recipeType;
    }
        public String getRecipeType() {
        return recipeType;
    }
    
    public InverseModelListRef<RecipeProduct, Recipe> getRecipeProductListRef() {
        return recipeProductListRef;
    }
    
}
