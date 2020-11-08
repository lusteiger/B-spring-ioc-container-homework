package com.thoughtworks.capability.demospringioccontainer;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

@Service
@Scope("prototype")
public class GreetingService {


    String sayHi() {
        System.out.println("GreetingService" + this.hashCode());
        return "hello world";
    }
}
