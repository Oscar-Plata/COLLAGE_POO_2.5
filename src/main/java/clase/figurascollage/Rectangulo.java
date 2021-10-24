/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase.figurascollage;

import java.awt.*;

/**
 * Creador  de rectangulos para dibujar en canvas
 * @author oscar jl Plata
 * @version 20/10/21
 */
public class Rectangulo {

    private int ancho;
    private int largo;
    private int xPosition;
    private int yPosition;
    private String color;
    private boolean isVisible;

    public Rectangulo( int x, int y,int a, int l, String c) {
        ancho = a;
        largo = l;
        xPosition = x;
        yPosition = y;
        color = c;
        isVisible = true;
    }

    public void setPosition(int x, int y) {
        this.xPosition = x;
        this.yPosition = y;
    }

    public void borrar() {
        erase();
        isVisible = false;
    }

    public void dibujar() {
        isVisible = true;
        draw();
    }
    public void changeColor(String newColor) {
        color = newColor;
        draw();
    }
    private void draw() {
        if (isVisible) {
            Canvas canvas = Canvas.getCanvas();
            canvas.draw(this, color,
                    new Rectangle(xPosition, yPosition, ancho, largo));
            canvas.wait(10);
        }
    }

    /**
     * Erase the square on screen.
     */
    private void erase() {
        if (isVisible) {
            Canvas canvas = Canvas.getCanvas();
            canvas.erase(this);
        }
    }
}
