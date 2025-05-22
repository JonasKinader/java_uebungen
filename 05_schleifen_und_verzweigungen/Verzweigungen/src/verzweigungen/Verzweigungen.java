/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package verzweigungen;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class Verzweigungen {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.println("Bitte geben sie eine Zahl ein: ");
        int Zahl = input.nextInt();
        
        if (Zahl > 0) 
        {
            System.out.println("Die Zahl: "+ Zahl +  " ist Groesser wie 0");
            //Anweisungen;
        
        } 
        else
        { 
            System.out.println("Die Zahl: "+Zahl+"ist kleiner als  0");
            //Anweisung wenn bedinung nicht erfüllt wird
        }
        input.close();
        
    }
    
}
