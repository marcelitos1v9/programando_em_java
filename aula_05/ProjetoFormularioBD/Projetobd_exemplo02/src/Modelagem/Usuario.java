/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelagem;

import Controle.Conexao;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/**
 *
 * @author fatec-dsm2
 */
public class Usuario {
    private String nome;
    private String email;

    Conexao con = new Conexao(); 
            
    public Usuario() {
    }

    public Usuario(String nome, String email) {
        this.nome = nome;
        this.email = email;
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
    
        public void cadastrar(){
        String sql;
        sql= "insert into usuario(nome,email) values ('" + getNome() + "' , '" + getEmail() + "')" ;
        
        con.executeSQL(sql);
        JOptionPane.showMessageDialog(null, "Registrado c sucesso");
    }
    
       public ResultSet consultar(){
        ResultSet tabela;
        tabela = null;
        
        String sql= "Select nome,email from usuario";
        tabela = con.RetornarResultset(sql);
     return tabela;   
    }
}
