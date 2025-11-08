package co.develhope.CORSV1;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {


    @CrossOrigin(origins = "http://localhost:3000")
    @GetMapping("/custom")
    public String customEndpoint() {
        return "Benvenuto! Al mio programma.";
    }
}
