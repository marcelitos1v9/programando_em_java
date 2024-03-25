/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package passagem2;

/**
 *
 * @author fatec-dsm2
 */
public class Passagem2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Passagens pas = new Passagens();
        
        pas.cadastrarDadosPassageiro();
        pas.mostrarDadosPassageiro();
        pas.cadastrarDadosViagem();
        pas.mostrarDadosViagem();
    }
    
}
