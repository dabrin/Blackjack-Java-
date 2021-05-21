/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

import Datos.Jugador;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

import javax.swing.JOptionPane;

/**
 *
 * @author dabri
 */
public class manejadorNombres {

    public Jugador p1;
    public Jugador p2;
   ArrayList lista = new ArrayList();
   /**
    * @param 
    * MAnejador Nombres
    */
    public manejadorNombres() {
        this.p1 = new Jugador();
        this.p2 = new Jugador();
    }
    /**
     * @param 
     */
    public void nombreDeJugadores() {
        File f = new File("Nombres.txt");
        int modoJuego;
       
            String nom1 = JOptionPane.showInputDialog(null, "Inserte el nombre del jugador 1"); 
            String nom2 = JOptionPane.showInputDialog(null, "Inserte el nombre del jugador 2");
            p1.setNombre(nom1);  
            p2.setNombre(nom2);
            
          if (p1.getNombre() == null) {
            p1.setNombre(nom1);
        }
        if (p2.getNombre() == null) {
            p2.setNombre(nom1);
        }
        String linea1 = "";

         try {
            
            BufferedWriter bw = new BufferedWriter(new FileWriter(f, true));
            BufferedReader br = new BufferedReader(new FileReader(f));
            //String linea1 = "";
            int cont = 0;
            while (linea1 != null) {
                linea1 = br.readLine();
                if (p1.getNombre().equals(linea1)) {

                    cont = 1;

                }
                if (p2.getNombre().equals(linea1)) {
                    cont = 2;
                }
            }
            if (cont == 0) {
                bw.write(p1.getNombre() + "\n");
            } else {
                JOptionPane.showMessageDialog(null, "El nombre ya existe");
            }
            if (cont != 2) {
                bw.write(p2.getNombre() + "\n");
            } else {
                JOptionPane.showMessageDialog(null, "El nombre ya existe");
            }
            bw.close();
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "Error de acceso al archivo");
        }

        System.err.println("los jugadores son: " + p1.getNombre() + ", " + p2.getNombre());

    }
    /**
     * @return
     * @param 
     */
    
    public void nombreJugador() {
        String nom1 = JOptionPane.showInputDialog(null, "inserte el nombre del jugador 1");
        p1.setNombre(nom1);
        p2.setNombre("PC");
        if (p1.getNombre() == null) {
            p1.setNombre(nom1);
        }

        lista.add(p1);
        lista.add(p2);
        File f = new File("Nombres.txt");
        try {
            int c = 0;
            BufferedWriter bw = new BufferedWriter(new FileWriter(f, true));
            BufferedReader br = new BufferedReader(new FileReader(f));
            String linea1 = "";
            int cont = 0;
            while (linea1 != null) {
                linea1 = br.readLine();
                if (p1.getNombre().equals(linea1)) {

                    cont = 1;

                }
                if (p2.getNombre().equals(linea1)) {
                    cont = 2;
                }
            }
            if (cont == 0) {
                bw.write(p1.getNombre() + "\n");
            } else {
                JOptionPane.showMessageDialog(null, "El nombre ya existe");
            }
            if (cont != 2) {
                bw.write(p2.getNombre() + "\n");
            } else {
                JOptionPane.showMessageDialog(null, "El nombre ya existe");
            }
            bw.close();
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "Error de acceso al archivo");
        }

        System.err.println("los jugadores son: " + p1.getNombre() + ", " + p2.getNombre());

    }
    
}
