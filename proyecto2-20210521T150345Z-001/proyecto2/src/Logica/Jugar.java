package Logica;

import Datos.Carta;
import Datos.Jugador;
import Vista.PVP;


import java.awt.BorderLayout;
import java.awt.PopupMenu;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
public class Jugar {
    public Carta baraja[][] = new Carta[4][13];
    Jugador[] v;
    manejadorNombres mN = new manejadorNombres();
    public boolean victoria;
     Calendar calendar = Calendar.getInstance();
    Date fecha = calendar.getTime();
    
    /**
     * 
     * @return 
     */
    public Jugador[] getV() {
        return v;
    }
/**
 * constructor
 */
   
    public Jugar() {

         // si es true es 1 vs 1
        this.victoria = false;
        this.v = new Jugador[10];
    }
   /**
    * 
    * @param v 
    */
    public void ordenar(Jugador v[]){
         for (int j = 0; j < v.length; j++) {
             for (int i = 0; i < v.length- j; i++) {
                 if (v[i].getNombre().compareTo(v[i + 1].getNombre()) > 0) {
                     //String aux;
                     Jugador e = v[i];
                     v[i] = v[i + 1];
                     v[i + 1] = e;
                 }
             }
         }
     
     }
/**
 * llena la baraja
 */
    public void llenarBaraja() {
        int matrizPrueba[][] = new int[4][13];
        int contTipoColor = 1;
        int contNum = 1;

        for (int i = 0; i < baraja.length; i++) {
            for (int j = 0; j < baraja[0].length; j++) {
                Carta cartaNueva = new Carta();
                switch (contTipoColor) {
                    case 1:
                        //picas
                        matrizPrueba[i][j] = contNum;
                        cartaNueva.setColor(0); // negro
                        cartaNueva.setTipoCarta(1);
                        cartaNueva.setNumCarta(contNum);
                        cartaNueva.setSeleccionado(false);
                        baraja[i][j] = cartaNueva;
                        break;
                    case 2:
                        //trebol
                        matrizPrueba[i][j] = contNum;
                        cartaNueva.setColor(0); // negro
                        cartaNueva.setTipoCarta(2);
                        cartaNueva.setNumCarta(contNum);
                        cartaNueva.setSeleccionado(false);
                        baraja[i][j] = cartaNueva;
                        break;
                    case 3:
                        //diamantes
                        matrizPrueba[i][j] = contNum;
                        cartaNueva.setColor(1); // rojo
                        cartaNueva.setTipoCarta(3);
                        cartaNueva.setNumCarta(contNum);
                        cartaNueva.setSeleccionado(false);
                        baraja[i][j] = cartaNueva;
                        break;
                    case 4:
                        //corazon
                        matrizPrueba[i][j] = contNum;
                        cartaNueva.setColor(1); // rojo
                        cartaNueva.setTipoCarta(4);
                        cartaNueva.setNumCarta(contNum);
                        cartaNueva.setSeleccionado(false);
                        baraja[i][j] = cartaNueva;
                        break;
                }//switch

                contNum++;
                if (contNum > 13) {
                    contNum = 1;
                    contTipoColor++;
                }//if

                if (contTipoColor > 4) {
                    contTipoColor = 1;
                }//if
            }//for j
        }//for i

        for (int x = 0; x < baraja.length; x++) {
            for (int y = 0; y < baraja[0].length; y++) {
                System.err.print(matrizPrueba[x][y] + "_");
            }
            System.err.println("");
        }
    }
/**
 * genera la carta del turno
 * @return 
 */
    public int[] seleccionarCarta() {
        // si fila es 0 = pica, 1= trebol, 2 = diamante, 3= corazon
        int fila = (int) (Math.random() * 3 + 1);
        int columna = (int) (Math.random() * 12 + 1);
        int carta[] = new int[2];

        while (baraja[fila][columna].isSeleccionado() == true) {
            fila = (int) (Math.random() * 3 + 1);
            columna = (int) (Math.random() * 12 + 1);
            System.err.println("el estado de la carta es: " + baraja[fila][columna].isSeleccionado());
        }// verifica que la carta no haya sido utilizada

        if (baraja[fila][columna].getTipoCarta() == 1) {
            if (baraja[fila][columna].getNumCarta() <= 9 && baraja[fila][columna].getNumCarta() > 1) {
                JOptionPane.showMessageDialog(null, "  pica #" + baraja[fila][columna].getNumCarta());
            } else if (baraja[fila][columna].getNumCarta() == 11) {
                System.err.println("  pica J");
            } else if (baraja[fila][columna].getNumCarta() == 12) {
                System.err.println("  pica Q");
            } else if (baraja[fila][columna].getNumCarta() == 13) {
                System.err.println("  pica K");
            } else if (baraja[fila][columna].getNumCarta() == 1 || baraja[fila][columna].getNumCarta() == 10) {
                System.err.println(" pica A");
            }
            baraja[fila][columna].setSeleccionado(true);
            carta[0] = baraja[fila][columna].getTipoCarta();
            carta[1] = baraja[fila][columna].getNumCarta();
        }
        if (baraja[fila][columna].getTipoCarta() == 2) {
            if (baraja[fila][columna].getNumCarta() <= 9 && baraja[fila][columna].getNumCarta() > 1) {
                System.err.println(" trebol #" + baraja[fila][columna].getNumCarta());
            } else if (baraja[fila][columna].getNumCarta() == 11) {
                System.err.println(" trebol J");
            } else if (baraja[fila][columna].getNumCarta() == 12) {
                System.err.println("  trebol Q");
            } else if (baraja[fila][columna].getNumCarta() == 13) {
                System.err.println("  trebol K");
            } else if (baraja[fila][columna].getNumCarta() == 1 || baraja[fila][columna].getNumCarta() == 10) {
                System.err.println(" trebol A");
            }
            baraja[fila][columna].setSeleccionado(true);
            carta[0] = baraja[fila][columna].getTipoCarta();
            carta[1] = baraja[fila][columna].getNumCarta();
        }

        if (baraja[fila][columna].getTipoCarta() == 3) {
            if (baraja[fila][columna].getNumCarta() <= 9 && baraja[fila][columna].getNumCarta() > 1) {
                System.err.println("  diamante #" + baraja[fila][columna].getNumCarta());
            } else if (baraja[fila][columna].getNumCarta() == 11) {
                System.err.println(" diamante J");
            } else if (baraja[fila][columna].getNumCarta() == 12) {
                System.err.println("  diamante Q");
            } else if (baraja[fila][columna].getNumCarta() == 13) {
                System.err.println("  diamante K");
            } else if (baraja[fila][columna].getNumCarta() == 1 || baraja[fila][columna].getNumCarta() == 10) {
                System.err.println(" diamante A");
            }
            baraja[fila][columna].setSeleccionado(true);
            carta[0] = baraja[fila][columna].getTipoCarta();
            carta[1] = baraja[fila][columna].getNumCarta();
        }
        if (baraja[fila][columna].getTipoCarta() == 4) {
            if (baraja[fila][columna].getNumCarta() <= 9 && baraja[fila][columna].getNumCarta() > 1) {
                System.err.println("corazon #" + baraja[fila][columna].getNumCarta());
            } else if (baraja[fila][columna].getNumCarta() == 11) {
                System.err.println(" corazon J");
            } else if (baraja[fila][columna].getNumCarta() == 12) {
                System.err.println("  corazon Q");
            } else if (baraja[fila][columna].getNumCarta() == 13) {
                System.err.println("  corazon K");
            } else if (baraja[fila][columna].getNumCarta() == 1 || baraja[fila][columna].getNumCarta() == 10) {
                System.err.println("  corazon A");
            }
            baraja[fila][columna].setSeleccionado(true);
            carta[0] = baraja[fila][columna].getTipoCarta();
            carta[1] = baraja[fila][columna].getNumCarta();

        }
        return carta;
    }
/**
 * genera el ganador/
 * @param puntos1
 * @param puntos2
 * @param nom1
 * @param nom2 
 */
    public void ganador(int puntos1, int puntos2, String nom1, String nom2) {
        mN.p1.setNombre(nom1);
        mN.p2.setNombre(nom2);
        
        
        
        if (puntos1 > 21 && puntos2 > 21) {

            JOptionPane.showMessageDialog(null, "No hay ganador");
        } else if (puntos1 > puntos2 && puntos1 <= 21) {
            mN.p1.setVictoria(true);
            JOptionPane.showMessageDialog(null, "Jugador " + nom1 + " ha ganado");
        } else if (puntos2 > 21 && puntos1 <= 21) {
            mN.p1.setVictoria(true);
            JOptionPane.showMessageDialog(null, "Jugador " + nom1 + " ha ganado");
        } else if (puntos2 > puntos1 && puntos2 <= 21) {
            mN.p2.setVictoria(true);
            JOptionPane.showMessageDialog(null, "Jugador " + nom2 + " ha ganado");
        } else if (puntos1 > 21 && puntos2 <= 21) {
            mN.p2.setVictoria(true);
            JOptionPane.showMessageDialog(null, "Jugador " + nom2 + " ha ganado");
        } else if (puntos1 == puntos2) {
            int carta[];
            llenarBaraja();

            carta = seleccionarCarta();
            puntos1 = carta[1];
            carta = seleccionarCarta();
            puntos2 = carta[1];
            if (puntos1 > puntos2) {
                JOptionPane.showMessageDialog(null, "Jugador " + nom1 + " ha ganado");
                mN.p1.setVictoria(true);
            } else if (puntos1 < puntos2) {
                JOptionPane.showMessageDialog(null, "Jugador " + nom2 + " ha ganado");
                mN.p2.setVictoria(true);
            } else if (puntos1 == puntos2) {
                carta = seleccionarCarta();
                puntos1 = carta[1];
                carta = seleccionarCarta();
                puntos2 = carta[1];
            }
            if (puntos1 > puntos2) {
                JOptionPane.showMessageDialog(null, "Jugador " + nom1 + " ha ganado");
                mN.p1.setVictoria(true);
            } else if (puntos1 < puntos2) {
                JOptionPane.showMessageDialog(null, "Jugador " + nom2 + " ha ganado");
                mN.p2.setVictoria(true);
            }

        }
        mN.p1.setPuntos(puntos1);
        mN.p2.setPuntos(puntos2);
        if (mN.p1.isVictoria() == true) {

             File f=new File("Rachas.txt");
        try {
            
            BufferedWriter bw=new BufferedWriter(new FileWriter(f,true));
            bw.write(mN.p1.getNombre()+";"+mN.p1.getPuntos()+";"+"\n");
            bw.close();
        }catch(NumberFormatException ex){
            JOptionPane.showMessageDialog(null, "El numero debe ser positivo");
        }
        catch (IOException ex) {
           JOptionPane.showMessageDialog(null, "Error de acceso al archivo");
        }
        } else if (mN.p2.isVictoria() == true) {
               File f=new File("Rachas.txt");
        try {
             
            BufferedWriter bw=new BufferedWriter(new FileWriter(f,true));
            bw.write(mN.p2.getNombre()+";"+mN.p2.getPuntos()+";"+fecha+"\n");
            bw.close();
        }catch(NumberFormatException ex){
            JOptionPane.showMessageDialog(null, "El numero debe ser positivo");
        }
        catch (IOException ex) {
           JOptionPane.showMessageDialog(null, "Error de acceso al archivo");
        }
        }
    }

    public void agregar(Jugador e) {
        for (int i = 0; i < v.length; i++) {
            if (v[i] == null) {
                v[i] = e;
                break;
            }
        }
    }

   

    



}