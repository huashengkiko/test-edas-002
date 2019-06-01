package dxsads.dsadsd.sdsd.service.rest;

import com.deepexi.util.config.Payload;
import com.deepexi.util.constant.ContentType;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import dxsads.dsadsd.sdsd.api.ProductService;
import dxsads.dsadsd.sdsd.domain.eo.Product;
import dxsads.dsadsd.sdsd.service.rest.api.ProductRestService;

import javax.ws.rs.*;

@Service("productRestService")
@Path("/api/v1/products")
@Consumes({ContentType.APPLICATION_JSON_UTF_8, ContentType.TEXT_XML_UTF_8})
@Produces({ContentType.APPLICATION_JSON_UTF_8, ContentType.TEXT_XML_UTF_8})
public class ProductRestServiceImpl implements ProductRestService {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private ProductService productService;

    @GET
    @Path("/")
    public Payload getProductList() {
        return new Payload(productService.getProductList());
    }

    @GET
    @Path("{id : \\d+}")
    public Payload getProductById(@PathParam("id") Integer id) {
        return new Payload(productService.getProductById(id));
    }

    @POST
    @Path("/")
    public Payload createProduct(Product product) {
        return new Payload(productService.createProduct(product));
    }

    @PUT
    @Path("{id : \\d+}")
    public Payload updateProductById(@PathParam("id") Integer id, Product product) {
        return new Payload(null);
    }

    @DELETE
    @Path("{id : \\d+}")
    public Payload deleteProductById(@PathParam("id") Integer id) {
        return new Payload(productService.deleteProductById(id));
    }
}
