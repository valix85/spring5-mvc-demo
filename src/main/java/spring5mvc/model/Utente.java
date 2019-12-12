package spring5mvc.model;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class Utente {

    @Size(min = 1, message = "Lunghezza campo non valida")
    private String nome;

    @Size(min = 1, max = 30, message = "{utente.cognome.invalid}")
    private String cognome;

    private String email;

    public Utente(){}
    public Utente(String nome, String cognome, String email) {
        this.nome = nome;
        this.cognome = cognome;
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Utente{" +
                "nome='" + nome + '\'' +
                ", cognome='" + cognome + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}//end class
