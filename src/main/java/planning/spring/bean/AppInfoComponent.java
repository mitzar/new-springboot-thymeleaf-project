package planning.spring.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class AppInfoComponent {

    @Autowired
    private GreetingRepository repository;

    public void showAppInfo() {
        System.out.println("App name : " + repository.getAppName());
        System.out.println("Now is : " + repository.getSystemDateTime());
    }
}
