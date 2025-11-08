package co.develhope.DeployV1;
import java.util.*;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControllerSomma {

    @GetMapping("/somma")
    public String getSomma() {
        Random random = new Random();
        int a = random.nextInt(101);
        int b = random.nextInt(101);
        int sum = a + b;
        return "La somma di " + a + " e " + b + "=" + sum;
    }
}
