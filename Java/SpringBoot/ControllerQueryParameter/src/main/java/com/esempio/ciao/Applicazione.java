package com.esempio.ciao;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
class Applicazione {
    public static void main(String[] args) {
        SpringApplication.run(Applicazione.class, args);
    }

    @RestController
    public static class ApplicazioneController {

        @GetMapping("/v1/ciao")
        public String ciao(@RequestParam String nome, @RequestParam String provincia) {
            return "Ciao " + nome + " com'è il tempo in " + provincia + "?";
        }
    }
}
