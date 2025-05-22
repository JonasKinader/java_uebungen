/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package schleifeneinführung;

import java.util.Scanner;



/**
 *
 * @author jk
 */
public class Schleifeneinführung {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Readable Scanner;
        // TODO code application logic here
        Scanner input =  new Scanner(System.in);
        /*
        int i = 10;
        
        while (i >= 0){
            
            System.out.println(""+i);
            i = i - 1; // i-- kurz geschrieben
            i = i + 1; // i++ kurz geschrieben
                       // *=
                       // /=
                       // %=
                       // +=
                       // -=
                       
        }*/
        
        // Aufgabe 2: Geben sie alle
        // gerade Zahlen von 2 bis 20 aus
        
        /*
        int a = 2;
        
        while ( a <= 20 ) {
            System.out.println(""+a);
            a = a + 2;
            if (a / 2 == 0) {
                System.out.println(""+a);
            
            }
        
        
        }
        */
        
        
        //Aufgabe 3: Gib alle Zahlen von 10 bis 1 rückwärts aus
        /*
        int a = 10;
        
        while (a >= 1){
            
            System.out.println(""+a);
            a--;
        
        }
        */
        
        //Aufgabe 4: Berechne die Summe der Zahlen von 1 bis 100
        /*
        int a = 1;
        int b = 1;
        
        while (b <= 100){
            System.out.println(""+a);
            b++;
            a=a+b;
         */
        
        //Aufgabe 5: Gib die Quadrate der Zahlen von 1 bis 10 aus
        /*
        int a = 1;
        
        while (a<=10){
         
            System.out.println(a*a);
            a++;
        
        }
        */
        
        //Aufgabe 6: Lies eine Zahl vom benutzer ein,bis sie positiv ist.
        
        
        /*
        int a = -1;
        while (a <=0){
            
           
           System.out.println("Gib eine positive Zahl ein:");
           a = input.nextInt();
        }
         */
        
        //Aufgabe 7: Zähle wie viele Durchläufe nötig sind, um eine Summe von über 100 zu erreichen (durch Addition 1,2,3...)
        /*
        int a = 1;
        int b = 1;
        
        while (a < 110){
            
            b++;
            a=b+a;
       
        }
        System.out.println(b);
        */
        
        //Aufgabe 8: Gib die Multiplikationstabelle von (7*1 bis 7*10)
        /*
        int a = 7;
        int b = 1;
        int c;
        while (b <= 10){
             c = a * b;
            b++;
           
            System.out.println(c);
        } 
         */   
            
        // Aufgabe 9: Gib alle Zahlen zwischen 1 und 100 aus, die durch 5 teilbar sind.
        /*
        int a = 5;
        int b = 1;
        while (b <= 100){
            b++;
            if (b % a == 0){
                System.out.println(b);
            
            }
        
        }
        */
        
        // Aufgabe 10: Lies Zahlen vom Benutzer ein und gib die Summe aus bis 0 eingegeben wird.
        
        /*
        int a = 1;
        int c = 0;
        System.out.println("Gib eine Zahl ein:");
        while (a > 0){
            
            a = input.nextInt();
            c= c + a;
            System.out.println(c);
            
        }
         */
        
        //Aufgabe 11: Gib alle ungeraden zahlen von 1 bis 50 aus.
        
        /*
        int a = 1;
        
        while (a <= 50){
            System.out.println(""+a);
            a = a + 1;
            if (a / 2 >= 0){System.out.println(a);}
        }   
        */
        
        //Aufgabe 12: Verdopple eine zahl so lange, bis sie größer als 1000 ist. STarte bei 1
        
        /*
        int a = 1;
        
        while (a <=1000){
            a=a+a;
            System.out.println(a);
        
        }
        */
        
        //Aufgabe 13: Zähle, wie viele Zahlen man addieren muss (beginnend mit 1), um mindestens 500 zu erreichen.
        
        /*
        int a = 1;
        int b = 0;
        
        while (b <= 500){
            
            b=a+b;
            a++;
            
            
            
        
        }
        System.out.println(a);
        */
        
        
        //Aufgabe 14: Gib alle Vielfachen von 3 zwischen 1 und 100 aus
        
        /*
        int a = 3;
        
        System.out.println(a);
        while (a <=100){
            
            a++;
            if (a % 3 == 0){
            System.out.println(a);
            }
        */
        
        
        //Aufgabe 15: Lies eine Zahl ein und gib ihre Ziffern einzeln aus (z.b 123 -> 3 2 1)
        
        /*
        System.out.print("Gib eine Zahl ein: ");
        String eingabe = input.nextLine(); 

        int a = eingabe.length() -1;
        
            while (a >= 0) {
                char b = eingabe.charAt(a);
                System.out.print(b + " ");
                a--;
        }
        */
        
        // Aufgabe 16: Gib das kleine einmaleins für die Zahl 9 aus (9*1 bis 9*10)
        
        
        
        
        /*
        for (int i = 1; i < 10; i++) {
            
            System.out.println(""+(9*i));
            
        }
        */
        
        
        //Aufgabe 17: Berechne die Fakultät einer Zahl (z.B. 5! = 120).
        /*
        int a = 1;
        
        for (int i = 5; i > 0; i--) {
            
            a *= i;
            
            
        }
        System.out.println("5! = "+a);
        */
        
        //Aufgabe 18: Errechne die Summe aller geraden Zahlen bis zu einer eingegebenen Zahl
        /*
        System.out.println("Gib eine Zahl ein");
        
        int a = input.nextInt();
        int c = 0;
        
        
        for (int i = 0; i <= a; i++) {
            
            if(i % 2 == 0)
            {
             c += i;
            }
            
        }
            
        System.out.println(""+c);
         */ 
        
        
            //Aufgabe 19: Gib alle Zahlen rückwärts aus, die zwischen zwei Zahlen liegen.
            
            /*
            System.out.println("Gib die größere Zahl ein:");
            int a = input.nextInt();
            
            System.out.println("Gib die kleinere Zahl ein:");
            int b = input.nextInt();
            
            for (int i = a; i >= b; i--) 
            {
               
                System.out.println(""+i);
            
            }
            */
            
            
            //Aufagbe 20: Wiederhole eine Eingabeaufforderung, bis das Wort "ende" eingegeben wird.
            
            /*
            String a = "ende";
            
            System.out.println("Gib 'ende' ein:");
            
            String b = input.nextLine();
            
            while (!b.equals(a))
            {
                System.out.println("Gib 'ende' ein:");
                b = input.nextLine();
            }
            */
            
           
        
        

        
        
        
        
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            // for schleifen
            
            
            /*
            int i = 0;
            while (i<= 10){
                System.out.println(""+i);
                i = i + 1;
            }
            */
           
            
            /*
            for (int i = 0; i< 10; i++){
                System.out.println(""+i);   // ist das selbe wie oben 
           
           }
            */
            
            
            
            
            
        
        
        
        
        
        
    }
    
}
