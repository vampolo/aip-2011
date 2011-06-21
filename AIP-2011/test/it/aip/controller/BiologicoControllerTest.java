package it.aip.controller;

import org.slim3.tester.ControllerTestCase;
import org.junit.Test;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

public class BiologicoControllerTest extends ControllerTestCase {

    @Test
    public void run() throws Exception {
        tester.start("/biologico");
        BiologicoController controller = tester.getController();
        assertThat(controller, is(notNullValue()));
        assertThat(tester.isRedirect(), is(false));
        assertThat(tester.getDestinationPath(), is("/biologico.jsp"));
    }
}
