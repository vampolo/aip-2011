package it.aip.models;

//@javax.annotation.Generated(value = { "slim3-gen", "@VERSION@" }, date = "2011-06-16 18:33:49")
/** */
public final class BioProducerMeta extends org.slim3.datastore.ModelMeta<it.aip.models.BioProducer> {

    /** */
    public final org.slim3.datastore.StringAttributeMeta<it.aip.models.BioProducer> infoAzienda = new org.slim3.datastore.StringAttributeMeta<it.aip.models.BioProducer>(this, "infoAzienda", "infoAzienda");

    /** */
    public final org.slim3.datastore.CoreAttributeMeta<it.aip.models.BioProducer, com.google.appengine.api.datastore.Key> key = new org.slim3.datastore.CoreAttributeMeta<it.aip.models.BioProducer, com.google.appengine.api.datastore.Key>(this, "__key__", "key", com.google.appengine.api.datastore.Key.class);

    /** */
    public final org.slim3.datastore.StringAttributeMeta<it.aip.models.BioProducer> practicalInfo = new org.slim3.datastore.StringAttributeMeta<it.aip.models.BioProducer>(this, "practicalInfo", "practicalInfo");

    /** */
    public final org.slim3.datastore.StringAttributeMeta<it.aip.models.BioProducer> producerName = new org.slim3.datastore.StringAttributeMeta<it.aip.models.BioProducer>(this, "producerName", "producerName");

    /** */
    public final org.slim3.datastore.StringAttributeMeta<it.aip.models.BioProducer> productionMethod = new org.slim3.datastore.StringAttributeMeta<it.aip.models.BioProducer>(this, "productionMethod", "productionMethod");

    /** */
    public final org.slim3.datastore.StringCollectionAttributeMeta<it.aip.models.BioProducer, java.util.List<java.lang.String>> relatedPhotos = new org.slim3.datastore.StringCollectionAttributeMeta<it.aip.models.BioProducer, java.util.List<java.lang.String>>(this, "relatedPhotos", "relatedPhotos", java.util.List.class);

    /** */
    public final org.slim3.datastore.CollectionAttributeMeta<it.aip.models.BioProducer, java.util.List<com.google.appengine.api.datastore.Key>, com.google.appengine.api.datastore.Key> relatedProducts = new org.slim3.datastore.CollectionAttributeMeta<it.aip.models.BioProducer, java.util.List<com.google.appengine.api.datastore.Key>, com.google.appengine.api.datastore.Key>(this, "relatedProducts", "relatedProducts", java.util.List.class);

    private static final BioProducerMeta slim3_singleton = new BioProducerMeta();

    /**
     * @return the singleton
     */
    public static BioProducerMeta get() {
       return slim3_singleton;
    }

    /** */
    public BioProducerMeta() {
        super("BioProducer", it.aip.models.BioProducer.class);
    }

    @Override
    public it.aip.models.BioProducer entityToModel(com.google.appengine.api.datastore.Entity entity) {
        it.aip.models.BioProducer model = new it.aip.models.BioProducer();
        model.setInfoAzienda((java.lang.String) entity.getProperty("infoAzienda"));
        model.setKey(entity.getKey());
        model.setPracticalInfo((java.lang.String) entity.getProperty("practicalInfo"));
        model.setProducerName((java.lang.String) entity.getProperty("producerName"));
        model.setProductionMethod((java.lang.String) entity.getProperty("productionMethod"));
        model.setRelatedPhotos(toList(java.lang.String.class, entity.getProperty("relatedPhotos")));
        model.setRelatedProducts(toList(com.google.appengine.api.datastore.Key.class, entity.getProperty("relatedProducts")));
        return model;
    }

