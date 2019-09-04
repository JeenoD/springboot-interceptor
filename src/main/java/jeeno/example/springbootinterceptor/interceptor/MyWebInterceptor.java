package jeeno.example.springbootinterceptor.interceptor;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * user-defined webInterceptor class
 * @author Jeeno
 * @version 0.0.1
 * @date 2019/9/4 22:29
 */
@Component
@Slf4j
public class MyWebInterceptor extends HandlerInterceptorAdapter {

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
            throws Exception {
        log.info("called before controller.");
        return super.preHandle(request, response, handler);
    }

    /**
     * called when controller finished without any exception
     */
    @Override
    public void postHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o,
                           ModelAndView modelAndView) throws Exception {
        log.info("called after controller(no exception).");
    }

    /**
     * called when controller finished, no matter whether it throws exception
     */
    @Override
    public void afterCompletion(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse,
                                Object o, Exception e) throws Exception {
        log.info("called anyway.");
    }

}
