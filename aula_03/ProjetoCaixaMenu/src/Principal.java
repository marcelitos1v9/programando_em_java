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
        Caixa cx = new Caixa();
        int op;

        do {
            op = Integer.parseInt(JOptionPane.showInputDialog("Digite a opção: \n1-Depositar\n2-Depositar(Parametro)\n3-Sacar\n4-Consultar saldo \n0-Sair"));
            switch (op) {
                case 1:
                    cx.depositar();
                    break;
                case 2:
                    double val;
                    val = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do deposito"));
                    cx.depositar(val);
                    break;
                case 3:
                    JOptionPane.showInputDialog(null, "Valor saldo:" + cx.sacar());
                    break;
                case 4:
                    JOptionPane.showMessageDialog(null, "Saldo Atual: " + cx.consultarSaldo());
                    break;
                case 0:
                    JOptionPane.showMessageDialog(null, "Finalizando o programa")
                    ;
                break;
                default:
                    JOptionPane.showMessageDialog(null, "Opção invalida");

            }
        } while (op != 0);

    }

}
