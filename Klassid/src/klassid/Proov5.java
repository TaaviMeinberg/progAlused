package klassid;
import java.io.*;
import java.util.*;
public class Proov5 {
    public static void main(String[] arg) throws Exception{
        BufferedReader br = new BufferedReader(new FileReader("input.txt"));
        String rida = br.readLine();
        List<Pall> pallid = new ArrayList<Pall>();
        while(rida !=null){
            System.out.println(rida);
            String[] tykid=rida.split(" ");
            pallid.add(new Pall(Double.parseDouble(tykid[0]), Double.parseDouble(tykid[1]), Double.parseDouble(tykid[2])));
            rida = br.readLine();
        }
        br.close();
        System.out.println(pallid);
    }
}
