/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Enrique
 */
public class Puertas {
    private int numeroPuertas;
    private int tamañoPuertas;
    private String material;
    private boolean deslizable;

    public int getNumeroPuertas() {
        return numeroPuertas;
    }

    public void setNumeroPuertas(int numeroPuertas) {
        this.numeroPuertas = numeroPuertas;
    }

    public int getTamañoPuertas() {
        return tamañoPuertas;
    }

    public void setTamañoPuertas(int tamañoPuertas) {
        this.tamañoPuertas = tamañoPuertas;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public boolean isDeslizable() {
        return deslizable;
    }

    public void setDeslizable(boolean deslizable) {
        this.deslizable = deslizable;
    }

    public Puertas() {
    }

    public Puertas(int numeroPuertas, int tamañoPuertas, String material, boolean deslizable) {
        this.numeroPuertas = numeroPuertas;
        this.tamañoPuertas = tamañoPuertas;
        this.material = material;
        this.deslizable = deslizable;
     
        System.out.println("Abriendo puerta...");  
    }

}