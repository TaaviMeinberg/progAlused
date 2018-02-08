/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package klassid;

public class Proov {
    public static void main(String[] arg){
        Pall p1= new Pall(3,5,8);
        Pall p2= new Pall(4,6,6);
        Pall p3= new Pall(10,6,7);
        System.out.println(p1 + " kaugus nullist: " + p1.kaugusNullist());
        System.out.println(p2 + " kaugus nullist: " + p2.kaugusNullist());
        System.out.println(p3 + " kaugus nullist: " + p3.kaugusNullist());
        System.out.println("Omavaheline kaugus: " + p1.kaugusPallist(p2));
        
        System.out.println("Kas pallid: " +p1+ " ja " +p2+ " puutuvad: " +p1.kasPallidPuutuvad(p2));
    }
}
