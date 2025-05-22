/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package methodenerklärung;

import java.util.Scanner;

/**
 *
 * @author jk
 */
public class Methodenübung {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //methode 1
        double ergebnis = berechneSumme(4.0,6.0);
        System.out.println(ergebnis);
        double lösung = berechneSumme(52.0,34.23);
        System.out.println(lösung);
        double rechnen = berechneSumme(12.32,23.123);
        System.out.println(rechnen);
        //methode 2
        System.out.println("Methode 2:Bitte geben Sie ihren Vornamen ein:");
        String vorname = strEingabe();
        System.out.println(vorname);
        //methode 3
        System.out.println("Methode 3:Bitte geben Sie ihren Vornamen ein:");
        begruessung(strEingabe());
        //methode 4
        efehler();
        
        //Aufgabe 1
        int erg = bSumme(4, 6);
        System.out.println(erg);
        //Aufgabe 2
        boolean ger = istGerade(5);
        System.out.println(ger);
        
        
    }    
       //Methode 1 mit Rückgabewert und Übergabeparameter
       static double berechneSumme (double x, double y)
        {
       
            double summe = x + y;
            return summe;
        }
       //Methode 2 Rückgabewert
       static String strEingabe()
       {
           
           Scanner input = new Scanner(System.in);
           String eingabe = input.nextLine();
           return eingabe;
       }
        //Methode 3 mit Übergabeparameter
       static void begruessung(String name)
       {
           System.out.println("Herzlich Willkommen in unserem Restaurant Herr/Frau "+name);
       }
       //Methode 4
       static void efehler ()
       {
           System.out.println("Methode 4: Ihre Eingabe ist ungültig");
       }
       
       
       //Aufgabe 1
       /*Schreibe eine Methode addiere (int a, int b), die die Summe vo zwei Zahlen berechnet und zurückgibt.*/
       
       
      
       static int bSumme (int a, int b)
       {
           int summe = a + b;
           return summe;
       }
       //Aufgabe 2
       /*Entwickle eine Methode istGerade(int zahl), die überprüft, ob eine Zahl gerade ist,
       und true oder false zurückgibt*/
       
       static boolean istGerade(int zahl)
       {
           return zahl % 2 == 0;
       }
       
      
    
    
}
