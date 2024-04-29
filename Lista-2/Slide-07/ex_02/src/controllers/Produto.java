/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
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
    
     public void cadastrarProduto() {
        String sql;
        sql = "INSERT INTO produtos(codigo,nome_produto, descricao) VALUES ('" + getCodigo() + "', '" + getNome_produto() + "', '" + getDescricao() + "')";
        con.executeSQL(sql);
        JOptionPane.showMessageDialog(null, "Registrado com sucesso");
    }

   public void consultarProduto(DefaultTableModel modeloTabela) {
    String sql = "SELECT * FROM produtos";
    ResultSet rs = con.RetornarResultset(sql);
    try {
        while (rs.next()) {
            String[] linha = {
                rs.getString("codigo"),
                rs.getString("nome_produto"),
                rs.getString("descricao"),
            };
            modeloTabela.addRow(linha);
        }
    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, "Erro ao consultar usuários: " + e.getMessage());
    }
}

   public void excluirProduto(int codigo) {
    String sql;
    sql = "DELETE FROM produtos WHERE codigo = " + codigo;
    con.executeSQL(sql);
    JOptionPane.showMessageDialog(null, "Produto excluído com sucesso");
}


    public void alterarProduto(int codigo, String novocodigo, String novo_nome_produto ,String nova_descricao) {
    String sql;
    sql = "UPDATE produtos SET codigo = '" + novocodigo + "', nome_produto = '" + novo_nome_produto + "', descricao = '" + nova_descricao + "' WHERE codigo = " + codigo;
    con.executeSQL(sql);
    JOptionPane.showMessageDialog(null, "Produto alterado com sucesso");
}

}
