package it.aip.controller.test;

import it.aip.service.OrganicProductService;

import org.slim3.controller.Controller;
import org.slim3.controller.Navigation;
import org.slim3.util.RequestMap;

public class CreateOrganicProductController extends Controller {

    private OrganicProductService service = new OrganicProductService();
    
    @Override
    public Navigation run() throws Exception {
        
        // Invoco il servizio, passandogli la Map con i parametri della request
        service.createOrganicProduct(new RequestMap(request));
        
        return redirect(basePath);
    }
}
