package ex_04;

import javax.swing.JOptionPane;

/**
 *
 * @author fatec-dsm2
 */
public class Dobro {
    private double numero, calculo;

    public Dobro() {
    }

    public Dobro(double numero, double calculo) {
        this.numero = numero;
        this.calculo = calculo;
    }

    public double getNumero() {
        return numero;
    }

    public void setNumero(double numero) {
        this.numero = numero;
    }

    public double getCalculo() {
        return calculo;
    }

    public void setCalculo(double calculo) {
        this.calculo = calculo;
    }
    
    public void dobrar(){
         setNumero(Double.parseDouble(JOptionPane.showInputDialog("Digite o número que será dobrado")));
         
         setCalculo(getNumero() * 2);
         
         JOptionPane.showMessageDialog(null,"O dobro do valor é: "+getCalculo());
         
    }
}
