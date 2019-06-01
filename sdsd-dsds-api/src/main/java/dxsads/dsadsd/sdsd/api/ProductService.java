package dxsads.dsadsd.sdsd.api;

import dxsads.dsadsd.sdsd.domain.eo.Product;

public interface ProductService {

    Object getProductList();

    Object getProductById(Integer id);

    Object createProduct(Product product);

    Object deleteProductById(Integer id);

}
