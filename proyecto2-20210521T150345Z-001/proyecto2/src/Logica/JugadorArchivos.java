/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

;import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

import javax.swing.JOptionPane;


/**
 *
 * @author dabrin Najera
 */
public class JugadorArchivos {
    
    String nombre;
   
    
    
    
    public void borrar(ArrayList nombres) {
        JugadorArchivos archivos = new JugadorArchivos();
        File fb = new File("NombresBorrados.txt");
        try {
            BufferedWriter bww = new BufferedWriter(new FileWriter(fb, true));            
            BufferedReader brr = new BufferedReader(new FileReader(fb));
            String linea1 = "";
            while (linea1 != null) {
                linea1 = brr.readLine();
            }
            for (int i = 0; i < nombres.size(); i++) {
                if (nombres.get(i).equals("*" + nombres.get(i))) {
                    bww.write(nombres.get(i) + "\n");
                }
            }
            bww.close();
        } catch (IOException ex) {
        }
        
    }
}
