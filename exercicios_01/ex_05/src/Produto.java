
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
public class Produto {
    private String nome;
    private int qtde;
    private double valor;
    private double total;

    public Produto() {
    }

    public Produto(String nome, int qtde, double valor, double total) {
        this.nome = nome;
        this.qtde = qtde;
        this.valor = valor;
        this.total = total;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQtde() {
        return qtde;
    }

    public void setQtde(int qtde) {
        this.qtde = qtde;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }
    
    public void calcularTotal(){
        setNome(JOptionPane.showInputDialog("Digite o nome do produto"));
        setQtde(Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade do produto")));
        setValor(Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do produto")));
       
        setTotal(getQtde()*getValor());
        
        JOptionPane.showMessageDialog(null,"O valor total é: "+getTotal());
    }
}
