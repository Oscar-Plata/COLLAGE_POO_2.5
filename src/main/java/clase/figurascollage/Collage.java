/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase.figurascollage;

import java.util.Random;

/**
 *
 * @author oscar
 */
public class Collage {

    private Circle[] circulos;
    private Triangle[] triangulos;
    private Square[] cuadros;
    private Rectangulo[] rectangulos;
    private Trapecio[] trapecios;
    private Estrella[] estrellas;

    public Collage(int x) {
        circulos = new Circle[x];
        triangulos = new Triangle[x];
        cuadros = new Square[x];
        rectangulos = new Rectangulo[x];
        trapecios = new Trapecio[x];
        estrellas = new Estrella[x];
    }

    public void genCollage() {
        genCirculos();
        genCuadros();
        genTrapecios();
        genTriangulos();
        genRectangulos();
    }

    public void genCuadros() {
        Random rnd = new Random();
        int xPos, yPos, tam, col;
        for (int i = 0; i < cuadros.length; i++) {
            xPos = rnd.nextInt(700) + 1;
            yPos = rnd.nextInt(700) + 1;
            tam = rnd.nextInt(110) + 10;
            col = rnd.nextInt(7);
            cuadros[i] = new Square(xPos, yPos, tam, genColor(col));
            cuadros[i].dibujar();
        }
    }

    public void genTrapecios() {
        Random rnd = new Random();
        int xPos, yPos, tam, col;
        for (int i = 0; i < trapecios.length; i++) {
            xPos = rnd.nextInt(700) + 1;
            yPos = rnd.nextInt(700) + 1;
            tam = rnd.nextInt(110) + 10;
            col = rnd.nextInt(7);
            trapecios[i] = new Trapecio(xPos, yPos, tam, genColor(col));
            trapecios[i].dibujar();
        }
    }

    public void genTriangulos() {
        Random rnd = new Random();
        int xPos, yPos, tam, col;
        for (int i = 0; i < triangulos.length; i++) {
            xPos = rnd.nextInt(700) + 1;
            yPos = rnd.nextInt(700) + 1;
            tam = rnd.nextInt(110) + 10;
            col = rnd.nextInt(7);
            triangulos[i] = new Triangle(xPos, yPos, tam, tam + 10, genColor(col));
            triangulos[i].dibujar();
        }
    }

    public void genCirculos() {
        Random rnd = new Random();
        int xPos, yPos, tam, col;
        for (int i = 0; i < circulos.length; i++) {
            xPos = rnd.nextInt(700) + 1;
            yPos = rnd.nextInt(700) + 1;
            tam = rnd.nextInt(110) + 10;
            col = rnd.nextInt(7);
            circulos[i] = new Circle(xPos, yPos, tam, genColor(col));
            circulos[i].dibujar();
        }
    }

    public void genRectangulos() {
        Random rnd = new Random();
        int xPos, yPos, anc, lar, col;
        for (int i = 0; i < circulos.length; i++) {
            xPos = rnd.nextInt(700) + 1;
            yPos = rnd.nextInt(700) + 1;
            lar = rnd.nextInt(110) + 10;
            anc = rnd.nextInt(110) + 10;
            col = rnd.nextInt(7);
            rectangulos[i] = new Rectangulo(xPos, yPos, anc, lar, genColor(col));
            rectangulos[i].dibujar();
        }
    }

    public String genColor(int x) {
        String col;
        switch (x) {
            case 0:
                col = "rojo";
                break;
            case 1:
                col = "azul";
                break;
            case 2:
                col = "amarillo";
                break;
            case 3:
                col = "verde";
                break;
            case 4:
                col = "naranja";
                break;
            case 5:
                col = "magenta";
                break;
            case 6:
                col = "blanco";
                break;
            default:
                col = "custom";
                break;
        }
        return col;
    }

    public void limpiar(int borr) {
        for (int i = 0; i < borr; i++) {
            if (circulos[i] != null) {
                circulos[i].borrar();
            }
            if (cuadros[i] != null) {
                cuadros[i].borrar();
            }
            if (rectangulos[i] != null) {
                rectangulos[i].borrar();
            }
            if (triangulos[i] != null) {
                triangulos[i].borrar();
            }
            if (trapecios[i] != null) {
                trapecios[i].borrar();
            }
            if (estrellas[i] != null) {
                estrellas[i].borrar();
            }
        }
    }

    public void Pintar(int c, int borr) {
        for (int i = 0; i < borr; i++) {
            if (circulos[i] != null) {
                circulos[i].changeColor(genColor(c));
            }
            if (cuadros[i] != null) {
                cuadros[i].changeColor(genColor(c));
            }
            if (rectangulos[i] != null) {
                rectangulos[i].changeColor(genColor(c));
            }
            if (triangulos[i] != null) {
                triangulos[i].changeColor(genColor(c));
            }
            if (trapecios[i] != null) {
                trapecios[i].changeColor(genColor(c));
            }
             if (estrellas[i] != null) {
                estrellas[i].changeColor(genColor(c));
            }
        }
    }

    public void genEstrellas() {
        Random rnd = new Random();
        int xPos, yPos, tam, col;
        for (int i = 0; i < estrellas.length; i++) {
            xPos = rnd.nextInt(700) + 1;
            yPos = rnd.nextInt(700) + 1;
            tam = rnd.nextInt(50) + 1;
            col = rnd.nextInt(7);
            estrellas[i] = new Estrella(xPos, yPos, tam, genColor(col));
            estrellas[i].dibujar();

        }
    }
}
