package it.aip.controller;

import org.slim3.controller.Controller;
import org.slim3.controller.Navigation;

public class BiologicoController extends Controller {

    @Override
    public Navigation run() throws Exception {
        return forward("biologico.jsp");
    }
}
