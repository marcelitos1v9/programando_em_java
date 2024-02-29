/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package produtos;

import java.util.Scanner;

/**
 *
 * @author fatec-dsm2
 */
public class Produtos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        String nm_produto;
        int qtd_produto;
        double vlr_produto,total_pagar;

        System.out.println("Qualo o nome do produto? ");
        nm_produto = leia.nextLine();

        System.out.println("Qual a quantidade de produtos?");
        qtd_produto = leia.nextInt();

        System.out.println("Qual o valor do produto?");
        vlr_produto = leia.nextDouble();
        
        total_pagar = qtd_produto*vlr_produto;
        
        System.out.printf("Você esta prestes a comprar %d %s que o valor total é de : %.2f",qtd_produto,nm_produto, total_pagar);
        
    }

}
