package com.thoughtworks.capability.demospringioccontainer;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Scope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Scope("singleton")
public class GreetingController {

    private final ApplicationContext applicationContext;

    public GreetingController(ApplicationContext applicationContext) {
        this.applicationContext = applicationContext;
    }

    @GetMapping("/greet")
    public String greet() {
        GreetingService greetingService = applicationContext.getBean(GreetingService.class);
        return greetingService.sayHi();
    }

}
