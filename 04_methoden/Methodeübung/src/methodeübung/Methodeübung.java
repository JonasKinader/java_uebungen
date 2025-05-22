/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package methodeübung;

import java.util.Scanner;

/**
 *
 * @author jk
 */
public class Methodeübung {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Scanner input = new Scanner(System.in);
        //Scanner eingabe = new Scanner(System.in);
        /*
        //Aufgabe 1
        hw();
        */
        
        /*
        //Aufgabe 2
        System.out.println("Gib bitte deinem Namen ein:");
        begruessung(input.nextLine());
        */
        
        /*
        //Aufgabe 3
        int erg = bSumme(4, 6);
        System.out.println(erg);
        */
        
        /*
        //Aufgabe 4
        int merg = mSumme(4, 6);
        System.out.println(merg);
        */
        
        /*
        //Aufgabe 5
        int quad = quadratSumme(4);
        System.out.println(quad);
        */
        
        /*
        //Aufgabe 6
        boolean gerade = istGerade(7);
        System.out.println(gerade);
        */
        //Aufgabe 7
        /*
        System.out.println("Geben Sie ihren Vornamen ein!");
        
        System.out.println("Geben Sie ihren Nachnamen ein!");
        anrede(input.nextLine(),eingabe.nextLine());
        */
        /*
        System.out.println("Bitte geben Sie ihren Vornamen ein!");
        String vorname = strEingabe();
        System.out.println("Bitte geben Sie ihren Nachnamen ein!");
        String nachname = strEingabe();
        anrede2(vorname,nachname);
        */
        //Aufgabe 8
        /*
        double area = fläche(23.22, 35.92);
        System.out.println(area);
        */
        //Aufgabe 9
        /*
        double volu = volumen(3.4,5.3,2.3);
        System.out.println(volu);
        */
        //Aufgabe 10
        /*
        double vergleich = max(15,25);
        System.out.println(vergleich);
        */
        //Aufgabe 11
        /*
        double vergleich = min(15,25);
        System.out.println(vergleich);
        */
        //Aufagbe 12
        /*
        System.out.println("Gib eine Zahl ein, und ich sage die ob sie Positiv,Negativ oder Null ist!");
        String num = vergleich(douEingabe());
        System.out.println(num);
        */
        //Aufgabe 13
        /*
        System.out.println("Gib eine Zahl ein und ich berechne sie hoch3!");
        double zahl = hoch3(douEingabe());
        System.out.println(zahl);
        */
        //Aufgabe 14
        /*
        System.out.println("Gib die erste Zahl ein!");
        double one = douEingabe();
        System.out.println("Gib die zweite Zahl ein!");
        double two = douEingabe();
        double three = differenz(one,two);
        System.out.println(three);
        */
        //Aufgabe 15
        /*
        double schnitt = durchschnitt(25.3456,35.0098);
        System.out.println(schnitt);
        */
        //Aufgabe 16
        /*
        String between = zwischen(15);
        System.out.println(between);
        */
        //Aufgabe 17
        /*
        String tief = negativ(-1);
        System.out.println(tief);
        */
        //Aufgabe 18
        /*
        String satz1;
        System.out.println("Gib erst deinen Namen ein und dann dein Alter:");
        satz1 = satz(strEingabe(), strEingabe());
        System.out.println(satz1);
        */
        //Aufgabe 19
        /*
        String num = five(24);
        System.out.println(num);
        */
        //Aufgabe 20
        /*
        int a = 12;
        int b = 6;
        int c = divi(a,b);
        System.out.println(c);
        */
        double a = usv(800,12,7,5 );
        
        String runden = String.format("%.2f", a);
        System.out.println("Die USV hält "+runden+" min!");
    }
    
    
    //Double  Scanner
    static double douEingabe()
    {
        Scanner input = new Scanner(System.in);
        double eingabe = input.nextDouble();
        return eingabe;
    }
    
    //  String scanner
    static String strEingabe()
       {
           
           Scanner input = new Scanner(System.in);
           String eingabe = input.nextLine();
           return eingabe;
       }
    
// 1. Schreibe eine Methode, die "Hallo Welt!" ausgibt.
    
    static void hw()
    {
        System.out.println("Hallo Welt!");
    }
    

// 2. Schreibe eine Methode, die einen Namen entgegennimmt und "Hallo, [Name]" ausgibt.
    static void begruessung(String name)
    {
        System.out.println("Hallo, "+name+".");
    }
    

// 3. Schreibe eine Methode, die zwei ganze Zahlen addiert und das Ergebnis zurückgibt.
    
    static int bSumme (int a, int b)
       {
           int summe = a + b;
           return summe;
       }

// 4. Schreibe eine Methode, die zwei ganze Zahlen multipliziert und das Ergebnis zurückgibt.
    
    static int mSumme (int a, int b)
       {
           int summe = a * b;
           return summe;
       }

