/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package array.übungen;

import java.util.Scanner;

/**
 *
 * @author jk
 */
public class ArrayÜbungen {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //scanner für alle aufgaben
        Scanner input = new Scanner(System.in);
        
        
// Aufgabe 1: Erstelle ein Array mit 5 Ganzzahlen und gib alle Werte aus.
// Beispiel: {3, 7, 1, 9, 4}

/*
    int liste [] = {2,3,4,5,6,};
    
        for (int i = 0; i < liste.length; i++) {
            System.out.println(liste[i]);
            
        }
  */  



// Aufgabe 2: Berechne die Summe aller Elemente in einem Array.
// Beispiel: {2, 4, 6, 8, 10} → Summe = 30
    /*
    int liste [] = {2, 4, 6, 8, 10};
    
        int h = liste[0]+liste[1]+liste[2]+liste[3]+liste[4];

        for (int i = 0; i < liste.length; i++) {
            a += liste[i];
            System.out.println(a);
        }

        
        System.out.println(h);

    */
    
// Aufgabe 3: Finde das größte Element in einem Array.
// Beispiel: {5, 12, 3, 21, 8} → größtes Element: 21
            
           //int liste [] = {21, 4, 60, 10, 35 };
           /*
           if(liste[0]>liste[1] && liste[0]>liste[2] && liste[0]>liste[3] && liste[0]>liste[4]){
               System.out.println(liste[0]);
           }
           else if(liste[1]>liste[0] && liste[1]>liste[2] && liste[1]>liste[3] && liste[1]>liste[4]){
               System.out.println(liste[1]);
           }
           else if(liste[2]>liste[0] && liste[2]>liste[1] && liste[2]>liste[3] && liste[2]>liste[4]){
               System.out.println(liste[2]);
           }
           else if(liste[3]>liste[0] && liste[3]>liste[2] && liste[3]>liste[1] && liste[3]>liste[4]){
               System.out.println(liste[3]);
           }
           else if(liste[4]>liste[0] && liste[4]>liste[2] && liste[4]>liste[3] && liste[4]>liste[1]){
               System.out.println(liste[4]);
           }
           */
           /*
           int a = liste[0];
           
           for (int i = 0; i < liste.length; i++) {
               
               if(  liste[i] > a ) {
                   a = liste[i] ;
            }
                       
        }
            
            System.out.println(a);
            */
// Aufgabe 4: Zähle, wie oft eine bestimmte Zahl im Array vorkommt.
// Beispiel: {1, 2, 3, 2, 4, 2}, gesuchte Zahl: 2 → Anzahl: 3
        /*
        int liste [] = {1, 2, 3, 2, 4, 2 };

        int a = 2;
        int b = 0;
           
           for (int i = 0; i < liste.length; i++) {
               
               if(  liste[i] == a ) {
                   b++;
            }
                      
        }
            
            System.out.println(b); 
        */


// Aufgabe 5: Drehe ein Array um (erstes Element wird letztes usw.).
// Beispiel: {1, 2, 3, 4, 5} → {5, 4, 3, 2, 1}

