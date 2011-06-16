package it.aip.models;

//@javax.annotation.Generated(value = { "slim3-gen", "@VERSION@" }, date = "2011-06-16 18:38:28")
/** */
public final class OrganicProductMeta extends org.slim3.datastore.ModelMeta<it.aip.models.OrganicProduct> {

    /** */
    public final org.slim3.datastore.StringAttributeMeta<it.aip.models.OrganicProduct> generalInfo = new org.slim3.datastore.StringAttributeMeta<it.aip.models.OrganicProduct>(this, "generalInfo", "generalInfo");

    /** */
    public final org.slim3.datastore.StringAttributeMeta<it.aip.models.OrganicProduct> healthBenefits = new org.slim3.datastore.StringAttributeMeta<it.aip.models.OrganicProduct>(this, "healthBenefits", "healthBenefits");

    /** */
    public final org.slim3.datastore.CoreAttributeMeta<it.aip.models.OrganicProduct, com.google.appengine.api.datastore.Key> key = new org.slim3.datastore.CoreAttributeMeta<it.aip.models.OrganicProduct, com.google.appengine.api.datastore.Key>(this, "__key__", "key", com.google.appengine.api.datastore.Key.class);

    /** */
    public final org.slim3.datastore.CollectionAttributeMeta<it.aip.models.OrganicProduct, java.util.List<com.google.appengine.api.datastore.Key>, com.google.appengine.api.datastore.Key> offersList = new org.slim3.datastore.CollectionAttributeMeta<it.aip.models.OrganicProduct, java.util.List<com.google.appengine.api.datastore.Key>, com.google.appengine.api.datastore.Key>(this, "offersList", "offersList", java.util.List.class);

    /** */
    public final org.slim3.datastore.CoreAttributeMeta<it.aip.models.OrganicProduct, com.google.appengine.api.datastore.Key> producer = new org.slim3.datastore.CoreAttributeMeta<it.aip.models.OrganicProduct, com.google.appengine.api.datastore.Key>(this, "producer", "producer", com.google.appengine.api.datastore.Key.class);

    /** */
    public final org.slim3.datastore.StringAttributeMeta<it.aip.models.OrganicProduct> productImage = new org.slim3.datastore.StringAttributeMeta<it.aip.models.OrganicProduct>(this, "productImage", "productImage");

    /** */
    public final org.slim3.datastore.StringAttributeMeta<it.aip.models.OrganicProduct> productName = new org.slim3.datastore.StringAttributeMeta<it.aip.models.OrganicProduct>(this, "productName", "productName");

    /** */
    public final org.slim3.datastore.CollectionAttributeMeta<it.aip.models.OrganicProduct, java.util.List<com.google.appengine.api.datastore.Key>, com.google.appengine.api.datastore.Key> relatedDiets = new org.slim3.datastore.CollectionAttributeMeta<it.aip.models.OrganicProduct, java.util.List<com.google.appengine.api.datastore.Key>, com.google.appengine.api.datastore.Key>(this, "relatedDiets", "relatedDiets", java.util.List.class);

    /** */
    public final org.slim3.datastore.CollectionAttributeMeta<it.aip.models.OrganicProduct, java.util.List<com.google.appengine.api.datastore.Key>, com.google.appengine.api.datastore.Key> relatedRecipes = new org.slim3.datastore.CollectionAttributeMeta<it.aip.models.OrganicProduct, java.util.List<com.google.appengine.api.datastore.Key>, com.google.appengine.api.datastore.Key>(this, "relatedRecipes", "relatedRecipes", java.util.List.class);

    private static final OrganicProductMeta slim3_singleton = new OrganicProductMeta();

    /**
     * @return the singleton
     */
    public static OrganicProductMeta get() {
       return slim3_singleton;
    }

    /** */
    public OrganicProductMeta() {
        super("OrganicProduct", it.aip.models.OrganicProduct.class);
    }

