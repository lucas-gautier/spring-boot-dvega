package lucas.springbootdvega;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping("/")
    public String home() {
        return "Hello! This message is from the HomeController class -> home() method";
    }

    @GetMapping("/newpage")
    public String newpage() {
        return "This is from the HomeController class -> newpage() method";
    }
}
