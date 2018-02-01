/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algus;

/**
 *
 * @author if17
 */
public class Algus {
    /**
     * Alamprogramm toasoojuse hindamiseks vastavalt temperatuurile
     * Ja vähemasti 3 taset
     */
    
    public static void soojuseHindamine(int toaTemp) {
        if (toaTemp > 35) {
            System.out.println("Väga palav!");
        } else if (toaTemp < 35 && toaTemp > 25){
            System.out.println("Soe");
        } else if (toaTemp < 25 && toaTemp > 15){
            System.out.println("Külm");
        } else {
            System.out.println("Väga külm!");
        }
    }
    
    /**
     * Arvamus ilma kohta
     */
    public static void ilmaKommentaar(int temperature) {
        if (temperature > 0) {
            System.out.println("Sulab");
        } else{
            System.out.println("Jäätab");
        }
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ilmaKommentaar(-5);
        soojuseHindamine(10);
        System.out.println("Hello World!");
        
    }
    
}
