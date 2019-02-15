package de.sanqsuaspringframework.didemo.services;

import de.sanqsuaspringframework.didemo.repositories.IPrimaryGreetingRepository;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Primary
@Profile("de")
public class PrimaryGermanGreetingService implements IGreetingService{

    IPrimaryGreetingRepository iPrimaryGreetingRepository;

    public PrimaryGermanGreetingService(IPrimaryGreetingRepository iPrimaryGreetingRepository) {
        this.iPrimaryGreetingRepository = iPrimaryGreetingRepository;
    }


    @Override
    public String sayGreeting() {
        return iPrimaryGreetingRepository.getGermanGreeting();
    }
}
