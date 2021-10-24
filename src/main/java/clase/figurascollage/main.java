/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase.figurascollage;

import java.util.Scanner;

/**
 * Clase main con menu para manejar los collages
 * @author oscar jl Plata
 * @version  20/10/21
 */
public class main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Collage cg = new Collage(15);
        int posicion = 0;
        char comando = ' ';
        cg.genCollage();
        do {
            System.out.println(">> Comandos: ");
            System.out.println("[A] Avanzar\n[R] Retroceder\n[M] Pintar Morado\n"
                    + "[N] Pintar Naranja\n[G] Regenerar Collage\n[F] Salir");
            comando = sc.next().toLowerCase().charAt(0);
            switch (comando) {
                case 'a':
                    if (posicion >= 0 && posicion < 6) {
                        posicion++;

                    } else {
                        posicion = 0;
                    }
                    switchCollage(posicion, cg);
                    break;
                case 'r':
                    if (posicion > 0 && posicion <= 6) {
                        posicion--;
                    } else {
                        posicion = 6;
                    }
                    switchCollage(posicion, cg);
                    break;
                case 'm':
                    cg.Pintar(5, 15);
                    break;
                case 'n':
                    cg.Pintar(4, 15);
                    break;
                case 'g': 
                          switchCollage(posicion,cg);
                          
                          break;
                case 'e': cg.genEstrellas(); break;
                case'f':  System.out.println("Saliendo");
                    
            }
        } while (comando != 'f');
        System.out.println("Fin del programa");
        System.exit(0);
    }

    public static void switchCollage(int x, Collage cg) {
        System.out.println(x);
        switch (x) {

            case 1:
                cg.limpiar(15);
                cg.genCirculos();
                break;
            case 2:
                cg.limpiar(15);
                cg.genTriangulos();
                break;
            case 3:
                cg.limpiar(15);
                cg.genCuadros();
                break;
            case 4:
                cg.limpiar(15);
                cg.genRectangulos();
                break;
            case 5:
                cg.limpiar(15);
                cg.genTrapecios();
                break;
            case 6:
           
                cg.limpiar(15);
                cg.genEstrellas();
                break;
            case 0:
            default:
                cg.limpiar(15);
                cg.genCollage();
                break;
        }
    }

}
