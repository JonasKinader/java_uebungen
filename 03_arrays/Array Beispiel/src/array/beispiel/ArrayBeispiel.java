/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package array.beispiel;

/**
 *
 * @author jk
 */
public class ArrayBeispiel {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int[] feld = new int [5];
        //feld [0] entspricht dem Wert 20
        //erstes feld
        feld[0] = 20;
        //feld[4] entspricht dem Wert 10
        //zweites feld
        feld[4] = 10;
        System.out.println(feld[0]);
        
        System.out.println(feld[4]);
        
        int summe = feld[0]+feld[4];
        
        System.out.println(summe);
        System.out.println("Leerzeichen");
        //System.out.println(feld[0]+feld[4]);
        
        
        //neues Array mit dem namen liste
        
        int liste [] = {12,23,24,35,45};
        //Ausgabe des Arrays liste
        System.out.println(liste[0]);
        System.out.println(liste[1]);
        System.out.println(liste[2]);
        System.out.println(liste[3]);
        System.out.println(liste[4]);
        System.out.println("Leerzeichen");
        //ausgabe mit for schleife 
        for (int i = 0; i < liste.length; i++) {
            System.out.println( liste[i]);
            
        }
        
        
        
    }
    
}
