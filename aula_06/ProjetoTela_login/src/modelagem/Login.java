/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelagem;

import controle.conexao;
import java.sql.ResultSet;

/**
 *
 * @author fatec-dsm2
 */
public class Login {
    private int id;
    private String loginusu,senha;
    
    conexao con = new conexao();

    public Login() {
    }

    public Login(int id, String loginusu, String senha) {
        this.id = id;
        this.loginusu = loginusu;
        this.senha = senha;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLoginusu() {
        return loginusu;
    }

    public void setLoginusu(String loginusu) {
        this.loginusu = loginusu;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
    
    public ResultSet Logar(){
        ResultSet tabela;
        
        tabela = null;
        String sql ="select * from usuLogin where login ='"+getLoginusu()+"'and senha= '"+getSenha()+"'";
        
        tabela = con.RetornarResultset(sql);
        return tabela;
    }
}
