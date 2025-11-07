package co.develhope.InjectionV1;

import org.springframework.stereotype.Service;

@Service
public class MyService {

    private MyComponent myComponent;

    public MyService(MyComponent myComponent) {
        System.out.println("Constructor Service");
        this.myComponent = myComponent;
    }

    public String getName() {
        System.out.println("MyService.getName()");
        return myComponent.getMyComponentName();
    }
}
