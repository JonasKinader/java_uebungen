/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package uri;

import java.awt.BorderLayout;
import java.util.Scanner;

/**
 *
 * @author user
 */
public class Uri {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        
        System.out.println("Uri rechner");
        System.out.println("Bitte gib an was du ausrechnen moechtest");
        System.out.println("1: U");
        System.out.println("2: R");
        System.out.println("3: I");
        int auswahl = input.nextInt();
        double u,r,i;
       
        if (auswahl == 1)//U=R*I
            
        {
            System.out.println("Gib R ein");
            r = input.nextDouble();
            System.out.println("Gib I ein");
            i = input.nextDouble();
            u = r * i;
            System.out.println("U = "+u);
            
         }
        
        else //I=U/R
        {  
            if( auswahl == 2)
            {
                System.out.println("Gib U ein");
                u = input.nextDouble();
                System.out.println("Gib R ein");
                r = input.nextDouble();
                i = u / r;
                System.out.println("U = "+i);
            
            }
            else //R=U/I
            {
                System.out.println("Gib U ein");
                u = input.nextDouble();
                System.out.println("Gib I ein");
                i = input.nextDouble();
                r = u / i;
                System.out.println("U = "+r);
            }
        
        }
        
        
        input.close();
        
        
        
        
        
        
        //Lösungsmöglichkeit von HR Henzel
        /*
        System.out.prinln("Bitte gebe Sie die Spannung ein!");
        U= input.nextDouble();
        System.out.println("Bitte geben Sie Strom ein!");
        I= input.nextDouble ();
        R=U/I
        System.out.println("Wiederstand = "+R)
        
        
        */
        
        
    }
    
}
