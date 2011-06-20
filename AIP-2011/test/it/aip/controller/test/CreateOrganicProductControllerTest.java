package it.aip.controller.test;

import it.aip.models.OrganicProduct;

import org.slim3.datastore.Datastore;
import org.slim3.tester.ControllerTestCase;
import org.junit.Test;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

public class CreateOrganicProductControllerTest extends ControllerTestCase {

    @Test
    public void run() throws Exception {
        tester.param("productName", "productTEST");
        tester.start("/test/createOrganicProduct");
        
        CreateOrganicProductController controller = tester.getController();
        assertThat(controller, is(notNullValue()));
        assertThat(tester.isRedirect(), is(true));
        assertThat(tester.getDestinationPath(), is("/test/"));
        
        OrganicProduct productStored = Datastore.query(OrganicProduct.class).asSingle();
        assertThat(productStored, is(notNullValue()));
        assertThat(productStored.getProductName(), is("productTEST"));
        
        
    }
}
