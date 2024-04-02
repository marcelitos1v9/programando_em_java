/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numeros_multiplicar;

import java.util.Scanner;

/**
 *
 * @author fatec-dsm2
 */
public class Numeros_multiplicar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner leia = new Scanner(System.in);
       
       int num1,num2,mult1,mult2;
       
        System.out.println("Digite o primeiro número:");
        num1 = leia.nextInt();
        
        System.out.println("Digite o primeiro número:");
        num2 = leia.nextInt();
        
        mult1 = num1*3;
        mult2 = num2*2;
        
        System.out.printf("O primeiro número %d multiplicado por 3 é %d e o segundo numero: %d multipplicado por 2 é %d",num1,mult1,num2,mult2);
        
    }
    
}
