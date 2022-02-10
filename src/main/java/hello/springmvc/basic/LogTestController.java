package hello.springmvc.basic;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//@Slf4j
@RestController
public class LogTestController {
    private final Logger log = LoggerFactory.getLogger(getClass());

    @RequestMapping("/log-test")
    public String logTest() {

        String name = "Spring";

        System.out.println("LogTestController.logTest");

        log.trace("trace log ="+name);//더하기 연산을 사용하여 자원를 낭비하게 된다 사용x

        log.trace("trace log ={}",name);
        log.debug("debug log ={}",name);
        log.info("info log={}",name);
        log.warn("warn log ={}",name);
        log.error("error log ={}",name);

        return "OK";
    }
}
