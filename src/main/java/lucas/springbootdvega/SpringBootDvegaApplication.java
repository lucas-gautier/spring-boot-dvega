package lucas.springbootdvega;

import lucas.springbootdvega.config.Properties;
import lucas.springbootdvega.model.Comment;
import lucas.springbootdvega.model.Link;
import lucas.springbootdvega.repository.CommentRepository;
import lucas.springbootdvega.repository.LinkRepository;
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
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableConfigurationProperties(Properties.class)
@EnableJpaAuditing
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
//            String[] beans = applicationContext.getBeanDefinitionNames();
//            Arrays.sort(beans);
//            for(String bean: beans) {
//                System.out.println(bean);
//            }
            // Print logs via slf4j
            log.info("CommandLineRunner.run();");
        };
    }

    @Bean
    @Profile("dev")
    CommandLineRunner databaseRunner(LinkRepository linkRepository, CommentRepository commentRepository) {
        return args -> {
            Link link = new Link("Getting Started with Spring Boot 2", "https://link-to-site");
            linkRepository.save(link);
            Comment comment = new Comment("Spring Boot 2 is a really cool framework!", link);
            commentRepository.save(comment);
            // Ensure link is associated to comment
            // comment must be persisted to DB first, then relationship added
            link.addComment(comment);
        };
    }
}
