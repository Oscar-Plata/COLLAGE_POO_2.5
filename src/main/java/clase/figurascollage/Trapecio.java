/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase.figurascollage;

/**
 *
 * @author oscar
 */
public class Trapecio {

    private Square cuadro;
    private Triangle tIzquierda;
    private Triangle tDerecha;
    private int tamaño;
    private String color;
    private int xPosition;
    private int yPosition;

    public Trapecio(int x, int y,int t, String c ) {
        tIzquierda = new Triangle(x, y, t, (t + 10), c);
        tDerecha = new Triangle(x + t, y, t, (t + 10), c);
        cuadro = new Square(x, y, t, c);

    }

    public Trapecio() {
        int x = 60, y = 60, t = 80;
        String c = "custom";
        tIzquierda = new Triangle(x, y, t, (t + 10), c);
        tDerecha = new Triangle(x + t, y, t, (t + 10), c);
        cuadro = new Square(x, y, t, c);

    }

    public void dibujar() {
        cuadro.dibujar();
        tIzquierda.dibujar();
        tDerecha.dibujar();
    }
    public void borrar() {
        cuadro.borrar();
        tIzquierda.borrar();
        tDerecha.borrar();
    }

    public int getTamaño() {
        return tamaño;
    }

    public void setTamaño(int tamaño) {
        this.tamaño = tamaño;
        cuadro.changeSize(tamaño);
        tDerecha.changeSize(tamaño, tamaño + 10);
        tIzquierda.changeSize(tamaño, tamaño + 10);

    }

    public String getColor() {
        return color;
    }
    

    public void changeColor(String color) {
        this.color = color;
        cuadro.changeColor(color);
        tIzquierda.changeColor(color);
        tDerecha.changeColor(color);
    }

    public int getxPosition() {

        return xPosition;
    }

    public int getyPosition() {
        return yPosition;
    }

    public void setPosition(int x, int y) {
        this.xPosition = x;
        this.yPosition = y;
        cuadro.setPosition(x, y);
        tIzquierda.setPosition(x, y);
        tDerecha.setPosition(x, y);
    }
    //Borrar
}
