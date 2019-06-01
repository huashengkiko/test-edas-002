package dxsads.dsadsd.sdsd.service.rest.api;

import dxsads.dsadsd.sdsd.domain.eo.Product;
import com.deepexi.util.config.Payload;

/**
 * 描述。
 * <p>
 * <br>==========================
 * <br> 公司：滴普科技
 * <br> 开发：hudong@deepexi.com
 * <br> 版本：1.0
 * <br> 创建时间：2018/4/28 14:08
 * <br>==========================
 */
public interface ProductRestService {

    Payload getProductList();

    Payload getProductById(Integer id);

    Payload createProduct(Product product);

    Payload updateProductById(Integer id, Product product);

    Payload deleteProductById(Integer id);
}
