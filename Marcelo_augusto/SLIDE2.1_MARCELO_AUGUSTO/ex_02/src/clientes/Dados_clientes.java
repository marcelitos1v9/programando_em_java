package clientes;


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
public class Dados_clientes {
    
    private String nome;
    private String end;
    private String rg;
    
    public Dados_clientes() {
        
    }

    public Dados_clientes(String nome, String end, String rg) {
        this.nome = nome;
        this.end = end;
        this.rg = rg;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEnd() {
        return end;
    }

    public void setEnd(String end) {
        this.end = end;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }
    
    public void cadastrarCliente(){
        setNome(JOptionPane.showInputDialog("Digite o nome do cliente"));
        setEnd(JOptionPane.showInputDialog("Digite o endereço do cliente"));
        setRg(JOptionPane.showInputDialog("Digite o RG do cliente"));
    }
    
    public void listarCliente(){
        JOptionPane.showMessageDialog(null,"Dados clientes: \n Nome: "+getNome()+"\n Endereço: "+getEnd()+"\n RG: "+getRg());
    }
        
}
