/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fornecedores;

/**
 *
 * @author fatec-dsm2
 */
public class Fornecedores {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Fornecedores_c forn = new Fornecedores_c();
        forn.cadastrarFornecedor();
        forn.listarFornecedor();
    }
    
}
