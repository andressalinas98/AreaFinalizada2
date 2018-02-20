
package area.solucion;

public class circulo extends Datos{
        
     @Override
    public void solucion (double s){
        area=(double) (3.1415*(s*s));
        perimetro=(double) ((2*(3.1415*2))*s);
    System.out.println("El area del circulo es: "+ area);
    System.out.println("El perimetro del circulo es: "+ perimetro);
    }
    
}
