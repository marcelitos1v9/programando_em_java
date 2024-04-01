
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
public class Caixa {
    private double valor,saldo;

    public Caixa() {
    }

    public Caixa(double valor, double saldo) {
        this.valor = valor;
        this.saldo = saldo;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
    //metodo sem retorno
    public void depositar(){
        setValor(Double.parseDouble(JOptionPane.showInputDialog("Digite o valor para o deposito")));
        setSaldo(getValor()+getSaldo());
    }
    
    //metodo com retorno e com parametro
    public double depositar(double v){
        setSaldo(v+getSaldo());
        return getSaldo();
    }
    
    //metdo sem parametro e com retorno
    public double sacar(){
         setValor(Double.parseDouble(JOptionPane.showInputDialog("Digite o valor para o valor do saque: ")));
         setSaldo(getSaldo()- getValor());
         return getSaldo();
    }
    
    public double consultarSaldo(){
        return getSaldo();
    }
}
