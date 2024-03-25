/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projeto_entrada_dados;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author fatec-dsm2
 */
public class Projeto_entrada_dados {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     //declaração de variaveis
        double num1,num2,divisao,mult,soma,sub;
        
     //biblioteca para leitura dos dados
        
        Scanner leia = new Scanner(System.in);
        //comando escreva
        System.out.println("Digite o primeiro valor: ");
        //comando leia
        num1 = leia.nextDouble();
        
        System.out.println("Digite o segundo valor: ");
        num2 = leia.nextDouble();
        
        //soma
        soma = num1 + num2;
        
        System.out.println("O resultado da soma é: "+soma);
        
        //subtração
        sub = num1-num2;
        
        System.out.println("O resultado da subtração é : "+sub);
        
        //multiplicacao
        
        mult = num1*num2;
        
        System.out.println("O resultado da multiplicação é : "+mult);
        
        //divisao
         divisao = num1/num2;
         //forma de arredondar
       //DecimalFormat deci = new DecimalFormat("0.00");
        //System.out.println("O resultado da divisao é : "+ deci.format(divisao));
         
         //forma mais simples
         System.out.printf("O resultado da divisao é %.2f: ", divisao );
        
        
        
    }
    
}
