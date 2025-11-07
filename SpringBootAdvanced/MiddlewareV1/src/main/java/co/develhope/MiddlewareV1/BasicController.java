package co.develhope.MiddlewareV1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@RestController
public class BasicController {

    @GetMapping("/time")
    public String getCurrenttime() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        return "Data attuale = " + LocalDateTime.now().format(formatter);
    }
}
