package lucas.springbootdvega;

import lucas.springbootdvega.config.Properties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableConfigurationProperties(Properties.class)
public class SpringBootDvegaApplication {

    @Autowired
    private Properties properties;

    public static void main(String[] args) {
        SpringApplication.run(SpringBootDvegaApplication.class, args);
        System.out.println("Welcome to the Reddit Clone via Dan Vega's Udemy class!");
    }

    @Bean
    CommandLineRunner runner() {
        return args -> {
            // Do something after start up, print welcome message from Properties class
            System.out.println("Welcome message: " + properties.getWelcomeMessage());
        };
    }
}
