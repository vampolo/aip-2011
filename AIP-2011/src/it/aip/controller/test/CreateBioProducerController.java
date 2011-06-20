package it.aip.controller.test;

import org.slim3.controller.Controller;
import org.slim3.controller.Navigation;

import org.slim3.util.RequestMap;

import it.aip.service.BioProducerService;

public class CreateBioProducerController extends Controller {

    private BioProducerService service = new BioProducerService();
    
    @Override
    public Navigation run() throws Exception {
        
        // Invoco il servizio, passandogli la Map con i parametri della request
        service.createBioProducer(new RequestMap(request));
        
        return redirect(basePath);
    }
}
