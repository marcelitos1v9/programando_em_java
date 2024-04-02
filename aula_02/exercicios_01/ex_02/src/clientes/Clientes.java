/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clientes;

/**
 *
 * @author fatec-dsm2
 */
public class Clientes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Dados_clientes cli = new Dados_clientes();
       cli.cadastrarCliente();
       cli.listarCliente();
    }
    
}
