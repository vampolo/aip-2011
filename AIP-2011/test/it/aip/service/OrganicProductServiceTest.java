package it.aip.service;

import it.aip.models.BioProducer;
import it.aip.models.OrganicProduct;

import java.util.HashMap;
import java.util.Map;

import org.slim3.datastore.Datastore;
import org.slim3.tester.AppEngineTestCase;
import org.junit.Test;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

public class OrganicProductServiceTest extends AppEngineTestCase {

    private OrganicProductService service = new OrganicProductService();

    @Test
    public void test() throws Exception {
        assertThat(service, is(notNullValue()));
    }
    
    @Test
    public void createOrganicProduct() throws Exception {
        Map<String, Object> input = new HashMap<String, Object>();
        input.put("productName", "productTEST");
        OrganicProduct productSubmitted = service.createOrganicProduct(input);
        assertThat(productSubmitted, is(notNullValue()));
        BioProducer producerStored = Datastore.get(BioProducer.class, productSubmitted.getKey());
        assertThat(producerStored.getProducerName(), is("productTEST"));
    }
}
