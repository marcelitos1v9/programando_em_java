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
public class Multiplicacao {

    private int valor;
    private int resultado;

    public Multiplicacao() {
    }

    public Multiplicacao(int valor, int resultado) {
        this.valor = valor;
        this.resultado = resultado;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public int getResultado() {
        return resultado;
    }

    public void setResultado(int resultado) {
        this.resultado = resultado;
    }

    public void Multiplicacao4() {
        setValor(Integer.parseInt(JOptionPane.showInputDialog("Digite o valor do produto")));
        setResultado((getValor() * 4));
    }

    public void MostrarMultiplicacao() {
        JOptionPane.showMessageDialog(null,"O valor do número multiplicado por 4 é: "+getResultado());
    }
}
