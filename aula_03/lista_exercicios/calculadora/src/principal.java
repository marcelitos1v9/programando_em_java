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
public class principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        calculadora calc = new calculadora();
        int op;
        do {
            op = Integer.parseInt(JOptionPane.showInputDialog("Digite a operação a ser realizada: \n1-Soma\n2-Subtração\n3-Multiplicação\n4-Divisão\n0-Sair"));
            switch (op) {
                case 1:
                    calc.somar();
                    break;
                case 2:
                    double a,
                     b;
                    a = Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro valor"));
                    b = Double.parseDouble(JOptionPane.showInputDialog("Digite o quanto você quer subtrair"));
                    calc.subtrair(a, b);
                    break;
                case 3:
                    JOptionPane.showMessageDialog(null,"O resultado da multiplicação é: "+ calc.multiplicar());
                    break;
                case 4:
                    double n1,n2;
                    n1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor que será dividido"));
                    n2 = Double.parseDouble(JOptionPane.showInputDialog("Digite por quanto sera dividido"));
                    
                    JOptionPane.showMessageDialog(null,"O resultado da divisão é: "+calc.dividir(n1, n2));
                    break;
                case 0:
                    JOptionPane.showMessageDialog(null, "Finalizando o programa");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opção invalida");

            }
        } while (op != 0);
    }

}
