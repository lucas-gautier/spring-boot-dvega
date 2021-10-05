package lucas.springbootdvega;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;


public class ExampleTest {

    @Test
    void printString() {
        System.out.println("Hello from the test");
        System.out.println("The test start up time seems longer than normal");
        System.out.println("The @SpringBootTest annotation causes a Spring Context to start up, delaying the test");
    }
}
