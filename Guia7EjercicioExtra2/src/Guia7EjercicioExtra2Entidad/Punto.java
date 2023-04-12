/*
 Definir una clase llamada Puntos que contendrá las coordenadas de dos 
puntos, sus atributos serán, x1, y1, x2, y2, siendo cada x e y un punto. 
Generar un objeto puntos usando un método crearPuntos() que le pide al 
usuario los dos números y los ingresa en los atributos del objeto. 
Después, a través de otro método calcular y devolver la distancia que 
existe entre los dos puntos que existen en la clase Puntos. Para conocer 
como calcular la distancia entre dos puntos consulte el siguiente link:
http://www.matematicatuya.com/GRAFICAecuaciones/S1a.html

 */
package Guia7EjercicioExtra2Entidad;

import java.util.Scanner;


public class Punto {
    
    private double x1;
    private double x2;
    private double y1;
    private double y2;

    public Punto() {
    }

    public Punto(double x1, double x2, double y1, double y2) {
        this.x1 = x1;
        this.x2 = x2;
        this.y1 = y1;
        this.y2 = y2;
    }

    public double getX1() {
        return x1;
    }

    public void setX1(double x1) {
        this.x1 = x1;
    }

    public double getX2() {
        return x2;
    }

    public void setX2(double x2) {
        this.x2 = x2;
    }

    public double getY1() {
        return y1;
    }

    public void setY1(double y1) {
        this.y1 = y1;
    }

    public double getY2() {
        return y2;
    }

    public void setY2(double y2) {
        this.y2 = y2;
    }
    
    
    
    public void crearPuntos(){
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese los puntos correspondientes a X1 e X2:");
        double x1 = leer.nextDouble();
        this.x1 = x1;
        double x2 = leer.nextDouble();
        this.x2 = x2;
    System.out.println("Ingrese los puntos correspondientes a Y1 e Y2:");
        double y1 = leer.nextDouble();
        this.y1 = y1;
        double y2 = leer.nextDouble();
        this.y2 = y2;
    }

    public double resultado() {
        double x = x2 - x1;
        double y = y2 - y1;
        double resultado = Math.sqrt(Math.pow(x,2)+Math.pow(y,2));
        System.out.println("x: "+x+ " y: "+y);
        System.out.println("x1:"+x1+" x2: "+x2+ " y1: "+y1+" y2: "+y2);
        System.out.println("x2-x1="+(x2-x1));
        System.out.println("y2-y1="+(y2-y1));
        return resultado;
    }
    /*
    public void crearPuntos() {
    Scanner leer = new Scanner(System.in);  
        System.out.println("Ingrese el punto x1");
        x1 = leer.nextDouble();
        System.out.println("Ingrese el punto y1");
        y1 = leer.nextDouble();
        System.out.println("Ingrese el punto x2");
        x2 = leer.nextDouble();
        System.out.println("Ingrese el punto y2");
        y2 = leer.nextDouble();
    }
    
    public void calcularDistancia ( ) {
        double x = x2 - x1;
        double y = y2 - y1;
        double resultado = Math.sqrt(Math.pow(x,2)+Math.pow(y,2));
        System.out.println("El resultado es:"+ resultado);
    */
    
}