// 5. Schreibe eine Methode, die das Quadrat einer Zahl berechnet und zurückgibt.
    
    static int quadratSumme (int a)
       {
           int summe = a * a;
           return summe;
       }

// 6. Schreibe eine Methode, die prüft, ob eine Zahl gerade ist (true/false).
    
    static boolean istGerade(int zahl)
    {
        return zahl % 2 == 0;
    }

// 7. Schreibe eine Methode, die Vor- und Nachnamen entgegennimmt und eine Begrüßung ausgibt.
    
    static void anrede1(String vorname, String nachname)
    {
        System.out.println("Herzlich Willkommen "+ vorname +" "+ nachname);
    }
    
    static void anrede2(String vorname, String nachname)
    {
        System.out.println("Herzlich Willkommen "+vorname+" "+nachname);
    }
    
// 8. Schreibe eine Methode, die die Fläche eines Rechtecks berechnet.
    
    static double fläche(double a,double b) 
    {
        double flächensumme = a * b;
        return flächensumme;
    }

// 9. Schreibe eine Methode, die das Volumen eines Quaders berechnet.
    
    static double volumen(double a,double b,double c)
    {
        double vol = a*b*c;
        return vol;
    }

// 10. Schreibe eine Methode, die das Maximum zweier Zahlen zurückgibt.
    
    static double max(double a, double b)
    {
        if(a>b){
            return a;
        }
        else{
            return b;
        }
    }

// 11. Schreibe eine Methode, die das Minimum zweier Zahlen zurückgibt.
    
    static double min(double a, double b)
    {
        if(a<b){
            return a;
        }
        else{
            return b;
        }
    }


// 12. Schreibe eine Methode, die "Positiv", "Negativ" oder "Null" zurückgibt – je nach Eingabezahl.
    
    static String vergleich(double a)
    {
        String b = "Die Zahl ist Positiv!";
        String c = "Die Zahl ist Negativ!";
        String d = "Die Zahl ist Null!";
        
        if(a>0){         
            return b;          
        }
        else if (a<0){           
            return c;
        }
        else{
            return d;
        }
        
        
    }

// 13. Schreibe eine Methode, die eine Zahl hoch 3 berechnet und zurückgibt.
    
    static double hoch3(double a)
    {
        double h3 = a * a * a;
        return h3;
    }

// 14. Schreibe eine Methode, die die Differenz zweier Zahlen berechnet.
    
    static double differenz(double a, double b)
    {
        double diff = a - b;
        return diff;
    }

// 15. Schreibe eine Methode, die den Durchschnitt zweier Zahlen als Kommazahl zurückgibt.
    
    static double durchschnitt(double a, double b)
    {
        double durch = (a + b) / 2;
        return durch;
    }

// 16. Schreibe eine Methode, die prüft, ob eine Zahl zwischen 10 und 20 liegt (inklusive).
    
    static String zwischen(double a)
    {
        String b = "Die Zahl liegt zwische 10 und 20!";
        String c = "Die Zahl liegt nicht zwischen 10 und 20!";
        
        if(a<=20 && a >= 10){
            return b;
        }
        else{
            return c;
        }
    }
    
    static boolean zwisch(double a)
    {
        return( a >= 10 && a<= 20);
    }

// 17. Schreibe eine Methode, die prüft, ob eine Zahl negativ ist.
    
    static String negativ(double a)
    {
        String b = "Die Zahl ist Negativ!";
        String c = "Die Zahl ist nicht Negativ";
        if ( a < 0 )
        {
            return b;
        }
        else{
            return c;
        }
    }
    
    static boolean ne(double a)
    {
        return (a < 0);
    }
    

// 18. Schreibe eine Methode, die einen Namen und ein Alter entgegennimmt und einen Satz zurückgibt.
    
    static String satz(String name, String alter)
    {
        //System.out.println("Dein Name ist: "+name+"und dein Alter ist: "+alter+"!");
        String b = "Dein Name ist "+name+" und dein Alter ist "+alter+" !";
        return b;
    }

// 19. Schreibe eine Methode, die prüft, ob eine Zahl durch 5 teilbar ist.
    
    static String five(int a)
    {
        String b = "Die zahl ist durch 5 Teilbar!";
        String c = "Die zahl ist nicht durch 5 Teilbar";
        
        if(a % 5 == 0){
            return b;
        }
        else{
            return c;
        }
        
    }
    
    

// 20. Schreibe eine Methode, die zwei Zahlen ganzzahlig dividiert und das Ergebnis zurückgibt.
    
    static int divi(int a, int b)
    {
        int c  = a / b;
        return c;
    }
    
//Extra Aufgabe: Schreiben Sie ein Programm, welches die überbrückungszeit tÜ einer USV berechnet!
    
    static double usv(double leistung, double Volt,double Ah, double hm)
    {
        
        double reserve = 100 / leistung * 30;
        double batterie = hm * Volt * Ah;
        
        
        double wges = leistung + reserve;
        
        double tü = batterie / wges * 60;
        return tü;
    }
    
    
    
}



