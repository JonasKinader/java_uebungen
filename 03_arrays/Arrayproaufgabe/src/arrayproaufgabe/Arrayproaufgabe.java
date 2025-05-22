/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arrayproaufgabe;

import java.util.Scanner;

/**
 *
 * @author jk
 */
public class Arrayproaufgabe {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //Erstellen Sie eine Methode, welche ein Array mit den Seitenlängen eines Quadrats entgegennimmt
        //und das Quadrat in Form von "*" auf der Console ausgibt.
       
        //quadrat();
        sternq();
       
        
        
    }
    
    static void sternq(){
        
    Scanner input = new Scanner(System.in);
    
    double quaderl[] = new double [4];
    String stern = "*";
    
    System.out.println("Geben sie eine Seitenlänge des Quadrats ein! ");
    double a = input.nextDouble();
    
        for (int i = 0; i < quaderl.length; i++) {
            
            quaderl[i] = a;

        }
        
        for (int i = 1; i <= quaderl[0]; i++) {
            
            System.out.print(stern +" ");
            
        }
        System.out.println("");
        for (int i = 1; i <= quaderl[1] -2; i++) {
            
            System.out.println(stern + " ".repeat((int)quaderl[3]*2-3)+stern);
        }
        
        for (int i = 1; i <= quaderl[3]; i++) {
            
            System.out.print(stern +" ");
  
        }
        
        
    
    }
    
    
    
    
    
    
    
    
    
    
    
    
    /*
    // lösung ohne array
    static void quadrat (){
        System.out.println("Geben sie eine Seitenlänge des Quadrats ein! ");
        Scanner input = new Scanner(System.in);
        double b = input.nextDouble();
        String stern = "*";
        for (int i = 1; i <= b; i++) {
            System.out.print(stern +" ");
            
        }
        System.out.println("");
        for (int i = 0; i <= b - 3; i++) {
            System.out.println(stern + " ".repeat((int)b*2-3)+stern);
        }
        for (int i = 1; i <= b; i++) {
            System.out.print(stern +" ");
            
        }
    }
    */

      
}


  