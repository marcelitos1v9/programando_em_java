/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package area_retangulo;

import java.util.Scanner;

/**
 *
 * @author fatec-dsm2
 */
public class Area_retangulo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        double lado1, lado2, area, perimetro;

        System.out.println("Digite o valor do lado A :");
        lado1 = leia.nextDouble();

        System.out.println("Digite o valor do lado B :");
        lado2 = leia.nextDouble();
        
        area = lado1*lado2;
        
        perimetro = (2*lado1) + (2*lado2);
        
        System.out.printf("O valor da area do retangulo é %.2f e o perimetro é de %.2f",area,perimetro);
    }

}
