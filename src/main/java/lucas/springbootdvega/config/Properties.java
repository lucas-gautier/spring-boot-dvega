package lucas.springbootdvega.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties("springbootdvega")
@Data
public class Properties {

    /**
     *  This is our welcome message.
     */
    private String welcomeMessage = "Hi Amanda! Love you!";
}
