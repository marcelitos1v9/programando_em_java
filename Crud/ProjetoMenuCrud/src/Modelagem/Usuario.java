/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelagem;

import Controle.conexao;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/**
 *
 * @author fatec-dsm2
 */
public class Usuario {
    private int codigo;
    private String nome,email,telefone,senha;

    public Usuario() {
    }
     conexao con = new conexao();
     
    public Usuario(int codigo, String nome, String email, String telefone, String senha) {
        this.codigo = codigo;
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
        this.senha = senha;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
    
        public void cadastrarUsuario(){           
      String sql= "Insert into usuarios(nome,email,telefone,senha)values "+
                "('"+ getNome()+"','"+getEmail()+"','"+this.getTelefone()+"','"+ this.getSenha()+"' )";
        con.executeSQL(sql);
        JOptionPane.showMessageDialog(null, "Registrado com sucesso");     
    }

        
     public ResultSet consultar(){
        ResultSet tabela;
        tabela = null;
        
        String sql= "Select * from usuario";
        tabela = con.RetornarResultset(sql);
     return tabela;   
    }



     public ResultSet consultarCampoEspecifico(){
        ResultSet tabela;
        tabela = null;
    
        try{
          String sql="Select * from usuario where nome like '"+ getNome()+"%'";
          tabela= con.RetornarResultset(sql);                  
       
           }
           catch(Exception sqle){
                JOptionPane.showMessageDialog(null,"Atenção..."+sqle.getMessage());
           }
        return tabela;    
    }
}
