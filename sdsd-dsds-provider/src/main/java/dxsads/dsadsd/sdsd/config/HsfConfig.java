package dxsads.dsadsd.sdsd.config;

import com.alibaba.boot.hsf.annotation.HSFConsumer;
import org.springframework.context.annotation.Configuration;

/**
 * Created by donh on 2018/7/21.
 * 注解中的配置拥有最高的优先级
 * 在 Config 类里配置一次 @HSFConsumer ，然后在多处通过 @Autowired 注入使用
 */
@Configuration
public class HsfConfig {

//    @HSFConsumer
//    private UserService userService;

}