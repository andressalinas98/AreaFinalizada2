
package area.solucion;

public class Puntos {
    
    public int x1, y1, x2, y2, base, altura;
    double s;
    
    public void setP(int x1, int y1, int x2, int y2){
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }
    
    public double dist () {
        
        s=((x2-x1)*(x2-x1))+((y2-y1)*(y2-y1));
        s= (double) Math.sqrt(s);
        
        return s;
    }
    
    public int Base () {
        
        base =Math.abs((x2-x1));
        
        return base;
    }
    
    public int Altura () {
        
        altura =Math.abs((y2-y1));
        
        return altura;
    }
    
}
