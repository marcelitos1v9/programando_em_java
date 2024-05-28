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

public class usuarios {

    conexao con = new conexao();

    public void consultarUsuarios(DefaultTableModel modeloTabela) {
        String sql = "SELECT * FROM usuarios";
        ResultSet rs = con.RetornarResultset(sql);
        try {
            while (rs.next()) {
                String[] linha = {
                    rs.getString("id_usuario"),
                    rs.getString("nome_usuario"),
                    rs.getString("nome_completo"),
                    rs.getString("email"),
                    rs.getString("telefone"),};
                modeloTabela.addRow(linha);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao consultar vendas: " + e.getMessage());
        }
    }
}
