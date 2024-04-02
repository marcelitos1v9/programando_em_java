
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
public class media_matematica {
    private double numero1;
    private double numero2;
    private double media;
    private String nome;

    public media_matematica() {
    }

    public media_matematica(double numero1, double numero2, double media, String nome) {
        this.numero1 = numero1;
        this.numero2 = numero2;
        this.media = media;
        this.nome = nome;
    }

    public double getNumero1() {
        return numero1;
    }

    public void setNumero1(double numero1) {
        this.numero1 = numero1;
    }

    public double getNumero2() {
        return numero2;
    }

    public void setNumero2(double numero2) {
        this.numero2 = numero2;
    }

    public double getMedia() {
        return media;
    }

    public void setMedia(double media) {
        this.media = media;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public void calcularMedia(){
        setNumero1(Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro número: ")));
        setNumero2(Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo número: ")));
        
        setMedia((getNumero1()+getNumero2())/2);
        
        JOptionPane.showMessageDialog(null,"A média entre os valores é igual a: "+getMedia());
    }
}
