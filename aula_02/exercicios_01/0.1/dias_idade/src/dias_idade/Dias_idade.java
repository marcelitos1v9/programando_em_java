/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dias_idade;

import java.util.Scanner;

/**
 *
 * @author fatec-dsm2
 */
public class Dias_idade {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Scanner leia = new Scanner(System.in);
      int idade,dias_total;
      
      System.out.println("Digite a sua idade: ");
      idade = leia.nextInt();
      
      dias_total = idade*365;
        System.out.println("A quantidade de dias que você viveu é igual a: "+dias_total);
    }
    
}
