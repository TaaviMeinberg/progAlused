package klassid;
import java.util.*;

public class Proov3 {
    public static void main(String[] arg){
        List<Pall> pallid =new ArrayList<Pall>();
        pallid.add(new Pall(3,5,1));
        pallid.add(new Pall(3,8,1));
        pallid.add(new Pall(2,5,2));
        pallid.add(new Pall(-3,5,1));
        
        //Kuva suurima raadiusega pall
        double maxR =0;
        Pall pall = null;
        for(Pall p:pallid){
            System.out.println(p.getR());
            if(p.getR() > maxR){
                maxR = p.getR();
                pall = p;
            }
        }
        System.out.println("Suurim raadiusega pall on: "+pall +" raadiusega: " +maxR);
    }
}
