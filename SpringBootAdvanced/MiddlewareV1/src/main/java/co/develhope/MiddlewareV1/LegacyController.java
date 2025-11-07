package co.develhope.MiddlewareV1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LegacyController {

    @GetMapping("/legacy")
    public String getLegacy() {
        return "This is just old code";
    }
}
