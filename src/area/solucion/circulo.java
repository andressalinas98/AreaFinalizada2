/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package area.solucion;

/**
 *
 * @author Estudiantes
 */
public class circulo extends Datos{
     @Override
    public void solucion (){
        area=(int) (3.1415*(s*s));
        perimetro=(int) ((2*(3.1415*2))*s);
    System.out.println("El area del circulo es: "+ area);
    System.out.println("El perimetro del circulo es: "+ perimetro);
    }
}
