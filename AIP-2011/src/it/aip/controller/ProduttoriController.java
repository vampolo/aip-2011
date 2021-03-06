package it.aip.controller;


import java.util.List;

import it.aip.service.BioProducerService;
import it.aip.models.*;

import org.slim3.controller.Controller;
import org.slim3.controller.Navigation;

public class ProduttoriController extends Controller {

    private BioProducerService bps = new BioProducerService();
   
    
    @Override
    public Navigation run() throws Exception {
        
        List<BioProducer> produttori = bps.getAllBioProducers(); 
        requestScope("produttori", produttori);

        return forward("produttori.jsp");
    }
}
