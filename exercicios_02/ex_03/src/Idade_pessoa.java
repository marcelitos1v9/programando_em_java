
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author fatec-dsm2
 */
public class Idade_pessoa {
    private int ano;
    private int idade;

    public Idade_pessoa() {
    }

    public Idade_pessoa(int ano, int idade) {
        this.ano = ano;
        this.idade = idade;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
    
    public void calcularIdade(){
         setAno(Integer.parseInt(JOptionPane.showInputDialog("Digite o ano em que nasceu: ")));
         setIdade(2024 - getAno());
    }
    
    public void mostrarIdade(){
        JOptionPane.showMessageDialog(null,"Sua idade é : "+getIdade());
    }
}
