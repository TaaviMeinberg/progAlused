package algus;

import java.util.Arrays;

public class Massiivid {
    public static void main(String[] arg){
        int[] pikkused={176,159,364,214,121};
        System.out.println("Kokku: " + pikkused.length);
        System.out.println("Esimene: " + pikkused[0]);
        System.out.println("Viimane: " + pikkused[pikkused.length-1]);
        
        for(int i =0; i<pikkused.length; i++){
            System.out.println(pikkused[i]);
        }
        //Arvuta pikkuste summa
        int sum = 0;
        for(int i =0; i<pikkused.length; i++){
            sum = sum + pikkused[i];
        }
        System.out.println("Massiivi arvude summa on: " + sum);
        //Arvuta pikkuste keskmine
        double avg = sum / pikkused.length;
        System.out.println("Massiivi arvude keskmine on: " + avg);
        sum = 0;
        for (int pikkus : pikkused){sum+=pikkus;}
        System.out.println(sum);
        
        System.out.println(Arrays.stream(pikkused).sum());
    }
}
