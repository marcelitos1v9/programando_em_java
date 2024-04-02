package passagem2;


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
public class Passagens {
    private String nomePassageiro;
    private String telefone;
    private String rg;
    private String localViagem;
    private String data;
    private String horario;
    private int numPoltrona;

    public Passagens() {
        this("","","","","","",0);
    }

    public Passagens(String nomePassageiro, String telefone, String rg, String localViagem, String data, String horario, int numPoltrona) {
        this.nomePassageiro = nomePassageiro;
        this.telefone = telefone;
        this.rg = rg;
        this.localViagem = localViagem;
        this.data = data;
        this.horario = horario;
        this.numPoltrona = numPoltrona;
    }

    public String getNomePassageiro() {
        return nomePassageiro;
    }

    public void setNomePassageiro(String nomePassageiro) {
        this.nomePassageiro = nomePassageiro;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getRG() {
        return rg;
    }

    public void setRG(String RG) {
        this.rg = RG;
    }

    public String getLocalViagem() {
        return localViagem;
    }

    public void setLocalViagem(String localViagem) {
        this.localViagem = localViagem;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public int getNumPoltrona() {
        return numPoltrona;
    }

    public void setNumPoltrona(int numPoltrona) {
        this.numPoltrona = numPoltrona;
    }
    
    public void cadastrarDadosPassageiro(){
        setNomePassageiro(JOptionPane.showInputDialog("Digite o nome do passageiro"));
        setTelefone(JOptionPane.showInputDialog("Digite o telefone do passageiro"));
        setRG(JOptionPane.showInputDialog("Digite o RG do passageiro"));
    }
    public void cadastrarDadosViagem(){
        setLocalViagem(JOptionPane.showInputDialog("Digite o local da viagem"));
        setData(JOptionPane.showInputDialog("Digite a data da viagem"));
        setHorario(JOptionPane.showInputDialog("Digite o horario da viagem"));
        setNumPoltrona(Integer.parseInt(JOptionPane.showInputDialog("Digite o número da poltrona")));
    }
    public void mostrarDadosPassageiro(){
        JOptionPane.showMessageDialog(null,"Dados Passageiros: \n Nome: "+getNomePassageiro()+"\n Telefone: "+getTelefone()+"\n RG: "+getRG());
    }
    public void mostrarDadosViagem(){
        JOptionPane.showMessageDialog(null,"Dados da viagem: \n Local da viagem: "+getLocalViagem()+"\n Data da viagem: "+getData()+"\n Horario: "+getHorario()+"\n Poltrona:"+getNumPoltrona());
    }
    
}
