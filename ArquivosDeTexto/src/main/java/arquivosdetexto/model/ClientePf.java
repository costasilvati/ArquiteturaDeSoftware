/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arquivosdetexto.model;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author julianacostasilva
 */
public class ClientePf extends Cliente{
    private Date nascimento;
    private String cpf;
    SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
    
    public ClientePf(String nome, String cpf){
        super(nome);
        this.cpf = cpf;
    }

    public Date getNascimento() {
        return nascimento;
    }

    public void setNascimento(Date nascimento) {
        this.nascimento = nascimento;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    
    @Override
    public String toString() {
        return super.toString() + " nascimento=" + formato.format(nascimento) + "\n cpf=" + cpf + "\n";
    }
    
    
    
}
