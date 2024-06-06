/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import models.conexao;

/**
 *
 * @author fatec-dsm2
 */
public class Filmes {
    conexao con = new conexao();
    private int codigo;
    private String titulo,genero,produtora,dt_compra;

    public Filmes() {
    }

    public Filmes(int codigo, String titulo, String genero, String produtora, String dt_compra) {
        this.codigo = codigo;
        this.titulo = titulo;
        this.genero = genero;
        this.produtora = produtora;
        this.dt_compra = dt_compra;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getProdutora() {
        return produtora;
    }

    public void setProdutora(String produtora) {
        this.produtora = produtora;
    }

    public String getDt_compra() {
        return dt_compra;
    }

    public void setDt_compra(String dt_compra) {
        this.dt_compra = dt_compra;
    }
    
   public void cadastrarFilme() {
        String sql;
        sql = "INSERT INTO filmes (codigo, titulo, genero, produtora, datacompra) VALUES (" +
                getCodigo() + ", '" + getTitulo() + "', '" + getGenero() + "', '" + getProdutora() + "', '" + getDt_compra() + "')";
        con.executeSQL(sql);
        JOptionPane.showMessageDialog(null, "Filme cadastrado com sucesso");
    }
   
   public void consultarFilmes(DefaultTableModel modeloTabela) {
        String sql = "SELECT * FROM filmes";
        ResultSet rs = con.RetornarResultset(sql);
        try {
            while (rs.next()) {
                String[] linha = {
                    rs.getString("id"),
                    rs.getString("titulo"),
                    rs.getString("genero"),
                    rs.getString("produtora"),
                    rs.getString("datacompra")
                };
                modeloTabela.addRow(linha);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao consultar filmes: " + e.getMessage());
        }
    }
   
   public void excluirFilme(int id) {
    String sql;
    sql = "DELETE FROM filmes WHERE id = " + id;
    con.executeSQL(sql);
    JOptionPane.showMessageDialog(null, "Venda excluída com sucesso");
}

   
}
