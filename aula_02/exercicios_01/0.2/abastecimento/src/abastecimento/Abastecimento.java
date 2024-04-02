/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abastecimento;

import java.util.Scanner;

/**
 *
 * @author fatec-dsm2
 */
public class Abastecimento {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
         double abs_litro,valor_gas,valor_total;
         
         System.out.println("Digite a quantidade de litros a ser abastecido: ");
         abs_litro = leia.nextDouble();
         
         valor_gas = 5.39;
         
         valor_total = abs_litro*valor_gas;
         
         System.out.printf("O valor total a ser pago ser de %.2f",valor_total);
         
    }
    
}
