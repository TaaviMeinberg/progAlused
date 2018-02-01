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
        System.out.println("Hello World!");
        
    }
    
}
