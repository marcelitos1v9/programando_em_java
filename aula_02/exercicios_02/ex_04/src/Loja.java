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
public class Loja {

    private String razaoSocial;
    private String cpfCliente;
    private double valorCompra;
    private double qtdItensComp;
    private double valorTotalCompra;

    public Loja() {
    }

    public Loja(String razaoSocial, String cpfCliente, double valorCompra, double qtdItensComp, double valorTotalCompra) {
        this.razaoSocial = razaoSocial;
        this.cpfCliente = cpfCliente;
        this.valorCompra = valorCompra;
        this.qtdItensComp = qtdItensComp;
        this.valorTotalCompra = valorTotalCompra;
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

    public String getCpfCliente() {
        return cpfCliente;
    }

    public void setCpfCliente(String cpfCliente) {
        this.cpfCliente = cpfCliente;
    }

    public double getValorCompra() {
        return valorCompra;
    }

    public void setValorCompra(double valorCompra) {
        this.valorCompra = valorCompra;
    }

    public double getQtdItensComp() {
        return qtdItensComp;
    }

    public void setQtdItensComp(double qtdItensComp) {
        this.qtdItensComp = qtdItensComp;
    }

    public double getValorTotalCompra() {
        return valorTotalCompra;
    }

    public void setValorTotalCompra(double valorTotalCompra) {
        this.valorTotalCompra = valorTotalCompra;
    }

    public void inserirDadosLoja() {
        setRazaoSocial(JOptionPane.showInputDialog("Digite a razão social: "));
        setCpfCliente(JOptionPane.showInputDialog("Digite o cpf do cliente: "));
        setValorCompra(Double.parseDouble(JOptionPane.showInputDialog("Digite o valor: ")));
        setQtdItensComp(Double.parseDouble(JOptionPane.showInputDialog("Digite a quantidade de itens: ")));     
    }
    public String MostrarDadosLoja(){
        return "Razão Social: "+getRazaoSocial()+"\n"+"CPF: "+getCpfCliente();
    }
    
    public double calcularCompraLoja(){
        setValorTotalCompra(getQtdItensComp()*getValorCompra());
        return getValorTotalCompra();
    }
}
