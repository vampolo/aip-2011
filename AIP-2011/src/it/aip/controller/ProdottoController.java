package it.aip.controller;

import it.aip.models.OrganicProduct;
import it.aip.service.OrganicProductService;

import org.slim3.controller.Controller;
import org.slim3.controller.Navigation;

public class ProdottoController extends Controller {

    private OrganicProductService ops = new OrganicProductService();

    @Override
    public Navigation run() throws Exception {
        String key = request.getParameter("key");
        OrganicProduct product = ops.getProduct(key);
        requestScope("prodotto", product);
        return forward("prodotto.jsp");
    }
}