/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arquivosdetexto.dao;

import arquivosdetexto.model.ClientePf;
import arquivosdetexto.model.ContaCorrente;
import java.io.File;
import java.util.ArrayList;

/**
 *
 * @author julianacostasilva
 */
public class ContaDao {
    GerenciadorDeArquivo gf = new GerenciadorDeArquivo();
    
    public ArrayList<ContaCorrente> convertCsvConta(ArrayList<ClientePf> clientes){
        File contasFile = gf.openFile();
        ArrayList<ContaCorrente> listaConta = new ArrayList<> ();
        ArrayList<String> arquivo = gf.readFile(contasFile);
        
        for(String linha: arquivo ){
            
            String[] itens = linha.split(",");
            ClientePf clienteConta = null;
            for(ClientePf c: clientes){
                if(!c.getCpf().equals(itens[0].trim())){
                    System.out.println("CPF: " + itens[0] + "não encontrado");
                } else {
                    clienteConta = c;
                }
            }
            if(clienteConta != null){
                ContaCorrente conta = new ContaCorrente(clienteConta);
                conta.setAgencia(itens[2].trim());
                conta.setConta(itens[1].trim());
                conta.setLimite(Double.parseDouble(itens[4].trim()));
                conta.setSaldo(Double.parseDouble(itens[3].trim()));
            listaConta.add(conta);
            }
        }
        return listaConta;
    }
    
}
