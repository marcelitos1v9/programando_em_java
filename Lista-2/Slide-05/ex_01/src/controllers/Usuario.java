/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import java.sql.ResultSet;
import javax.swing.JOptionPane;
import models.conexao;

/**
 *
 * @author marce
 */
public class Usuario {

    private String nome, email, login, senha;

    conexao con = new conexao();

    public Usuario() {
    }

    public Usuario(String nome, String email, String login, String senha) {
        this.nome = nome;
        this.email = email;
        this.login = login;
        this.senha = senha;
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

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public void cadastrarUsuario() {
        String sql;
        sql = "INSERT INTO usuarios(nome_usuario, email_usuario, login_usuario, senha_usuario) VALUES ('" + getNome() + "', '" + getEmail() + "', '" + getLogin() + "', '" + getSenha() + "')";
        con.executeSQL(sql);
        JOptionPane.showMessageDialog(null, "Registrado com sucesso");
        
    }
    
     public ResultSet ListarUsuario() {
        ResultSet tabela;
        tabela = null;

        String sql = "Select nome_usuario,email_usuario,login_usuario,senha_usuario from usuarios";
        tabela = con.RetornarResultset(sql);
        return tabela;
    }
}
