import javax.swing.JOptionPane;

public class CustoPiso {
    private double comprimentoComodo;
    private double larguraComodo;
    private double precoPorArea;
    private double custoTotalComodo;

    public CustoPiso() {
    }

    public CustoPiso(double comprimentoComodo, double larguraComodo, double precoPorArea, double custoTotalComodo) {
        this.comprimentoComodo = comprimentoComodo;
        this.larguraComodo = larguraComodo;
        this.precoPorArea = precoPorArea;
        this.custoTotalComodo = custoTotalComodo;
    }

    public double getComprimentoComodo() {
        return comprimentoComodo;
    }

    public void setComprimentoComodo(double comprimentoComodo) {
        this.comprimentoComodo = comprimentoComodo;
    }

    public double getLarguraComodo() {
        return larguraComodo;
    }

    public void setLarguraComodo(double larguraComodo) {
        this.larguraComodo = larguraComodo;
    }

    public double getPrecoPorArea() {
        return precoPorArea;
    }

    public void setPrecoPorArea(double precoPorArea) {
        this.precoPorArea = precoPorArea;
    }

    public double getCustoTotalComodo() {
        return custoTotalComodo;
    }

    public void setCustoTotalComodo(double custoTotalComodo) {
        this.custoTotalComodo = custoTotalComodo;
    }
    
    public void inserirValores(){
       setComprimentoComodo(Double.parseDouble(JOptionPane.showInputDialog(null, "Qual o comprimento do cômodo:")));
       setLarguraComodo(Double.parseDouble(JOptionPane.showInputDialog(null, "Qual a largura do cômodo:")));
       setPrecoPorArea(Double.parseDouble(JOptionPane.showInputDialog(null, "Qual o preço por metro quadrado:")));
    }
    
    private void calcularPrecoArea(){
        setCustoTotalComodo(getC);
    }
}
