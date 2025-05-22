/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package zahlen.überpüfen;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class ZahlenÜberpüfen {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner (System.in);
        
        System.out.println("Ich vergleiche die Zahl die du Angibst ob sie Positiv oder Negativ ");
        System.out.println("Bitte gib die Zahl ein!");
        int eingabe = input.nextInt();
        
        if ( eingabe > 0)
        {
            System.out.println("Die Zahl ist Positiv!");
        }
        
        else
        {
            System.out.println("Die Zahl ist Negativ!");
        }
        
    }
    
}
