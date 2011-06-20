package it.aip.service;

import it.aip.models.BioProducer;

import java.util.HashMap;
import java.util.Map;

import org.slim3.datastore.Datastore;
import org.slim3.tester.AppEngineTestCase;
import org.junit.Test;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

public class BioProducerServiceTest extends AppEngineTestCase {

    private BioProducerService service = new BioProducerService();

    @Test
    public void test() throws Exception {
        assertThat(service, is(notNullValue()));
    }
    
    @Test
    public void createBioProducer() throws Exception {
        Map<String, Object> input = new HashMap<String, Object>();
        input.put("producerName", "producerTEST");
        BioProducer producerSubmitted = service.createBioProducer(input);
        assertThat(producerSubmitted, is(notNullValue()));
        BioProducer producerStored = Datastore.get(BioProducer.class, producerSubmitted.getKey());
        assertThat(producerStored.getProducerName(), is("producerTEST"));
    }
}
