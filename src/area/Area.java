/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package area;

import java.util.Scanner;
import area.solucion.*;
import area.solucion.cuadrado;
/**
 *
 * @author Estudiantes
 */
public class Area {

    /**
     * @param args the command line arguments
     */
    //presentado por:
    //Edwin Andres Salinas Chaparro 20172020087
    //Daniel Felipe Camargo Roa 20172020078
    //Diego Velez 20172020075
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("¿QUE TIPO DE FIGURA SE VA A ANALIZAR?");
        System.out.println("1.Cuadrado");
        System.out.println("2.Rectangulo");
        System.out.println("3.Triangulo Rectangulo");
        System.out.println("4.Circulo");
        int opcion = sc.nextInt();
        int x1, x2, y1, y2,s;
        System.out.println("Ingres la posicion del punto 1 en el eje X");
        x1 = sc.nextInt();
        System.out.println("Ingres la posicion del punto 1 en el eje y");
        y1 = sc.nextInt();
        System.out.println("Ingres la posicion del punto 2 en el eje X");
        x2 = sc.nextInt();
        System.out.println("Ingres la posicion del punto 2 en el eje y");
        y2 = sc.nextInt();
        s=((x2-x1)*(x2-x1))+((y2-y1)*(y2-y1));
        Datos d= null;
        switch (opcion) {
            case 1:
                d = new cuadrado ();
                break;
            case 2:
                d = new rectangulo ();
                break;
            case 3:
                d = new triangulo ();
                break;
            case 4:
                d = new circulo ();
                break;
        }
        d.setX1 (x1);
        d.setY1 (y1);
        d.setX2 (x2);
        d.setY1 (y2);
        d.setS (s);
        d.solucion ();
    }

}
