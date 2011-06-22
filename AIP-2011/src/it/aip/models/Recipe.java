package it.aip.models;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import com.google.appengine.api.datastore.Key;
import org.slim3.datastore.Attribute;
import org.slim3.datastore.InverseModelListRef;
import org.slim3.datastore.Model;

@Model
public class Recipe implements Serializable {

    private static final long serialVersionUID = 1L;

    @Attribute(primaryKey = true)
    private Key key;
    
    private String recipeName;              // nome della ricetta
    private String recipeType;              // tipo di ricetta
    
    @Attribute(lob = true)
    private List<ImageFile> images = new ArrayList<ImageFile>();         // immagini della ricetta
    
    // Riferimento ai prodotti (one-to-many)
    @Attribute(persistent = false)
    private InverseModelListRef<RecipeProduct, Recipe> recipeProductListRef
        = new InverseModelListRef<RecipeProduct, Recipe>(RecipeProduct.class,  "recipeRef", this);
  
    // relatedDiets;         // lista di diete correlate alla ricetta (MULTIPLE TOPIC NON IMPLEMENTATO)

    @Attribute(lob = true)
    private String recipeDescription;       // descrizione della ricetta
    

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
       
    public void setRecipeType(String recipeType) {
        this.recipeType = recipeType;
    }
        public String getRecipeType() {
        return recipeType;
    }
    
    public InverseModelListRef<RecipeProduct, Recipe> getRecipeProductListRef() {
        return recipeProductListRef;
    }
    
    public void setImages(List<ImageFile> images) {
        this.images = images;
    }
    public List<ImageFile> getImages() {
        return images;
    }
    
}
