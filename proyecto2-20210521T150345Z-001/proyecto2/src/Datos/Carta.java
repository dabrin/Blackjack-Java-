/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Datos;

/**
 * 
 * @author dabri
 */
public class Carta {

    private int tipoCarta;
    private int color;
    private int numCarta;
    private boolean seleccionado;

    public Carta() {
    }
/**
 * 
 * @param tipoCarta
 * @param numCarta 
 */
    public Carta(int tipoCarta, int numCarta) {
        this.tipoCarta = tipoCarta;
        this.numCarta = numCarta;
    }
/**
 * 
 * @return 
 */
    public int getTipoCarta() {
        return tipoCarta;
    }
/**
 * 
 * @param tipoCarta 
 */
    public void setTipoCarta(int tipoCarta) {
        this.tipoCarta = tipoCarta;
    }
/**
 * 
 * @return 
 */
    public int getColor() {
        return color;
    }
/**
 * 
 * @param color 
 */
    public void setColor(int color) {
        this.color = color;
    }
/**
 * 
 * @return 
 */
    public int getNumCarta() {
        return numCarta;
    }/**
     * 
     * @param numCarta 
     */

    public void setNumCarta(int numCarta) {
        this.numCarta = numCarta;
    }
/**
 * 
 * @return 
 */
    public boolean isSeleccionado() {
        return seleccionado;
    }
/**
 * 
 * @param seleccionado 
 */
    public void setSeleccionado(boolean seleccionado) {
        this.seleccionado = seleccionado;
    }

}
