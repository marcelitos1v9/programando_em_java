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
public class Venda {
    
    conexao con = new conexao();
    private int codigo;
    private String nomeVendedor,nome_produto;

    public Venda() {
    }

    public Venda(int codigo, String nomeVendedor, String nome_produto) {
        this.codigo = codigo;
        this.nomeVendedor = nomeVendedor;
        this.nome_produto = nome_produto;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNomeVendedor() {
        return nomeVendedor;
    }

    public void setNomeVendedor(String nomeVendedor) {
        this.nomeVendedor = nomeVendedor;
    }

    public String getNome_produto() {
        return nome_produto;
    }

    public void setNome_produto(String nome_produto) {
        this.nome_produto = nome_produto;
    }
    
    public void cadastrarVenda(){
        String sql;
        sql = "INSERT INTO vendas(codigo,nm_produto, nm_vendedor ) VALUES ('" + getCodigo() + "', '" + getNome_produto() + "', '" + getNomeVendedor()+"')";
        con.executeSQL(sql);
        JOptionPane.showMessageDialog(null, "Registrado com sucesso");
    }
    
    public ResultSet ListarVenda() {
        ResultSet tabela;
        tabela = null;
        String sql = "Select codigo,nm_produto,nm_vendedor from vendas";
        tabela = con.RetornarResultset(sql);
        return tabela;
    }
}
