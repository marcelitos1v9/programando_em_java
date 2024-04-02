/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package loja_moveis;

import java.util.Scanner;

/**
 *
 * @author fatec-dsm2
 */
public class Loja_moveis {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        
        int salario,bonus_venda,qtd_vendas,bonus,salario_total,total;
        
        salario = 1000;
        bonus_venda = 50;
        
        System.out.println("Digite a quantidade de moveis que o vendedor vendeu este mês:");
        qtd_vendas = leia.nextInt();
        
        bonus = qtd_vendas * bonus_venda;
        salario_total = bonus+salario;
        
        System.out.printf("O valor total de salario do funcionario é de : %d",salario_total);
    }
    
}