    @Override
    public it.aip.models.OrganicProduct entityToModel(com.google.appengine.api.datastore.Entity entity) {
        it.aip.models.OrganicProduct model = new it.aip.models.OrganicProduct();
        model.setGeneralInfo((java.lang.String) entity.getProperty("generalInfo"));
        model.setHealthBenefits((java.lang.String) entity.getProperty("healthBenefits"));
        model.setKey(entity.getKey());
        model.setOffersList(toList(com.google.appengine.api.datastore.Key.class, entity.getProperty("offersList")));
        model.setProducer((com.google.appengine.api.datastore.Key) entity.getProperty("producer"));
        model.setProductImage((java.lang.String) entity.getProperty("productImage"));
        model.setProductName((java.lang.String) entity.getProperty("productName"));
        model.setRelatedDiets(toList(com.google.appengine.api.datastore.Key.class, entity.getProperty("relatedDiets")));
        model.setRelatedRecipes(toList(com.google.appengine.api.datastore.Key.class, entity.getProperty("relatedRecipes")));
        return model;
    }

    @Override
    public com.google.appengine.api.datastore.Entity modelToEntity(java.lang.Object model) {
        it.aip.models.OrganicProduct m = (it.aip.models.OrganicProduct) model;
        com.google.appengine.api.datastore.Entity entity = null;
        if (m.getKey() != null) {
            entity = new com.google.appengine.api.datastore.Entity(m.getKey());
        } else {
            entity = new com.google.appengine.api.datastore.Entity(kind);
        }
        entity.setProperty("generalInfo", m.getGeneralInfo());
        entity.setProperty("healthBenefits", m.getHealthBenefits());
        entity.setProperty("offersList", m.getOffersList());
        entity.setProperty("producer", m.getProducer());
        entity.setProperty("productImage", m.getProductImage());
        entity.setProperty("productName", m.getProductName());
        entity.setProperty("relatedDiets", m.getRelatedDiets());
        entity.setProperty("relatedRecipes", m.getRelatedRecipes());
        return entity;
    }

    @Override
    protected com.google.appengine.api.datastore.Key getKey(Object model) {
        it.aip.models.OrganicProduct m = (it.aip.models.OrganicProduct) model;
        return m.getKey();
    }

    @Override
    protected void setKey(Object model, com.google.appengine.api.datastore.Key key) {
        validateKey(key);
        it.aip.models.OrganicProduct m = (it.aip.models.OrganicProduct) model;
        m.setKey(key);
    }

    @Override
    protected long getVersion(Object model) {
        throw new IllegalStateException("The version property of the model(it.aip.models.OrganicProduct) is not defined.");
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
        it.aip.models.OrganicProduct m = (it.aip.models.OrganicProduct) model;
        writer.beginObject();
        org.slim3.datastore.json.Default encoder0 = new org.slim3.datastore.json.Default();
        if(m.getGeneralInfo() != null){
            writer.setNextPropertyName("generalInfo");
            encoder0.encode(writer, m.getGeneralInfo());
        }
        if(m.getHealthBenefits() != null){
            writer.setNextPropertyName("healthBenefits");
            encoder0.encode(writer, m.getHealthBenefits());
        }
        if(m.getKey() != null){
            writer.setNextPropertyName("key");
            encoder0.encode(writer, m.getKey());
        }
        if(m.getOffersList() != null){
            writer.setNextPropertyName("offersList");
            writer.beginArray();
            for(com.google.appengine.api.datastore.Key v : m.getOffersList()){
                encoder0.encode(writer, v);
            }
            writer.endArray();
        }
        if(m.getProducer() != null){
            writer.setNextPropertyName("producer");
            encoder0.encode(writer, m.getProducer());
        }
        if(m.getProductImage() != null){
            writer.setNextPropertyName("productImage");
            encoder0.encode(writer, m.getProductImage());
        }
        if(m.getProductName() != null){
            writer.setNextPropertyName("productName");
            encoder0.encode(writer, m.getProductName());
        }
        if(m.getRelatedDiets() != null){
            writer.setNextPropertyName("relatedDiets");
            writer.beginArray();
            for(com.google.appengine.api.datastore.Key v : m.getRelatedDiets()){
                encoder0.encode(writer, v);
            }
            writer.endArray();
        }
        if(m.getRelatedRecipes() != null){
            writer.setNextPropertyName("relatedRecipes");
            writer.beginArray();
            for(com.google.appengine.api.datastore.Key v : m.getRelatedRecipes()){
                encoder0.encode(writer, v);
            }
            writer.endArray();
        }
        writer.endObject();
    }

