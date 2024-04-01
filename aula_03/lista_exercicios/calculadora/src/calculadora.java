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
public class calculadora {

    private double n1, n2, r;

    public calculadora() {
    }

    public calculadora(double n1, double n2, double r) {
        this.n1 = n1;
        this.n2 = n2;
        this.r = r;
    }

    public double getN1() {
        return n1;
    }

    public void setN1(double n1) {
        this.n1 = n1;
    }

    public double getN2() {
        return n2;
    }

    public void setN2(double n2) {
        this.n2 = n2;
    }

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }

    public void somar() {
        setN1(Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro número a ser somado")));
        setN2(Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo número a ser somado")));
        setR(getN1() + getN2());
        JOptionPane.showMessageDialog(null, "O resultado da soma é: " + getR());
    }
    
    public void subtrair(double a,double b){
        setN1(a);
        setN2(b);
        setR(getN1()-getN2());
        JOptionPane.showMessageDialog(null, "O resultado da subtração é: " + getR());
    }
    public double multiplicar(){
        setN1(Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro número da multiplicação")));
        setN2(Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo numero da multiplicação")));
        setR(getN1()*getN2());
        return getR();
    }
    public double dividir(double n1,double n2){
        setN1(n1);
        setN2(n2);
        
        setR(getN1()/getN2());
        return getR();
    }
}
