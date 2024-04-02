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
public class Quadrado {

    private double numero;
    private double resultado;

    public Quadrado() {
    }

    public Quadrado(double numero, double resultado) {
        this.numero = numero;
        this.resultado = resultado;
    }

    public double getNumero() {
        return numero;
    }

    public void setNumero(double numero) {
        this.numero = numero;
    }

    public double getResultado() {
        return resultado;
    }

    public void setResultado(double resultado) {
        this.resultado = resultado;
    }

    public void calcularquadrado() {
        setNumero(Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do produto")));
        setResultado(getNumero() * getNumero());
    }
    public void mostrarQuadrado(){
        JOptionPane.showMessageDialog(null,"O valor do quadrado do número é: "+getResultado());
    }
}
