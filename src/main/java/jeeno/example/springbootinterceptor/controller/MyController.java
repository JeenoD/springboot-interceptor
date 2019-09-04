package jeeno.example.springbootinterceptor.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Jeeno
 * @version 0.0.1
 * @date 2019/9/4 22:23
 */
@RestController
@Slf4j
@RequestMapping("/my")
public class MyController {

    @GetMapping("/call")
    public String call(){
        log.info("here is the call function.");
        return "call the func successfully.";
    }

    @GetMapping("/err")
    public String callWithException() throws Exception{
        log.info("throws exception during func.");
        throw new Exception("error here");
    }

}
