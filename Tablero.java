/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package HundirLaFlota;

import javax.swing.JOptionPane;

/**
 *
 * @author cabdelda
 */
public class Tablero {

    char[][] tablero = new char[10][10];

    // Inicializa el tablero
    public void rellenarTablero() {
        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero[i].length; j++) {
                // Rellenar cada fila con su valor
                tablero[i][j] = 'X';
                System.out.print(tablero[i][j] + " "); // construccion del tablero
            }
            System.out.println(); // imprimir tras cada iteracion
        }
    }

    public boolean introduccirBarco(Barcos barco) {

        if (tablero[barco.x][barco.y] != 'X') {
            return false;
        } else {
            if (barco.vertical) {
                for (int i = 0; i < barco.getLongitud(); i++) {
                    if (i + barco.y > 9) {
                        return false;
                    }

                    if (tablero[barco.x][i + barco.y] != 'X') {
                        return false;
                    }

                }
            } else {
                for (int i = 0; i < barco.getLongitud(); i++) {
                    if (i + barco.x > 9) {
                        return false;
                    }

                    if (tablero[i + barco.x][barco.y] != 'X') {
                        return false;
                    }

                }
            }

        }

        for (int i = 0; i < barco.getLongitud(); i++) {
            System.out.println("Hola" + barco.isVertical());
            if (barco.isVertical()) {
                tablero[barco.getX() + i][barco.getY()] = barco.getId();
            } else {
                tablero[barco.getX()][barco.getY() + i] = barco.getId();
            }

        }

        return true;
    }

    public String tableroAString() {
        String tbmostrar = "";
        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero[i].length; j++) {
                tbmostrar += tablero[i][j] + "       ";
            }
            tbmostrar += '\n';

        }
        System.out.println(tbmostrar);
        return tbmostrar;
    }

    public void actualizarMovimiento(int x, int y){
       
        if (tablero[x][y] == 'A') {
            JOptionPane.showMessageDialog(null, "Mal tiro, fíjate bien !");
        } else {
            if (tablero[x][y] != 'X') {
                tablero[x][y] = 'T';
                
                
            } else if (tablero[x][y]== 'X') {
                tablero[x][y] = 'A';
                
            } else if (tablero[x][y]=='T'){
                JOptionPane.showMessageDialog(null, "Mal tiro, fíjate bien !");
            }
        }

    }

    

}