    @Override
    protected it.aip.models.OrganicProduct jsonToModel(org.slim3.datastore.json.JsonRootReader rootReader, int maxDepth, int currentDepth) {
        it.aip.models.OrganicProduct m = new it.aip.models.OrganicProduct();
        org.slim3.datastore.json.JsonReader reader = null;
        org.slim3.datastore.json.Default decoder0 = new org.slim3.datastore.json.Default();
        reader = rootReader.newObjectReader("generalInfo");
        m.setGeneralInfo(decoder0.decode(reader, m.getGeneralInfo()));
        reader = rootReader.newObjectReader("healthBenefits");
        m.setHealthBenefits(decoder0.decode(reader, m.getHealthBenefits()));
        reader = rootReader.newObjectReader("key");
        m.setKey(decoder0.decode(reader, m.getKey()));
        reader = rootReader.newObjectReader("offersList");
        {
            java.util.ArrayList<com.google.appengine.api.datastore.Key> elements = new java.util.ArrayList<com.google.appengine.api.datastore.Key>();
            org.slim3.datastore.json.JsonArrayReader r = rootReader.newArrayReader("offersList");
            if(r != null){
                reader = r;
                int n = r.length();
                for(int i = 0; i < n; i++){
                    r.setIndex(i);
                    com.google.appengine.api.datastore.Key v = decoder0.decode(reader, (com.google.appengine.api.datastore.Key)null)                    ;
                    if(v != null){
                        elements.add(v);
                    }
                }
                m.setOffersList(elements);
            }
        }
        reader = rootReader.newObjectReader("producer");
        m.setProducer(decoder0.decode(reader, m.getProducer()));
        reader = rootReader.newObjectReader("productImage");
        m.setProductImage(decoder0.decode(reader, m.getProductImage()));
        reader = rootReader.newObjectReader("productName");
        m.setProductName(decoder0.decode(reader, m.getProductName()));
        reader = rootReader.newObjectReader("relatedDiets");
        {
            java.util.ArrayList<com.google.appengine.api.datastore.Key> elements = new java.util.ArrayList<com.google.appengine.api.datastore.Key>();
            org.slim3.datastore.json.JsonArrayReader r = rootReader.newArrayReader("relatedDiets");
            if(r != null){
                reader = r;
                int n = r.length();
                for(int i = 0; i < n; i++){
                    r.setIndex(i);
                    com.google.appengine.api.datastore.Key v = decoder0.decode(reader, (com.google.appengine.api.datastore.Key)null)                    ;
                    if(v != null){
                        elements.add(v);
                    }
                }
                m.setRelatedDiets(elements);
            }
        }
        reader = rootReader.newObjectReader("relatedRecipes");
        {
            java.util.ArrayList<com.google.appengine.api.datastore.Key> elements = new java.util.ArrayList<com.google.appengine.api.datastore.Key>();
            org.slim3.datastore.json.JsonArrayReader r = rootReader.newArrayReader("relatedRecipes");
            if(r != null){
                reader = r;
                int n = r.length();
                for(int i = 0; i < n; i++){
                    r.setIndex(i);
                    com.google.appengine.api.datastore.Key v = decoder0.decode(reader, (com.google.appengine.api.datastore.Key)null)                    ;
                    if(v != null){
                        elements.add(v);
                    }
                }
                m.setRelatedRecipes(elements);
            }
        }
        return m;
    }
}