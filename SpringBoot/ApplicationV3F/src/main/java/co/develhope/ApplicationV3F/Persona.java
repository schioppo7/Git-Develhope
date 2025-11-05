package co.develhope.ApplicationV3F;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
@Entity
public class Persona {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Long id;
    private  String nome;

    public Persona() {}
    public Persona(String nome) {
        this.nome = nome; }

    public  Long getId() {
        return id; }
    public void setId(Long id) {
        this.id = id; }

    public String getNome() {
        return  nome; }
    public void setNome(String nome) {
        this.nome = nome;
    }

}
