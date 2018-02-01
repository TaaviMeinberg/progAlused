package algus;


import java.util.Arrays;

public class Massiivid {
    //Koosta funktsioon, mis tagastab kaheelemendilise massiivi
    //Mille esimeseks elemendiks on etteantud arvudest suurim teiseks, vähim
    
    public static int[] highsetLowest(int[] array){
        int[] result = new int[2];
        int highest = array[0];
        int lowest = array[0];
        
        if(array ==null){
            throw new RuntimeException("parameetri väärtuseks on null");
        }
        if(array.length==0){
            throw new RuntimeException("Prameetriks on tühi massiiv");
        }
        
        for (int i = 0; i < array.length; i++) {
            if(array[i] > highest){
                highest = array[i];
            }
        }
        result[1] = highest;
        for (int i = 0; i < array.length; i++) {
            if(array[i] < lowest){
                lowest = array[i];
            }
        }
        result[0] = lowest;
        return result;
    }
    
    public static int summa(int[] arvud){
        int summa =0;
        for(int i =0; i<arvud.length; i++){
            summa = summa + arvud[i];
        }
        return summa;
    }
    
    
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
        System.out.println(summa(pikkused));
        
        System.out.println(Arrays.stream(pikkused).sum());
        System.out.println("Väikseim arv: " + highsetLowest(pikkused)[0]);
        System.out.println("Suurim arv: " + highsetLowest(pikkused)[1]);
    }
}
