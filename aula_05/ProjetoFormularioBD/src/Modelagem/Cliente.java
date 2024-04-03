/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelagem;

/**
 *
 * @author fatec-dsm2
 */
public class Cliente {
    private int codigo;
    private String nome;
    private String Telefone;
    private String email;

    public Cliente() {
    }

    public Cliente(int codigo, String nome, String Telefone, String email) {
        this.codigo = codigo;
        this.nome = nome;
        this.Telefone = Telefone;
        this.email = email;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return Telefone;
    }

    public void setTelefone(String Telefone) {
        this.Telefone = Telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    
}
