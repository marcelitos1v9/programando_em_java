import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author marce
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        quadrado quad = new quadrado();
        int escolha;
        double lado;

        do {
            escolha = Integer.parseInt(JOptionPane.showInputDialog("Selecione uma opção:\n"
                    + "1. Calcular Área\n"
                    + "2. Calcular Perímetro\n"
                    + "3. Mostrar Valores\n"
                    + "4. Sair"));

            switch (escolha) {
                case 1:
                    lado = Double.parseDouble(JOptionPane.showInputDialog("Digite o lado do quadrado:"));
                    quad.setAreaQuadrado(quad.calcularArea(lado));
                    JOptionPane.showMessageDialog(null, "Área do quadrado: " + quad.getAreaQuadrado());
                    break;
                case 2:
                    lado = Double.parseDouble(JOptionPane.showInputDialog("Digite o lado do quadrado:"));
                    quad.setPerimetroQuadrado(quad.calcularPerimetro(lado));
                    JOptionPane.showMessageDialog(null, "Perímetro do quadrado: " + quad.getPerimetroQuadrado());
                    break;
                case 3:
                    lado = Double.parseDouble(JOptionPane.showInputDialog("Digite o lado do quadrado:"));
                    quad.setAreaQuadrado(quad.calcularArea(lado));
                    quad.setPerimetroQuadrado(quad.calcularPerimetro(lado));
                    quad.mostrarValores();
                    break;
                case 4:
                    JOptionPane.showMessageDialog(null, "Saindo...");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opção inválida!");
            }
        } while (escolha != 4);
    }
}
