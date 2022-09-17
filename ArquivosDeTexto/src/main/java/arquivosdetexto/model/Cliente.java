/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arquivosdetexto.model;

/**
 *
 * @author julianacostasilva
 */
public class Cliente {
    private String nome;
    private String fone;
    private String email;
    
    public Cliente(String nome){
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getFone() {
        return fone;
    }

    public void setFone(String fone) {
        this.fone = fone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String Email) {
        this.email = Email;
    }

    
    @Override
    public String toString() {
        return "Cliente: \n nome=" + nome + "\n fone=" + fone + "\n e-mail=" + email + "\n";
    }
    
    
    
}
