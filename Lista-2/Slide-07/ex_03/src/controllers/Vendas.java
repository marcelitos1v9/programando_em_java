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
public class Vendas {

    conexao con = new conexao();
    private int codigo;
    private String nomeVendedor;
    private String produtoVendido;

    public Vendas() {
    }

    public Vendas(int codigo, String nomeVendedor, String produtoVendido) {
        this.codigo = codigo;
        this.nomeVendedor = nomeVendedor;
        this.produtoVendido = produtoVendido;
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

    public String getProdutoVendido() {
        return produtoVendido;
    }

    public void setProdutoVendido(String produtoVendido) {
        this.produtoVendido = produtoVendido;
    }

    public void cadastrarVenda() {
        String sql;
        sql = "INSERT INTO vendas(codigo, nm_vendedor, nm_produto) VALUES ('" + getCodigo() + "', '" + getNomeVendedor() + "', '" + getProdutoVendido() + "')";
        con.executeSQL(sql);
        JOptionPane.showMessageDialog(null, "Venda registrada com sucesso");
    }

    public void consultarVenda(DefaultTableModel modeloTabela) {
        String sql = "SELECT * FROM vendas";
        ResultSet rs = con.RetornarResultset(sql);
        try {
            while (rs.next()) {
                String[] linha = {
                    rs.getString("codigo"),
                    rs.getString("nm_vendedor"),
                    rs.getString("nm_produto"),};
                modeloTabela.addRow(linha);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao consultar vendas: " + e.getMessage());
        }
    }

    public void excluirVenda(int codigo) {
        String sql;
        sql = "DELETE FROM vendas WHERE codigo = " + codigo;
        con.executeSQL(sql);
        JOptionPane.showMessageDialog(null, "Venda excluída com sucesso");
    }

    public void alterarFilme(int codigoAtual, int novoCodigo, String novoTitulo, String novoGenero, String novaProdutora, String novaDataCompra) {
        String sql;
        sql = "UPDATE filmes SET codigo = " + novoCodigo + ", titulo = '" + novoTitulo + "', genero = '" + novoGenero + "', produtora = '" + novaProdutora + "', datacompra = '" + novaDataCompra + "' WHERE codigo = " + codigoAtual;
        con.executeSQL(sql);
        JOptionPane.showMessageDialog(null, "Filme alterado com sucesso");
    }

}
