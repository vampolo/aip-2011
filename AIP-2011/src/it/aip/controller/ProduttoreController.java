package it.aip.controller;

import it.aip.models.BioProducer;
import it.aip.models.OrganicProduct;
import it.aip.service.BioProducerService;

import org.slim3.controller.Controller;
import org.slim3.controller.Navigation;

public class ProduttoreController extends Controller {

    private BioProducerService bps = new BioProducerService();

    @Override
    public Navigation run() throws Exception {
        String key = request.getParameter("key");
        BioProducer produttore = bps.getProducer(key);
        requestScope("produttore", produttore);
        
        String page = request.getParameter("page");
        if(page == null)
            page = "L'azienda";
            
        requestScope("page", page);

        return forward("produttore.jsp");
    }
}