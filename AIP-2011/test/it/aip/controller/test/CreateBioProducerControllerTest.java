package it.aip.controller.test;

import it.aip.models.BioProducer;

import org.slim3.datastore.Datastore;
import org.slim3.tester.ControllerTestCase;
import org.junit.Test;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

public class CreateBioProducerControllerTest extends ControllerTestCase {

    @Test
    public void run() throws Exception {
        tester.param("producerName", "producerTEST");
        tester.start("/test/createBioProducer");
        
        CreateBioProducerController controller = tester.getController();
        assertThat(controller, is(notNullValue()));
        assertThat(tester.isRedirect(), is(true));
        assertThat(tester.getDestinationPath(), is("/test/"));
        
        BioProducer producerStored = Datastore.query(BioProducer.class).asSingle();
        assertThat(producerStored, is(notNullValue()));
        assertThat(producerStored.getProducerName(), is("producerTEST"));
    }
}
