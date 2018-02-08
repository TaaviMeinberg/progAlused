package klassid;

/**
 *
 * @author if17
 */
public class Proov2 {
    public static void main(String[] arg){
        Pall[] pallid = new Pall[3];
        pallid[0]= new Pall(3,5,1);
        pallid[1]= new Pall(4,6,1);
        pallid[2]= new Pall(-10,8,2);
        
        double max = 0;
        int index = 0;
        for(int i = 0; i<pallid.length; i++){
            if(pallid[i].kaugusNullist() > max){
                index = i;
                max = pallid[i].kaugusNullist();
            }
        }
        System.out.println("Nullist kõige kaugemal olev pall on: " + pallid[index]+ " kaugusega: "+max);
    }
}
