package co.develhope.InjectionV1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

    private MyService myService;

    public MyController(MyService myService) {
        System.out.println("Constructor Controller");
        this.myService = myService;
    }

    @GetMapping("/getName")
    public String getNameEP() {
        return " "  + myService.getName();
    }

    @GetMapping("/")
    public String welcomeMessage() {
        return "Welcome to my Program, to continue do /getName in the url";
    }
}
