/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arquivosdetexto.model;

/**
 *
 * @author julianacostasilva
 */
public class ContaCorrente {
    private Cliente titular;
    private String agencia;
    private String conta;
    private double saldo;
    private double limite;

    public ContaCorrente(Cliente titular) {
        this.titular = titular;
    }

    
    
    public Cliente getTitular() {
        return titular;
    }

    public void setTitular(Cliente titular) {
        this.titular = titular;
    }

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public String getConta() {
        return conta;
    }

    public void setConta(String conta) {
        this.conta = conta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

    @Override
    public String toString() {
        return "Conta{" + "titular=" + titular + ", agencia=" + agencia + ", conta=" + conta + ", saldo=" + saldo + ", limite=" + limite + "\n";
    }
    
    
    
}
