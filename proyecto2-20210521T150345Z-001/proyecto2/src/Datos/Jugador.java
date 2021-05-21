/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Datos;

import java.util.Date;

/**
 * 
 * @author dabrin Najrta, Raquel Solano
 */
public class Jugador {
    public java.util.Date fecha = new Date();
    private String nombre;
    private boolean turno;
    private int puntos;
    private int posicion;
    private boolean victoria;
/**
 * 
 * @param nombre
 * @param turno
 * @param puntos
 * @param posicion
 * @param victoria 
 */
    public Jugador(String nombre, boolean turno, int puntos, int posicion, boolean victoria) {
        this.nombre = nombre;
        this.turno = turno;
        this.puntos = puntos;
        this.posicion = posicion;
        this.victoria = victoria;
    }

  /**
   * 
   */
    public Jugador(){
        this.nombre="sin nombre";
        this.turno=true;
        this.puntos=0;
        this.posicion=0;
        this.victoria=false;
    }
/**
 * 
 * @param nombre
 * @param puntos
 * @param fecha 
 */
    public Jugador(String nombre, int puntos,java.util.Date fecha) {
         //To change body of generated methods, choose Tools | Templates.
         this.nombre = nombre;
         this.puntos = puntos;
         this.fecha =fecha;
    }
/**
 * 
 * @param nombre 
 */
    public Jugador(String nombre) {
        this.nombre = nombre;
    }
    
/**
 * 
 * @return 
 */
    public String getNombre() {
        return nombre;
    }
/**
 * 
 * @param nombre 
 */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
/**
 * 
 * @return 
 */
    public boolean isTurno() {
        return turno;
    }

    public void setTurno(boolean turno) {
        this.turno = turno;
    }

    public int getPuntos() {
        return puntos;
    }

    public void setPuntos(int puntos) {
        this.puntos = puntos;
    }

    public int getPosicion() {
        return posicion;
    }

    public void setPosicion(int posicion) {
        this.posicion = posicion;
    }

    public boolean isVictoria() {
        return victoria;
    }

    public void setVictoria(boolean victoria) {
        this.victoria = victoria;
    }

    @Override
    
    public String toString() {
        return "Jugador " + " nombre=" + nombre+" " + "puntos= " + puntos+" racha: "+posicion+" fecha: "+fecha;
    }
/**
 * 
 * @return 
 */
    public Jugador toUpperCase() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
