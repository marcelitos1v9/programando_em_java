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
public class Produto {
    conexao con = new conexao();
    private int codigo;
    private String nome_produto,descricao;

    public Produto() {
    }

    public Produto(int codigo, String nome_produto, String descricao) {
        this.codigo = codigo;
        this.nome_produto = nome_produto;
        this.descricao = descricao;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome_produto() {
        return nome_produto;
    }

    public void setNome_produto(String nome_produto) {
        this.nome_produto = nome_produto;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    
    public void cadastrar_produto(){
        String sql;
        sql = "INSERT INTO produtos(codigo, nome_produto, descricao) VALUES ('" + getCodigo() + "', '" + getNome_produto() + "', '" + getDescricao()+"')";
        con.executeSQL(sql);
        JOptionPane.showMessageDialog(null, "Registrado com sucesso");
    }
    
    public ResultSet ListarProduto() {
        ResultSet tabela;
        tabela = null;

        String sql = "Select codigo,nome_produto,descricao from produtos";
        tabela = con.RetornarResultset(sql);
        return tabela;
    }
}
