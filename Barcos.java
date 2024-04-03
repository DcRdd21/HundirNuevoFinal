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
public abstract class Barcos {
    protected String nombre;
    protected  int longitud;
    protected  char id;
    protected int x;
    protected int y;
    protected boolean hundido;
    protected boolean vertical;
    protected int vida;




    public Barcos(String nombre, int longitud, char id, int x, int y, boolean hundido, boolean vertical) {
        this.nombre = nombre;
        this.longitud = longitud;
        this.id = id;
        this.x = x;
        this.y = y;
        this.hundido = hundido;
        this.vertical = vertical;
        vida = longitud;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getLongitud() {
        return longitud;
    }

    public void setLongitud(int longitud) {
        this.longitud = longitud;
    }

    public char getId() {
        return id;
    }

    public void setId(char id) {
        this.id = id;
    }
        public boolean isHundido() {
        return hundido;
    }

    public void setHundido(boolean hundido) {
        this.hundido = hundido;
    }

    public boolean isVertical() {
        return vertical;
    }

    public void setVertical(boolean vertical) {
        this.vertical = vertical;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

  public void vidas(Barcos barco) {
         if (barco.getVida()>1){                                   
                    JOptionPane.showMessageDialog(null, barco.getNombre() + " HUNDIDO");
                }else{
                    barco.setVida(barco.getVida()-1);
                }
    }
  
}
