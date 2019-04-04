package planning.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import planning.spring.bean.AppInfoComponent;
import planning.spring.bean.GreetingService;
import planning.spring.config.AppConfiguration;
import planning.spring.lang.Language;

public class MainProgram {

    public static void main(String[] args) {

        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfiguration.class);
        Language language = (Language) context.getBean("language");
        System.out.println("----------------------------------------------");
        System.out.println("Bean Language : " + language);
        System.out.println("Call language sayBye() : " + language.getBye());
        System.out.println("----------------------------------------------");
        GreetingService service = (GreetingService) context.getBean("greeting²&²²Service");
        service.sayGreeting();
        System.out.println("----------------------------------------------");
        AppInfoComponent component = (AppInfoComponent) context.getBean("appInfoComponent");
        component.showAppInfo();
    }
}
