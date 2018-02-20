
package area;

import java.util.Scanner;
import area.solucion.*;
import area.solucion.cuadrado;

public class Area {

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
        int x1, x2, y1, y2;
        System.out.println("Ingrese X1");
        x1 = sc.nextInt();
        System.out.println("Ingrese Y1");
        y1 = sc.nextInt();
        System.out.println("Ingrese X2");
        x2 = sc.nextInt();
        System.out.println("Ingrese Y1");
        y2 = sc.nextInt();
        
        Puntos pt = new Puntos();
        pt.setP(x1, y1, x2, y2);
        double s = pt.dist();
        
        switch (opcion) {
            case 1:
                cuadrado sqrt = new cuadrado ();
                sqrt.solucion(s);
                break;
            case 2:
                rectangulo rect = new rectangulo ();
                rect.setP(x1, y1, x2, y2);
                rect.solucion(s);
                break;
            case 3:
                triangulo trig = new triangulo ();
                trig.setP(x1, y1, x2, y2);
                trig.solucion(s);
                break;
            case 4:
                circulo circ = new circulo ();
                circ.solucion(s);
                break;
        }
    }

}
