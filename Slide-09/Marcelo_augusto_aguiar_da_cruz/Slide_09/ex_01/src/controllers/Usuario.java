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
 * @author fatec-dsm2
 */
public class Usuario {

    private conexao con = new conexao();
    private String login, senha,nomePaciente,enderecoPaciente,complementoPaciente,rgPaciente,cpfPaciente,nascimentoPaciente;

    public Usuario() {
    }

    public Usuario(String login, String senha, String nomePaciente, String enderecoPaciente, String complementoPaciente, String rgPaciente, String cpfPaciente, String nascimentoPaciente) {
        this.login = login;
        this.senha = senha;
        this.nomePaciente = nomePaciente;
        this.enderecoPaciente = enderecoPaciente;
        this.complementoPaciente = complementoPaciente;
        this.rgPaciente = rgPaciente;
        this.cpfPaciente = cpfPaciente;
        this.nascimentoPaciente = nascimentoPaciente;
    }
    
    public conexao getCon() {
        return con;
    }

    public void setCon(conexao con) {
        this.con = con;
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

    public String getNomePaciente() {
        return nomePaciente;
    }

    public void setNomePaciente(String nomePaciente) {
        this.nomePaciente = nomePaciente;
    }

    public String getEnderecoPaciente() {
        return enderecoPaciente;
    }

    public void setEnderecoPaciente(String enderecoPaciente) {
        this.enderecoPaciente = enderecoPaciente;
    }

    public String getComplementoPaciente() {
        return complementoPaciente;
    }

    public void setComplementoPaciente(String complementoPaciente) {
        this.complementoPaciente = complementoPaciente;
    }

    public String getRgPaciente() {
        return rgPaciente;
    }

    public void setRgPaciente(String rgPaciente) {
        this.rgPaciente = rgPaciente;
    }

    public String getCpfPaciente() {
        return cpfPaciente;
    }

    public void setCpfPaciente(String cpfPaciente) {
        this.cpfPaciente = cpfPaciente;
    }

    public String getNascimentoPaciente() {
        return nascimentoPaciente;
    }

    public void setNascimentoPaciente(String nascimentoPaciente) {
        this.nascimentoPaciente = nascimentoPaciente;
    }
  
    public ResultSet logar() {
        ResultSet tabela;

        tabela = null;
        String sql = "select * from usuarios where login_user ='" + getLogin() + "'and senha_user= '" + getSenha() + "'";

        tabela = con.RetornarResultset(sql);
        return tabela;
    }
    
    public void cadastrarUser() {
     String sql;
    sql = "INSERT INTO pacientes (nome_paciente, endereco_paciente, complemento_paciente, rg_paciente, cpf_paciente, nascimento_paciente) VALUES ('" 
          + getNomePaciente() + "', '" 
          + getEnderecoPaciente() + "', '" 
          + getComplementoPaciente() + "', '" 
          + getRgPaciente() + "', '" 
          + getCpfPaciente() + "', '" 
          + getNascimentoPaciente() + "')";
    con.executeSQL(sql);
    JOptionPane.showMessageDialog(null, "Paciente cadastrado com sucesso");
    }

      
    public void consultarPaciente(DefaultTableModel modeloTabela) {
    String sql = "SELECT * FROM pacientes";
    ResultSet rs = con.RetornarResultset(sql);
    try {
        while (rs.next()) {
            String[] linha = {
                rs.getString("id_paciente"),
                rs.getString("nome_paciente"),
                rs.getString("endereco_paciente"),
                rs.getString("rg_paciente"),
                rs.getString("cpf_paciente"),
                rs.getString("nascimento_paciente"),
            };
            modeloTabela.addRow(linha);
        }
    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, "Erro ao consultar vendas: " + e.getMessage());
    }
}
     public void excluirpaciente(int codigo) {
    String sql;
    sql = "DELETE FROM pacientes WHERE id_paciente = " + codigo;
    con.executeSQL(sql);
    JOptionPane.showMessageDialog(null, "Paciente excluído com sucesso");
}
     
    public void alterarVenda(int codigoAtual, int novoCodigo, String novoNomeVendedor, String novoProdutoVendido) {
    String sql;
    sql = "UPDATE vendas SET codigo = '" + novoCodigo + "', nm_vendedor = '" + novoNomeVendedor + "', nm_produto = '" + novoProdutoVendido + "' WHERE codigo = " + codigoAtual;
    con.executeSQL(sql);
    JOptionPane.showMessageDialog(null, "Venda alterada com sucesso");
}

    public void alterarPaciente(int idPacienteAtual, String novoNomePaciente, String novoEnderecoPaciente, String novoComplementoPaciente, String novoRgPaciente, String novoCpfPaciente, String novoNascimentoPaciente) {
    String sql;
    sql = "UPDATE pacientes SET "
          + "nome_paciente = '" + novoNomePaciente + "', "
          + "endereco_paciente = '" + novoEnderecoPaciente + "', "
          + "complemento_paciente = '" + novoComplementoPaciente + "', "
          + "rg_paciente = '" + novoRgPaciente + "', "
          + "cpf_paciente = '" + novoCpfPaciente + "', "
          + "nascimento_paciente = '" + novoNascimentoPaciente + "' "
          + "WHERE id_paciente = " + idPacienteAtual;
    con.executeSQL(sql);
    JOptionPane.showMessageDialog(null, "Dados do paciente alterados com sucesso");
}

}
