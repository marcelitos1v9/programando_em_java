/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nota_media;

import java.util.Scanner;

/**
 *
 * @author fatec-dsm2
 */
public class Nota_media {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        double nota1, nota2, nota3, nota4, nota5, nota6, media1, media2, soma;

        System.out.println("Digite a primeira nota: ");
        nota1 = leia.nextDouble();
        System.out.println("Digite a segunda nota: ");
        nota2 = leia.nextDouble();
        System.out.println("Digite a terceira nota: ");
        nota3 = leia.nextDouble();
        System.out.println("Digite a quarta nota: ");
        nota4 = leia.nextDouble();
        System.out.println("Digite a quinta nota: ");
        nota5 = leia.nextDouble();
        System.out.println("Digite a sexta nota: ");
        nota6 = leia.nextDouble();
        
        media1 = (nota1+nota2+nota3)/3;
        media2 = (nota4+nota5+nota6)/3;
        
        soma = media1+media2;
        
        System.out.println("A media 1 das notas é: "+media1+", a media 2 é: "+media2+", e a soma das médias é : "+soma);
    }

}
