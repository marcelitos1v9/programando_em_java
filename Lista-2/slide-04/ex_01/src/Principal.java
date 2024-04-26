import javax.swing.JOptionPane;

public class Principal {

    public static void main(String[] args) {
        custoPiso custoPiso = new custoPiso();
        int escolha;
        
        do {
            escolha = Integer.parseInt(JOptionPane.showInputDialog("Selecione uma opção:\n"
                                                    + "1. Inserir valores\n"
                                                    + "2. Calcular custo total\n"
                                                    + "3. Mostrar valores\n"
                                                    + "4. Sair"));
            
            switch (escolha) {
                case 1:
                    custoPiso.inserirValores();
                    break;
                case 2:
                    JOptionPane.showMessageDialog(null, "O custo total do cômodo é: " + custoPiso.getCustoTotalComodo());
                    break;
                case 3:
                    custoPiso.mostrarValores();
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
