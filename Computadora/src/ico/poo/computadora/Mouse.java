/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ico.poo.computadora;

/**
 *
 * @author Enrique
 */
public class Mouse {
    private String marca;
    private int numeroBotones;
    private String x;
    private String y;

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getNumeroBotones() {
        return numeroBotones;
    }

    public void setNumeroBotones(int numeroBotones) {
        this.numeroBotones = numeroBotones;
    }

    public Mouse() {
    }

    public Mouse(String marca, int numeroBotones) {
        this.marca = marca;
        this.numeroBotones = numeroBotones;
        System.out.println("Posicion en:"+ x + "," + y);
    }
    
}
