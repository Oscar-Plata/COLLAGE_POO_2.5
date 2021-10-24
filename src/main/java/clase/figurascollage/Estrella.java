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
public class Estrella {
    private Square[] pixels;
    private int tam;
    private int posX;
    private int posY;
    private String color;
    public Estrella(int x, int y,int t, String c ) {
       pixels=new Square[19];
       tam=t;
       posX=x;
       posY=y;
       color=c;
       //centro
       pixels[0]=new Square(x,y,t,c);
       pixels[1]=new Square(x-t,y,t,c);
       pixels[2]=new Square(x-t,y-t,t,c);
       pixels[3]=new Square(x,y-t,t,c);
       pixels[4]=new Square(x,y+t,t,c);
       pixels[5]=new Square(x+t,y+t,t,c);
       pixels[6]=new Square(x-t,y+t,t,c);
       pixels[7]=new Square(x+t,y,t,c);
       pixels[8]=new Square(x+t,y-t,t,c);
       //punta der
       pixels[9]=new Square(x+3*t,y,t,c);
       pixels[10]=new Square(x+2*t,y,t,c);
       //punta iz
       pixels[11]=new Square(x-3*t,y,t,c);
       pixels[12]=new Square(x-2*t,y,t,c);
       //punta arriba
       pixels[13]=new Square(x,y-3*t,t,c);
       pixels[14]=new Square(x,y-2*t,t,c);
       //punta diag iz
       pixels[15]=new Square(x+t,y+2*t,t,c);
       pixels[16]=new Square(x+2*t,y+3*t,t,c);
       //punta diag iz
       pixels[17]=new Square(x-t,y+2*t,t,c);
       pixels[18]=new Square(x-2*t,y+3*t,t,c);

    }
    public void dibujar() {
        for(int i=0;i<pixels.length;i++) {
           if(pixels[i]!=null) pixels[i].dibujar(); 
        }   
    }
    public void borrar() {
        for(int i=0;i<pixels.length;i++) {
           if(pixels[i]!=null) pixels[i].borrar(); 
        }
            
    }
    public void changeColor(String c) {
        for(int i=0;i<pixels.length;i++) {
           if(pixels[i]!=null) pixels[i].changeColor(c); 
        }
            
    }
}
