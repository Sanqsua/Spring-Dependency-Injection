package de.sanqsuaspringframework.didemo.controllers;

import de.sanqsuaspringframework.didemo.services.IGreetingService;
import org.springframework.stereotype.Controller;

@Controller
public class MyController {

    IGreetingService iGreetingService;
    public MyController(IGreetingService iGreetingService) {
        this.iGreetingService = iGreetingService;
    }

    public String sayHello(){
        return iGreetingService.sayGreeting();
    }
}
