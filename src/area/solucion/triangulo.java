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
public class triangulo extends Datos{
     @Override
    public void solucion (){
        area=(int) (Math.sqrt((3*s)/2)) * s;
        perimetro=s*3;
    System.out.println("El area del triangulo es: "+ area);
    System.out.println("El perimetro del triangulo es: "+ perimetro);
    }
}
