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
public class rectangulo extends Datos {
     @Override
    public void solucion (){
        area=(s/2)*s;
        perimetro=s*3;
    System.out.println("El area del rectangulo es: "+ area);
    System.out.println("El perimetro del rectangulo es: "+ perimetro);
    }
}
