package de.sanqsuaspringframework.didemo.services;

import org.springframework.stereotype.Service;

@Service
public class ConstructorGreetingService implements IGreetingService{
    @Override
    public String sayGreeting() {
        return "Injected Via Constructor hello!";
    }
}