    @Override
    public com.google.appengine.api.datastore.Entity modelToEntity(java.lang.Object model) {
        it.aip.models.BioProducer m = (it.aip.models.BioProducer) model;
        com.google.appengine.api.datastore.Entity entity = null;
        if (m.getKey() != null) {
            entity = new com.google.appengine.api.datastore.Entity(m.getKey());
        } else {
            entity = new com.google.appengine.api.datastore.Entity(kind);
        }
        entity.setProperty("infoAzienda", m.getInfoAzienda());
        entity.setProperty("practicalInfo", m.getPracticalInfo());
        entity.setProperty("producerName", m.getProducerName());
        entity.setProperty("productionMethod", m.getProductionMethod());
        entity.setProperty("relatedPhotos", m.getRelatedPhotos());
        entity.setProperty("relatedProducts", m.getRelatedProducts());
        return entity;
    }

    @Override
    protected com.google.appengine.api.datastore.Key getKey(Object model) {
        it.aip.models.BioProducer m = (it.aip.models.BioProducer) model;
        return m.getKey();
    }

    @Override
    protected void setKey(Object model, com.google.appengine.api.datastore.Key key) {
        validateKey(key);
        it.aip.models.BioProducer m = (it.aip.models.BioProducer) model;
        m.setKey(key);
    }

    @Override
    protected long getVersion(Object model) {
        throw new IllegalStateException("The version property of the model(it.aip.models.BioProducer) is not defined.");
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
        it.aip.models.BioProducer m = (it.aip.models.BioProducer) model;
        writer.beginObject();
        org.slim3.datastore.json.Default encoder0 = new org.slim3.datastore.json.Default();
        if(m.getInfoAzienda() != null){
            writer.setNextPropertyName("infoAzienda");
            encoder0.encode(writer, m.getInfoAzienda());
        }
        if(m.getKey() != null){
            writer.setNextPropertyName("key");
            encoder0.encode(writer, m.getKey());
        }
        if(m.getPracticalInfo() != null){
            writer.setNextPropertyName("practicalInfo");
            encoder0.encode(writer, m.getPracticalInfo());
        }
        if(m.getProducerName() != null){
            writer.setNextPropertyName("producerName");
            encoder0.encode(writer, m.getProducerName());
        }
        if(m.getProductionMethod() != null){
            writer.setNextPropertyName("productionMethod");
            encoder0.encode(writer, m.getProductionMethod());
        }
        if(m.getRelatedPhotos() != null){
            writer.setNextPropertyName("relatedPhotos");
            writer.beginArray();
            for(java.lang.String v : m.getRelatedPhotos()){
                encoder0.encode(writer, v);
            }
            writer.endArray();
        }
        if(m.getRelatedProducts() != null){
            writer.setNextPropertyName("relatedProducts");
            writer.beginArray();
            for(com.google.appengine.api.datastore.Key v : m.getRelatedProducts()){
                encoder0.encode(writer, v);
            }
            writer.endArray();
        }
        writer.endObject();
    }

    @Override
    protected it.aip.models.BioProducer jsonToModel(org.slim3.datastore.json.JsonRootReader rootReader, int maxDepth, int currentDepth) {
        it.aip.models.BioProducer m = new it.aip.models.BioProducer();
        org.slim3.datastore.json.JsonReader reader = null;
        org.slim3.datastore.json.Default decoder0 = new org.slim3.datastore.json.Default();
        reader = rootReader.newObjectReader("infoAzienda");
        m.setInfoAzienda(decoder0.decode(reader, m.getInfoAzienda()));
        reader = rootReader.newObjectReader("key");
        m.setKey(decoder0.decode(reader, m.getKey()));
        reader = rootReader.newObjectReader("practicalInfo");
        m.setPracticalInfo(decoder0.decode(reader, m.getPracticalInfo()));
        reader = rootReader.newObjectReader("producerName");
        m.setProducerName(decoder0.decode(reader, m.getProducerName()));
        reader = rootReader.newObjectReader("productionMethod");
        m.setProductionMethod(decoder0.decode(reader, m.getProductionMethod()));
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
        reader = rootReader.newObjectReader("relatedProducts");
        {
            java.util.ArrayList<com.google.appengine.api.datastore.Key> elements = new java.util.ArrayList<com.google.appengine.api.datastore.Key>();
            org.slim3.datastore.json.JsonArrayReader r = rootReader.newArrayReader("relatedProducts");
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
                m.setRelatedProducts(elements);
            }
        }
        return m;
    }
}