package it.aip.models;

import java.io.Serializable;
import org.slim3.datastore.Attribute;
import org.slim3.datastore.Model;
import org.slim3.datastore.ModelRef;

import com.google.appengine.api.datastore.Key;

@Model
public class RecipeProduct implements Serializable {

    private static final long serialVersionUID = 1L;

    @Attribute(primaryKey = true)
    private Key key;

    // Riferimento alla ricetta
    private ModelRef<Recipe> recipeRef = new ModelRef<Recipe>(Recipe.class);
    
    // Riferimento al prodotto
    private ModelRef<OrganicProduct> productRef = new ModelRef<OrganicProduct>(OrganicProduct.class);

    
    public RecipeProduct() {
        super();
    }
    public RecipeProduct(Key key, ModelRef<Recipe> recipeRef,
            ModelRef<OrganicProduct> productRef) {
        super();
        this.key = key;
        this.recipeRef = recipeRef;
        this.productRef = productRef;
    }

    public void setKey(Key key) {
        this.key = key;
    }

    public Key getKey() {
        return key;
    }

    public ModelRef<Recipe> getRecipeRef() {
        return recipeRef;
    }
    
    public ModelRef<OrganicProduct> getProductRef() {
        return productRef;
    }

}
