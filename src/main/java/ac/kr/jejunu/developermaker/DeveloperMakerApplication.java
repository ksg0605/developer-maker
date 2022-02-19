package ac.kr.jejunu.developermaker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
@SpringBootApplication
public class DeveloperMakerApplication {

    public static void main(String[] args) {
        SpringApplication.run(DeveloperMakerApplication.class, args);
    }

}
