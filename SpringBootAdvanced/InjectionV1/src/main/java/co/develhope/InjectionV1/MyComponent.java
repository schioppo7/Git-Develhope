package co.develhope.InjectionV1;

import org.springframework.stereotype.Component;

@Component
public class MyComponent {

    private String myComponentName;

    public MyComponent() {
        System.out.println("Constructor Component");
        this.myComponentName = "Davide";
    }

    public String getMyComponentName() {
        System.out.println("MyComponent.getMyComponentName()");
        return this.myComponentName;
    }
}
