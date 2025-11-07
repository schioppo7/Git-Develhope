package com.esempio.ciao;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.*;

@SpringBootApplication
class ApplicazioneV2 {
    public static void main(String[] args) {
        SpringApplication.run(ApplicazioneV2.class, args);
    }

    @RestController
    public static class ApplicazioneController {

        @GetMapping(value = "/v2/ciao/{provincia}")
        public Saluto ciao(@RequestParam String nome, @PathVariable String provincia) {
            Saluto risposta = new Saluto();
            risposta.setNome(nome);
            risposta.setProvincia(provincia);
            risposta.setSaluto("Ciao " + nome + ", com'è il tempo in " + provincia + "?");
            return risposta;
        }
    }
}

class Saluto {
    private String nome;
    private String provincia;
    private String saluto;

    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    public String getProvincia() { return provincia; }
    public void setProvincia(String provincia) { this.provincia = provincia; }

    public String getSaluto() { return saluto; }
    public void setSaluto(String saluto) { this.saluto = saluto; }
}



