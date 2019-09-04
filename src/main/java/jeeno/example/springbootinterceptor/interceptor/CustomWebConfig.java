package jeeno.example.springbootinterceptor.interceptor;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import javax.annotation.Resource;

/**
 * CustomWebConfig used for all requests
 * @author Jeeno
 * @version 0.0.1
 * @date 2019/9/4 22:25
 */
@Component
public class CustomWebConfig implements WebMvcConfigurer {

    @Resource
    private MyWebInterceptor myWebInterceptor;

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(myWebInterceptor).addPathPatterns("/my/**");
//        // for more interceptor
//        registry.addInterceptor(new MyWebInterceptor()).addPathPatterns("/**");
    }

}