        /*
        int liste [] = {1,2,3,4,5 };
        int liste1[] = new int [5];
         
        
        for (int i = 0; i < liste.length; i++) {
            
            liste1[i] = liste[liste.length -1 -i];
            System.out.println(liste1[i]);
            }
        */
        


// Aufgabe 6: Berechne den Durchschnitt aller Zahlen im Array.
// Beispiel: {4, 8, 6, 10, 2} → Durchschnitt: 6.0
        /*
        int liste [] = {4, 8, 6, 10, 2 };
        int a = 0;

        for (int i = 0; i < liste.length; i++) {
            a += liste[i];
            
            }
        int c = a / liste.length;
        
        System.out.println(c);
        */
// Aufgabe 7: Gib nur die geraden Zahlen aus einem Array aus.
// Beispiel: {3, 6, 1, 8, 5} → Ausgabe: 6, 8
        /*
        int liste [] = {3, 6, 1, 8, 5};
        
        for (int i = 0; i < liste.length; i++) {
            
            if(liste[i] % 2 == 0){
                System.out.println(liste[i]);
            }
            
        }
        */

// Aufgabe 8: Ersetze alle negativen Zahlen im Array durch 0.
// Beispiel: {5, -3, 7, -1, 0} → {5, 0, 7, 0, 0}
        /*
        int liste [] = {5, -3, 7, -1, 0};
        
        for (int i = 0; i < liste.length; i++) {
            if(liste[i]<0){
                liste[i] = 0 ;
                
            }
            
        }
        //nur die ausgabe
        for (int i = 0; i < liste.length; i++) {
            System.out.println( liste[i]);
            
        }
        */
// Aufgabe 9: Prüfe, ob ein Array aufsteigend sortiert ist.
// Beispiel: {1, 3, 5, 7, 9} → Ergebnis: true
        /*
        int liste [] = {1, 4, 5, 7, 9};
        boolean auf = true;
        for (int i = 0; i < liste.length -1; i++) {
            System.out.println(liste[i] );
            
            if(liste[i] > liste[i +1] ){
                auf = false;
                break;
            }
        }
        System.out.println(auf); 
        */


// Aufgabe 10: Verdopple alle Werte im Array.
// Beispiel: {2, 4, 6, 8} → {4, 8, 12, 16}
    /*
        int liste [] = {2, 4, 6, 8};
        int liste1[] = new int [5];
         
        
        for (int i = 0; i < liste.length; i++) {
            
            liste1[i] = liste[i]*2;
            
            System.out.println(liste1[i]);
            }
    */  

// Aufgabe 11: Lies 10 Zahlen vom Benutzer ein und speichere sie in einem Array.
// Beispiel: Eingabe: 1 2 3 4 5 6 7 8 9 10 → Array mit 10 Zahlen
    /*
        System.out.println("Gebe ein wie viele Zahlen du speichern möchtest:");
    int[] feld = new int [input.nextInt()];
    
        for (int i = 0; i < feld.length; i++) {
            
            System.out.println("Gebe die Zahl ein");
            feld[i] = input.nextInt();
            
            
        }
        
        for (int i = 0; i < feld.length; i++) {
            System.out.println( feld[i]);
            
        }
    */
    
    

// Aufgabe 12: Suche ein bestimmtes Element im Array und gib dessen Index zurück (oder -1).
// Beispiel: {4, 7, 2, 9, 5}, gesuchte Zahl: 9 → Index: 3
           /*
            int liste[] = {4, 7, 2, 9, 5};
            
            int a = 9;
            int b ;
           
            for (int i = 0; i < liste.length; i++) {
               
               if(  liste[i] == a  ) {
                  
                   b = i;
                  System.out.println(b); 
                  
            }
                 
        }
            */
// Aufgabe 13: Zähle, wie viele Elemente größer als 10 sind.
// Beispiel: {11, 4, 15, 6, 2, 20} → Anzahl: 3
            
