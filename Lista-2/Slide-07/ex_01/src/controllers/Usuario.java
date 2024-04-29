package controllers;

import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import models.conexao;

public class Usuario {

    conexao con = new conexao();
    private String nome, email, senha, login;

    public Usuario() {
    }

    public Usuario(String nome, String email, String senha, String login) {
        this.nome = nome;
        this.email = email;
        this.senha = senha;
        this.login = login;
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

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public void cadastrarUsuario() {
        String sql;
        sql = "INSERT INTO usuarios(nome_usuario,email_usuario, senha_usuario, login_usuario) VALUES ('" + getNome() + "', '" + getEmail() + "', '" + getSenha() + "', '" + getLogin() + "')";
        con.executeSQL(sql);
        JOptionPane.showMessageDialog(null, "Registrado com sucesso");
    }

   public void consultarUsuarios(DefaultTableModel modeloTabela) {
    String sql = "SELECT * FROM usuarios";
    ResultSet rs = con.RetornarResultset(sql);
    try {
        while (rs.next()) {
            String[] linha = {
                rs.getString("id_usuario"),
                rs.getString("nome_usuario"),
                rs.getString("email_usuario"),
                rs.getString("login_usuario"),
                rs.getString("senha_usuario")
            };
            modeloTabela.addRow(linha);
        }
    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, "Erro ao consultar usuários: " + e.getMessage());
    }
}

   public void excluirUsuario(int idUsuario) {
    String sql;
    sql = "DELETE FROM usuarios WHERE id_usuario = " + idUsuario;
    con.executeSQL(sql);
    JOptionPane.showMessageDialog(null, "Usuário excluído com sucesso");
}


    public void alterarUsuario(int idUsuario, String novoNome, String novoEmail, String novaSenha, String novoLogin) {
    String sql;
    sql = "UPDATE usuarios SET nome_usuario = '" + novoNome + "', email_usuario = '" + novoEmail + "', login_usuario = '" + novoLogin + "', senha_usuario = '" + novaSenha + "' WHERE id_usuario = " + idUsuario;
    con.executeSQL(sql);
    JOptionPane.showMessageDialog(null, "Usuário alterado com sucesso");
}



}
