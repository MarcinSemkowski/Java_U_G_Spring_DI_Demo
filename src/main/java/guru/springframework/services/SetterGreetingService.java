package guru.springframework.services;

import org.springframework.stereotype.Service;

@Service
public class SetterGreetingService implements GreetingService {

    private GreetingRepository greetingRepository;

    public SetterGreetingService(GreetingRepository greetingRepository) {
        this.greetingRepository = greetingRepository;
    }

    @Override
    public String sayGreeting() {
        return "Hello - I was injected by the getter";
    }
}