/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Enrique
 */
public class Habitacion {
    private int tamaño;
    private boolean ventanas;
    private String tipoHabitacion;
    private boolean puerta;

    public int getTamaño() {
        return tamaño;
    }

    public void setTamaño(int tamaño) {
        this.tamaño = tamaño;
    }

    public boolean isVentanas() {
        return ventanas;
    }

    public void setVentanas(boolean ventanas) {
        this.ventanas = ventanas;
    }

    public String getTipoHabitacion() {
        return tipoHabitacion;
    }

    public void setTipoHabitacion(String tipoHabitacion) {
        this.tipoHabitacion = tipoHabitacion;
    }

    public boolean isPuerta() {
        return puerta;
    }

    public void setPuerta(boolean puerta) {
        this.puerta = puerta;
    }

    public Habitacion() {
    }

    public Habitacion(int tamaño, boolean ventanas, String tipoHabitacion, boolean puerta) {
        this.tamaño = tamaño;
        this.ventanas = ventanas;
        this.tipoHabitacion = tipoHabitacion;
        this.puerta = puerta;
        System.out.println("Entrando en la habitacion...");
    }
}
