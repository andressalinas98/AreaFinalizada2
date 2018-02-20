
package area.solucion;

public class cuadrado extends Datos{
    @Override
    public void solucion (double s){
        area=s*s;
        perimetro=s*4;
    System.out.println("El area del cuadrado es: "+ area);
    System.out.println("El perimetro del cuadrado es: "+ perimetro);
    }
}
