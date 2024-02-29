/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package salario_mensal;

import java.util.Scanner;

/**
 *
 * @author fatec-dsm2
 */
public class Salario_mensal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        double sala_user,percentual,qtd_sal;
        
        
        System.out.println("Digite o sálario seu salario: ");
        sala_user = leia.nextDouble();
        
        System.out.println("Digite o percentual de reajuste: ");
        percentual = leia.nextDouble();
        
        qtd_sal = sala_user+(sala_user*percentual)/100;
        
        System.out.printf("O novo sálario é igual a %.2f",qtd_sal);
    }
    
}
