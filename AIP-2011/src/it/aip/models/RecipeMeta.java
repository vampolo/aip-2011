package it.aip.models;

//@javax.annotation.Generated(value = { "slim3-gen", "@VERSION@" }, date = "2011-06-18 21:11:14")
/** */
public final class RecipeMeta extends org.slim3.datastore.ModelMeta<it.aip.models.Recipe> {

    /** */
    public final org.slim3.datastore.CoreAttributeMeta<it.aip.models.Recipe, com.google.appengine.api.datastore.Key> key = new org.slim3.datastore.CoreAttributeMeta<it.aip.models.Recipe, com.google.appengine.api.datastore.Key>(this, "__key__", "key", com.google.appengine.api.datastore.Key.class);

    /** */
    public final org.slim3.datastore.StringUnindexedAttributeMeta<it.aip.models.Recipe> recipeDescription = new org.slim3.datastore.StringUnindexedAttributeMeta<it.aip.models.Recipe>(this, "recipeDescription", "recipeDescription");

    /** */
    public final org.slim3.datastore.StringAttributeMeta<it.aip.models.Recipe> recipeName = new org.slim3.datastore.StringAttributeMeta<it.aip.models.Recipe>(this, "recipeName", "recipeName");

    /** */
    public final org.slim3.datastore.StringAttributeMeta<it.aip.models.Recipe> recipeType = new org.slim3.datastore.StringAttributeMeta<it.aip.models.Recipe>(this, "recipeType", "recipeType");

    /** */
    public final org.slim3.datastore.StringCollectionAttributeMeta<it.aip.models.Recipe, java.util.List<java.lang.String>> relatedPhotos = new org.slim3.datastore.StringCollectionAttributeMeta<it.aip.models.Recipe, java.util.List<java.lang.String>>(this, "relatedPhotos", "relatedPhotos", java.util.List.class);

    private static final RecipeMeta slim3_singleton = new RecipeMeta();

    /**
     * @return the singleton
     */
    public static RecipeMeta get() {
       return slim3_singleton;
    }

    /** */
    public RecipeMeta() {
        super("Recipe", it.aip.models.Recipe.class);
    }

    @Override
    public it.aip.models.Recipe entityToModel(com.google.appengine.api.datastore.Entity entity) {
        it.aip.models.Recipe model = new it.aip.models.Recipe();
        model.setKey(entity.getKey());
        model.setRecipeDescription(textToString((com.google.appengine.api.datastore.Text) entity.getProperty("recipeDescription")));
        model.setRecipeName((java.lang.String) entity.getProperty("recipeName"));
        model.setRecipeType((java.lang.String) entity.getProperty("recipeType"));
        model.setRelatedPhotos(toList(java.lang.String.class, entity.getProperty("relatedPhotos")));
        return model;
    }

    @Override
    public com.google.appengine.api.datastore.Entity modelToEntity(java.lang.Object model) {
        it.aip.models.Recipe m = (it.aip.models.Recipe) model;
        com.google.appengine.api.datastore.Entity entity = null;
        if (m.getKey() != null) {
            entity = new com.google.appengine.api.datastore.Entity(m.getKey());
        } else {
            entity = new com.google.appengine.api.datastore.Entity(kind);
        }
        entity.setUnindexedProperty("recipeDescription", stringToText(m.getRecipeDescription()));
        entity.setProperty("recipeName", m.getRecipeName());
        entity.setProperty("recipeType", m.getRecipeType());
        entity.setProperty("relatedPhotos", m.getRelatedPhotos());
        return entity;
    }

    @Override
    protected com.google.appengine.api.datastore.Key getKey(Object model) {
        it.aip.models.Recipe m = (it.aip.models.Recipe) model;
        return m.getKey();
    }

    @Override
    protected void setKey(Object model, com.google.appengine.api.datastore.Key key) {
        validateKey(key);
        it.aip.models.Recipe m = (it.aip.models.Recipe) model;
        m.setKey(key);
    }

