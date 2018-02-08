package klassid;

import java.io.*;

public class Proov4 {
    public static void main(String[] arg) throws Exception{
        PrintWriter pw=new PrintWriter(new FileWriter("fi.txt"));
        pw.println(new Pall(3,5,2));
        pw.close();
    }
}
