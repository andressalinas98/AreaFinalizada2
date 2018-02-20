
package area.solucion;

public abstract class Datos {
    double area,perimetro,s;
    int base, altura;
    int x1, y1, x2, y2;
    
    Puntos P = new Puntos();
    
    public void setP(int x1, int y1, int x2, int y2){
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
        
        P.setP(x1, y1, x2, y2);
        s = P.dist();
        
    }
    
    public abstract void solucion (double s);
}
