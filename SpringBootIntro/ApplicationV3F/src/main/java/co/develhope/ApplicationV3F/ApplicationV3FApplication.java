package co.develhope.ApplicationV3F;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import java.util.Optional;

@SpringBootApplication
public class ApplicationV3FApplication {

    public static void main(String[] args) {
        SpringApplication.run(ApplicationV3FApplication.class, args);
    }

    @Bean
    public CommandLineRunner initDatabase(RepositoryPersona repository) {
        return args -> {
            repository.save(new Persona("Simone"));
            repository.save(new Persona("Davide"));
            repository.save(new Persona("Gabriel"));
        };
    }
}

@RestController
class ControllerDataBase {

    @Autowired
    private RepositoryPersona repositoryPersona;

    @GetMapping(value = "/v3/ciao/{id}")
    public Object ciao(@PathVariable Long id) {
        Optional<Persona> persona = repositoryPersona.findById(id);

        if (persona.isPresent()) {
            return persona.get();
        } else {
            return "Id " + id + " non trovato.";
        }
    }
}

