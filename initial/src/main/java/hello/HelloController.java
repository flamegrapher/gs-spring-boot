package hello;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class HelloController {

    private MyConfiguration config;

    @RequestMapping("/")
    public String index() {
        return "Greetings from Spring Boot: " + config.getDummyBean().getMessage();
    }

    @Autowired
    public void setConfig(MyConfiguration conf) {
        this.config = conf;
    }
}
