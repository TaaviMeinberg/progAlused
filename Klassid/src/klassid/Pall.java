package klassid;

/**
 *
 * @author if17
 */
public class Pall {
    protected double x;
    protected double y;
    protected double r;
    public Pall(double x, double y, double r){
        this.x=x;
        this.y=y;
        this.r=r;
    }
    
    public double getX(){
        return x;
    }
    
    public double getY(){
        return y;
    }
    
    public double getR(){
        return r;
    }
    
    public double kaugusPallist(Pall teine){
        double dx = getX()-teine.getX();
        double dy = getY()-teine.getY();
        return Math.sqrt(dx*dx+dy*dy);
    }
    
    public double kaugusNullist(){
        return Math.sqrt(x*x +y*y);
    }
    public boolean kasPallidPuutuvad(Pall teine){
        if(kaugusPallist(teine) <= getR() + teine.getR()){
            System.out.println("Kaugus teisest pallist on: " + kaugusPallist(teine));
            return true;
        } else{
            return false;
        }
    }
    
    @Override
    public String toString(){
        return "Pall kohal ("+x+"; "+y+")";
    }
}