            /*
            int liste[] = {10, 7, 2, 19, 5};
            
            int a = 10;
            int b = 0;
           
            for (int i = 0; i < liste.length; i++) {
               
               if(  liste[i] >= a  ) {
                   b++;
                   
                  
            }
                 
        }
            System.out.println(b); 
            */
// Aufgabe 14: Erstelle ein neues Array, das nur die ungeraden Zahlen enthält.
// Beispiel: {1, 2, 3, 4, 5, 6} → {1, 3, 5}
        /*

        int liste[] = {1, 2, 3, 4, 5, 6};
        
       
        int count = 0;
        for (int i = 0; i < liste.length; i++) {
            if (liste[i] % 2 != 0) {
                count++;
            }
        }

        
        int liste1[] = new int[count];
        int index = 0;

        
        for (int i = 0; i < liste.length; i++) {
            if (liste[i] % 2 != 0) {
                liste1[index] = liste[i];
                index++;
            }
        }

        
        for (int i = 0; i < liste1.length; i++) {
            System.out.println(liste1[i]);
        }
        */



// Aufgabe 15: Finde das kleinste Element im Array.
// Beispiel: {18, 3, 27, 9, 5} → kleinstes Element: 3
    /*
    int liste [] = {18, 3, 27, 9, 5};

        int a = liste[0];
           
           for (int i = 0; i < liste.length; i++) {
               
               if(  liste[i] < a ) {
                   a = liste[i] ;
            }
                       
        }
           System.out.println(a);
    */
// Aufgabe 16: Überprüfe, ob alle Elemente im Array gleich sind.
// Beispiel: {4, 4, 4, 4} → Ergebnis: true
        /*
        int liste [] = {4, 4, 4, 4};
        
        boolean gleich = false;
        
        for (int i = 0; i < liste.length; i++) {
            
            int a = liste[0];
            
            if(liste[i] == a){
            
                gleich = true;
            }
            
        }
        if (gleich == true){
            System.out.println(gleich);
        }
        */
// Aufgabe 17: Erstelle ein Array mit den ersten 20 geraden Zahlen.
// Beispiel: {2, 4, 6, ..., 40}
    /*
    int liste[] = new int[20];
    int a = 1;
    
        for (int i = 0; i < liste.length; i++) {
            
            a++;
            
            if(a % 2 == 0){
                
                liste[i] = a;
                System.out.println( liste[i]);
            }
            
        }
        */
        

// Aufgabe 18: Gib die Elemente eines Arrays rückwärts aus.
// Beispiel: {1, 2, 3, 4, 5} → Ausgabe: 5, 4, 3, 2, 1
        /*
        int liste [] = {1, 2, 3, 4, 5};        

        for (int i = liste.length - 1; i >= 0; i--) {
            System.out.println(liste[i]);
        }
        */
// Aufgabe 19: Vertausche das erste und das letzte Element im Array.
// Beispiel: {7, 9, 4, 6} → {6, 9, 4, 7}
        /*
        int liste [] = {1, 2, 3, 4, 5};
        
        for (int i = 0; i < liste.length; i++) {
            
            int a = liste[0];
            int b = liste[4];
            
            liste[0] = b;
            liste[4] = a;
            
        }
        
        for (int i = 0; i < liste.length; i++) {
            System.out.println( liste[i]);
            
        }
        */

// Aufgabe 20: Gib nur die Elemente mit geradem Index aus.
// Beispiel: {10, 20, 30, 40, 50} → Ausgabe: 10, 30, 50
        /*
        int liste [] = {10, 20, 30, 40, 50};
        
        for (int i = 0; i < liste.length; i++) {
            
            if(i % 2 == 0){
                System.out.println(liste[i]);
            }
            
        }
        */
// Aufgabe 21: Addiere zwei Arrays gleicher Länge elementweise.
// Beispiel: {1, 2, 3} + {4, 5, 6} → {5, 7, 9}
        /*
        int liste [] = {1, 2, 3};
        int liste1 [] = {4, 5, 6};
        int liste2 [] = new int [3];
        
        for (int i = 0; i < liste.length; i++) {
            
            liste2[i] = liste[i] + liste1[i];
            
        }
        
        for (int i = 0; i < liste2.length; i++) {
            System.out.println( liste2[i]);
            
        }
        */
// Aufgabe 22: Kopiere alle Elemente eines Arrays in ein neues Array.
// Beispiel: {5, 10, 15} → {5, 10, 15}
        /*
        int liste [] = {5, 10, 15};
        int liste1 [] = new int [3];
        
        for (int i = 0; i < liste.length; i++) {
            
            liste1[i] = liste[i];
            
        }
        
        for (int i = 0; i < liste1.length; i++) {
            System.out.println( liste1[i]);
            
        }
        */
// Aufgabe 23: Zähle, wie viele positive, negative und null-Werte im Array sind.
// Beispiel: {-2, 0, 5, -1, 3} → negativ: 2, null: 1, positiv: 2
        /*
        int liste [] = {-2, 0, 5, -1, 3};
        
        for (int i = 0; i < liste.length; i++) {
            
            if(liste[i]>0){
                System.out.println("die Zahl ist positiv: " + liste[i]);
            
            }
            else if(liste[i] == 0){
                System.out.println("die Zahl ist gleich null: "+ liste[i]);
            
            }
            else{
                System.out.println("die Zahl ist negativ: "+ liste[i]);
            }
            
        }
        */
// Aufgabe 24: Finde die Differenz zwischen dem größten und kleinsten Wert.
// Beispiel: {8, 14, 2, 22, 9} → Differenz: 20
        /*
        int liste [] = {8, 14, 2, 22, 9};
        
        int a = liste[0];
        int b = liste[0];
           
           for (int i = 0; i < liste.length; i++) {
               
               if(  liste[i] > a ) {
                   a = liste[i];
               }
               if(liste [i]< b){
                   b = liste[i];
               }
               
            }
        int c = a - b ;
        
        System.out.println("die Differenz ist: " + c);
        */

// Aufgabe 25: Erstelle ein Array mit den Zahlen von 1 bis 100.
// Beispiel: {1, 2, 3, ..., 100}
        /*
        int liste[] = new int [100];
        int a = 1;
        for (int i = 0; i < liste.length; i++) {
             
            if(liste[i] <= 100){
                 liste[i] = a;
                 a++;
                 
             }
            System.out.println( liste[i]);
        }
        */

// Aufgabe 26: Verdopple jedes zweite Element im Array (Index 1, 3, 5, ...).
// Beispiel: {1, 2, 3, 4, 5} → {1, 4, 3, 8, 5}
        /*
        int liste[] = {1, 2, 3, 4, 5};
        int a = 1;
        
        for (int i = 0; i < liste.length; i++) {
            
            if (i == a) {
                liste[i]=liste[i] * 2 ;
                a = a + 2;
            }
            
            System.out.println(liste[i]);
        }
        */
// Aufgabe 27: Zähle, wie oft der erste Wert im Array nochmal vorkommt.
// Beispiel: {7, 3, 7, 4, 7, 1} → Die Zahl 7 kommt 3-mal vor
        /*
        int liste[] = {7, 3, 7, 4, 7, 1};
        
        int a = 0;
        
        for (int i = 0; i < liste.length; i++) {
            
            if(liste[i] == liste[0]){
                a++;
            
            }
            
        }
        
        System.out.println(a);
        */
        
// Aufgabe 28: Entferne alle Vorkommen einer bestimmten Zahl aus dem Array.
// Beispiel: {2, 3, 2, 4, 5, 2}, Zahl: 2 → {3, 4, 5}
        /*
        int liste[] = {2, 3, 2, 4, 5, 2};
        int liste1[] = new int [6];
        int a = 2;
        
        for (int i = 0; i < liste.length; i++) {
            
            
            
            if(liste[i] != a){
                liste1[i] = liste[i];
            }
            
        }
        for (int i = 0; i < liste1.length; i++) {
            System.out.println( liste1[i]);
            
        }
        */

// Aufgabe 29: Überprüfe, ob zwei Arrays gleich sind (gleiche Länge + gleiche Werte).
// Beispiel: {1, 2, 3} und {1, 2, 3} → Ergebnis: true
        /*
        int liste [] = {1, 2, 3};
        int liste1 [] = {1, 2, 3};
        boolean vergleich = false;
        
        for (int i = 0; i < liste1.length; i++) {
        
            if(liste[i] == liste1[i]){
                vergleich = true;
                
            }
            
        }
        System.out.println(vergleich);
        */
// Aufgabe 30: Finde die Länge der längsten Folge gleicher Zahlen.
// Beispiel: {1, 1, 2, 2, 2, 3} → längste Folge: 3 (für die 2en)
        /*
        int liste [] = {5,2,5,3,3,3,2,5,2,2,3};
        int a = 1;
        int b = 1;
        
        
        for (int i = 1; i < liste.length; i++) {
            
            if(liste[i] == liste[i - 1]){
                a++;
            }
            else{
                b = 1;
            }
            if(a > b){
                b=a;
            }
            
        }
        System.out.println(b);
        */
        


        
        
        
        
        
        
        //
        
        
    }
    
}
