package co.develhope.DeployV1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class DeployV1Application extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(DeployV1Application.class, args);
	}

}
