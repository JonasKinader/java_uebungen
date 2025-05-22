/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package switchcaseerklärung;

import java.util.Scanner;

/**
 *
 * @author jk
 */
public class Switchcaseerklärung {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
      Scanner input =  new Scanner(System.in);  
      
        //System.out.println("Bitte gib deine Note ein:");
        
        //int note = input.nextInt();
        
        /*
        if (note == 1)
            {System.out.println("Sehr gut");}
        
        else if (note == 2)
            {System.out.println("Gut");}
        
         else if (note == 3)
            {System.out.println("Befriedigend");}
        
         else if (note == 4)
            {System.out.println("Ausreichend");}
        
         else if (note == 5)
            {System.out.println("Mangelhaft");}
        
         else if (note == 6)
            {System.out.println("Ungenügend");}
         else 
            {System.out.println("Eingabe unzulässig");}
        */
        
        
        // switch case kann auch in if else benutzt werden
        
        
        /*
        switch (note) {
            case 1:
                System.out.println("Sehr gut");
                break;
            case 2:
                System.out.println("Gut");
                break;
            case 3:
                System.out.println("Befriedigend");
                break;
            case 4:
                System.out.println("Ausreichend");
                break;
            case 5:
                System.out.println("Mangelhaft");
                break;
            case 6:
                System.out.println("Ungenügend");
                break;
            default:
                System.out.println("Eingabe unzulässig");
                break;
            }
        */
        
        System.out.println("Gib die nummer deiner Kaffewahl ein");
            
        int wahl = input.nextInt();
        
            switch (wahl) {
                case 1:
                    System.out.println("Kaffe schwarz");
                    break;
                case 2:
                    System.out.println("Kaffelatte");
                    break;
                case 3:
                    System.out.println("Kaffeweiß");
                    break;
                case 4:
                    System.out.println("Espresso");
                    break;
                default: 
                    System.out.println("Falsche Eingabe");
                
                    
            
            
            }
        
        
    }
    
}
