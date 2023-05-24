package home.work.praka13;

import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class User {
    @Value("${app.student.name}")
    private String name;

    @PostConstruct
    public void init() {
        System.out.println(name);
    }
}
