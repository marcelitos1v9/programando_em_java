/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author marce
 */
import javax.swing.JOptionPane;

public class quadrado {
    private double areaQuadrado;
    private double perimetroQuadrado;

    public quadrado() {
    }

    
    public quadrado(double areaQuadrado, double perimetroQuadrado) {
        this.areaQuadrado = areaQuadrado;
        this.perimetroQuadrado = perimetroQuadrado;
    }

    public double getAreaQuadrado() {
        return areaQuadrado;
    }

    public void setAreaQuadrado(double areaQuadrado) {
        this.areaQuadrado = areaQuadrado;
    }

    public double getPerimetroQuadrado() {
        return perimetroQuadrado;
    }

    public void setPerimetroQuadrado(double perimetroQuadrado) {
        this.perimetroQuadrado = perimetroQuadrado;
    }
    
    public double calcularArea(double ladoA) {
        return ladoA * ladoA;
    }
    
    public double calcularPerimetro(double ladoA) {
        return 4 * ladoA;
    }
    
    public void mostrarValores() {
        JOptionPane.showMessageDialog(null, "Área do quadrado: " + getAreaQuadrado() +
                                            "\nPerímetro do quadrado: " + getPerimetroQuadrado());
    }

    
}