    @Override
    protected long getVersion(Object model) {
        throw new IllegalStateException("The version property of the model(it.aip.models.Recipe) is not defined.");
    }

    @Override
    protected void assignKeyToModelRefIfNecessary(com.google.appengine.api.datastore.AsyncDatastoreService ds, java.lang.Object model) {
    }

    @Override
    protected void incrementVersion(Object model) {
    }

    @Override
    protected void prePut(Object model) {
    }

    @Override
    public String getSchemaVersionName() {
        return "slim3.schemaVersion";
    }

    @Override
    public String getClassHierarchyListName() {
        return "slim3.classHierarchyList";
    }

    @Override
    protected boolean isCipherProperty(String propertyName) {
        return false;
    }

    @Override
    protected void modelToJson(org.slim3.datastore.json.JsonWriter writer, java.lang.Object model, int maxDepth, int currentDepth) {
        it.aip.models.Recipe m = (it.aip.models.Recipe) model;
        writer.beginObject();
        org.slim3.datastore.json.Default encoder0 = new org.slim3.datastore.json.Default();
        if(m.getKey() != null){
            writer.setNextPropertyName("key");
            encoder0.encode(writer, m.getKey());
        }
        if(m.getRecipeDescription() != null){
            writer.setNextPropertyName("recipeDescription");
            encoder0.encode(writer, m.getRecipeDescription());
        }
        if(m.getRecipeName() != null){
            writer.setNextPropertyName("recipeName");
            encoder0.encode(writer, m.getRecipeName());
        }
        if(m.getRecipeProductListRef() != null){
            writer.setNextPropertyName("recipeProductListRef");
            encoder0.encode(writer, m.getRecipeProductListRef());
        }
        if(m.getRecipeType() != null){
            writer.setNextPropertyName("recipeType");
            encoder0.encode(writer, m.getRecipeType());
        }
        if(m.getRelatedPhotos() != null){
            writer.setNextPropertyName("relatedPhotos");
            writer.beginArray();
            for(java.lang.String v : m.getRelatedPhotos()){
                encoder0.encode(writer, v);
            }
            writer.endArray();
        }
        writer.endObject();
    }

    @Override
    protected it.aip.models.Recipe jsonToModel(org.slim3.datastore.json.JsonRootReader rootReader, int maxDepth, int currentDepth) {
        it.aip.models.Recipe m = new it.aip.models.Recipe();
        org.slim3.datastore.json.JsonReader reader = null;
        org.slim3.datastore.json.Default decoder0 = new org.slim3.datastore.json.Default();
        reader = rootReader.newObjectReader("key");
        m.setKey(decoder0.decode(reader, m.getKey()));
        reader = rootReader.newObjectReader("recipeDescription");
        m.setRecipeDescription(decoder0.decode(reader, m.getRecipeDescription()));
        reader = rootReader.newObjectReader("recipeName");
        m.setRecipeName(decoder0.decode(reader, m.getRecipeName()));
        reader = rootReader.newObjectReader("recipeProductListRef");
        reader = rootReader.newObjectReader("recipeType");
        m.setRecipeType(decoder0.decode(reader, m.getRecipeType()));
        reader = rootReader.newObjectReader("relatedPhotos");
        {
            java.util.ArrayList<java.lang.String> elements = new java.util.ArrayList<java.lang.String>();
            org.slim3.datastore.json.JsonArrayReader r = rootReader.newArrayReader("relatedPhotos");
            if(r != null){
                reader = r;
                int n = r.length();
                for(int i = 0; i < n; i++){
                    r.setIndex(i);
                    java.lang.String v = decoder0.decode(reader, (java.lang.String)null)                    ;
                    if(v != null){
                        elements.add(v);
                    }
                }
                m.setRelatedPhotos(elements);
            }
        }
        return m;
    }
}