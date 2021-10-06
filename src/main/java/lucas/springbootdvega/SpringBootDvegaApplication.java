package lucas.springbootdvega;

import lucas.springbootdvega.config.Properties;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Profile;
import org.springframework.context.ApplicationContext;

import java.util.Arrays;

@SpringBootApplication
@EnableConfigurationProperties(Properties.class)
public class SpringBootDvegaApplication {

    @Autowired
    private Properties properties;

    @Autowired
    private ApplicationContext applicationContext;

    public static final Logger log = LoggerFactory.getLogger(SpringBootDvegaApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(SpringBootDvegaApplication.class, args);
        System.out.println("Welcome to the Reddit Clone via Dan Vega's Udemy class!");
    }

    @Bean
    @Profile("dev")
    CommandLineRunner runner() {
        return args -> {
            // Do something after start up, print welcome message from Properties class
            System.out.println("Welcome message: " + properties.getWelcomeMessage());

            // Print out all bean names in application context
            String[] beans = applicationContext.getBeanDefinitionNames();
            Arrays.sort(beans);
            for(String bean: beans) {
                System.out.println(bean);
            }

            // Print logs via slf4j
            log.info("CommandLineRunner.run();");
        };
    }
}
