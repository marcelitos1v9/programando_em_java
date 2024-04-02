
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
        Loja loj = new Loja();
        loj.inserirDadosLoja();
        JOptionPane.showMessageDialog(null,loj.MostrarDadosLoja());
        JOptionPane.showMessageDialog(null,"O valor total da compra é: "+ loj.calcularCompraLoja());
    }
    
}
