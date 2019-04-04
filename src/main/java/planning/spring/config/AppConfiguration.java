package planning.spring.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import planning.spring.lang.Language;
import planning.spring.lang.impl.English;

@Configuration
@ComponentScan({"planning.spring.bean"})
public class AppConfiguration {

    @Bean(name = "language")
    public Language getLanguage() {
        return new English();
    }
}
