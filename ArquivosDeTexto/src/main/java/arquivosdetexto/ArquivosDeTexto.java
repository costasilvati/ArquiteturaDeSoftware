/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package arquivosdetexto;

import arquivosdetexto.model.ContaCorrente;
import arquivosdetexto.model.ClientePf;
import arquivosdetexto.dao.ClientePfDao;
import arquivosdetexto.dao.ContaDao;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author julianacostasilva
 */
public class ArquivosDeTexto {

    public static void main(String[] args) {
        String opcao = "0";
        String textoMenu = "---- Menu ----- \n"
                + "Digite o código da opção desejada:\n \n"
                + "1 - Carregar Clinte \n"
                + "2 - Carregar Conta Corrente \n"
                + "3 - Cadastrar Cliente \n"
                + "4 - Cadastrar Conta Corrente \n"
                + "0 - Sair";
        ArrayList<ClientePf> listaClientes = new ArrayList<ClientePf> ();
        ArrayList<ContaCorrente> listaContas = new ArrayList<ContaCorrente> ();
                
        do {
            opcao = JOptionPane.showInputDialog(null,textoMenu);
            switch (opcao) {
                case "1":
                    ClientePfDao cliDao = new ClientePfDao();
                    listaClientes = cliDao.convertCsvClientePf();
                    String texto = "";
                    int i = 1;
                    for(ClientePf cli: listaClientes){
                        texto += ++i +" - "+ cli.toString();
                    }
                    JOptionPane.showMessageDialog(null, texto);
                    break;
                case "2":
                    if(listaClientes.size() >= 1){
                    ContaDao cd = new ContaDao();
                    listaContas = cd.convertCsvConta(listaClientes);
                    String textoConta = "";
                    int j = 1;
                    for(ContaCorrente conta: listaContas){
                        textoConta += ++j +" - "+ conta.toString();
                    }
                    JOptionPane.showMessageDialog(null, textoConta);
                    }else{
                        JOptionPane.showMessageDialog(null, "Carregue a lista de clientes ");
                    }
                    break;
                case "3":
                    JOptionPane.showMessageDialog(null, "Adicione o Cliente no arquivo e Carregue a lista de clientes ");
                    break;
                case "4":
                    JOptionPane.showMessageDialog(null, "Adicione o Cliente no arquivo e Carregue a lista de clientes ");
                    break;
                default:
                    JOptionPane.showMessageDialog(null,"O sistema será encerrado. \n Tchau!!");
            }
        } while (!opcao.equals("0"));
    }
}
