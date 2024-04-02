/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package salario_minimo;

import java.util.Scanner;

/**
 *
 * @author fatec-dsm2
 */
public class Salario_minimo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        double sala_min, sala_user,qtd_sal;
        
        
        System.out.println("Digite o sálario minimo: ");
        sala_min = leia.nextDouble();
        
         System.out.println("Digite o sálario que recebe: ");
        sala_user = leia.nextDouble();
        
        qtd_sal = sala_user/sala_min;
        
        System.out.printf("Você recebe o equivalente a %.2f sálarios minimos",qtd_sal);
    }
    
}
