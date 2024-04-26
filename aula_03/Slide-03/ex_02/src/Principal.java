import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author fatec-dsm2
 */
public class Principal { 

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        vendedor ven = new vendedor();
        int op;
        do {
            op = Integer.parseInt(JOptionPane.showInputDialog("Digite: \n1-Nome\n2-Salario Base\n3-Valor vendido\n4-Calcular comissão\n0-Sair"));
            switch (op) {
                case 1:
                    ven.entrarNome();
                    break;
                case 2:
                    ven.entrarSalarioBase();
                    break;
                case 3:
                    ven.entrarValorVenda();
                    break;
                case 4:
                    double ar = 0;
                    ven.calculoComissao(ar);
                     JOptionPane.showMessageDialog(null,"o valor total que o vendedor "+ven.getNome()+" é igual a "+ven.getNovoSalario());
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
