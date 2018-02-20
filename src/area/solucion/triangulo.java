
package area.solucion;

public class triangulo extends Datos{
    
    @Override
    public void setP(int x1, int y1, int x2, int y2){
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }
    
     @Override
    public void solucion (double s){
        
        Puntos R = new Puntos();
        R.setP(x1, y1, x2, y2);
        
        base = R.Base();
        altura = R.Altura();
        
        area=((base*altura)/2);
        perimetro=((base)+(altura)+s);
        
    System.out.println("El area del triangulo rectangulo es: "+ area);
    System.out.println("El perimetro del triangulo rectangulo es: "+ perimetro);
    }
}
