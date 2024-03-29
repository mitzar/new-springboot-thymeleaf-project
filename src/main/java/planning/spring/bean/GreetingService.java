package planning.spring.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import planning.spring.lang.Language;

@Service
public class GreetingService {

    @Autowired
    private Language language;

    public GreetingService() {
    }

    public void sayGreeting() {
        String greeting = language.getGreeting();
        System.out.println("Greeting : " + greeting);
    }
}
