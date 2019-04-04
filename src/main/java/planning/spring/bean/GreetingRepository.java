package planning.spring.bean;

import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;

@Repository
public class GreetingRepository {

    public String getAppName() {
        return "Hello Spring App";
    }

    public LocalDateTime getSystemDateTime() {
        return LocalDateTime.now();
    }
}
