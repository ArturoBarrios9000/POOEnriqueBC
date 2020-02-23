/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Enrique
 */
public class Ventanas {
    private int tamañoVentana;
    private String tipoVentana;
    private int cantidadCristal;
    private boolean mosquitero;

    public int getTamañoVentana() {
        return tamañoVentana;
    }

    public void setTamañoVentana(int tamañoVentana) {
        this.tamañoVentana = tamañoVentana;
    }

    public String getTipoVentana() {
        return tipoVentana;
    }

    public void setTipoVentana(String tipoVentana) {
        this.tipoVentana = tipoVentana;
    }

    public int getCantidadCristal() {
        return cantidadCristal;
    }

    public void setCantidadCristal(int cantidadCristal) {
        this.cantidadCristal = cantidadCristal;
    }

    public boolean isMosquitero() {
        return mosquitero;
    }

    public void setMosquitero(boolean mosquitero) {
        this.mosquitero = mosquitero;
    }

    public Ventanas() {
    }

    public Ventanas(int tamañoVentana, String tipoVentana, int cantidadCristal, boolean mosquitero) {
        this.tamañoVentana = tamañoVentana;
        this.tipoVentana = tipoVentana;
        this.cantidadCristal = cantidadCristal;
        this.mosquitero = mosquitero;
        System.out.println("Abriendo Ventana...");
    }
    
}