/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arquivosdetexto.dao;

import arquivosdetexto.model.ClientePf;
import java.io.File;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author julianacostasilva
 */
public class ClientePfDao {
    
    GerenciadorDeArquivo gf = new GerenciadorDeArquivo();
    SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
    
    public ArrayList<ClientePf> convertCsvClientePf(){
        File clientesFile = gf.openFile();
        ArrayList<ClientePf> listaClientes = new ArrayList<ClientePf> ();
        ArrayList<String> arquivo = gf.readFile(clientesFile);
        for(String linha: arquivo ){
            String[] itens = linha.split(",");
            ClientePf cliente = new ClientePf(itens[0].trim(), itens[3].trim());
            cliente.setEmail(itens[1].trim());
            cliente.setFone(itens[2].trim());
            try { // Tratando possível exeção de formatação
                cliente.setNascimento(formato.parse(itens[4]));
            } catch (ParseException ex) {
                System.out.println("Erro na data digitada o formato deve ser dd/mm/aaaa");
            }
            listaClientes.add(cliente);
        }
        return listaClientes;
    }
    
    
    
}
