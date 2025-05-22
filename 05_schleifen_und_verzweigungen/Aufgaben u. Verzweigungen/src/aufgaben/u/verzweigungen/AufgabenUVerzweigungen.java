/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aufgaben.u.verzweigungen;
import static java.time.Clock.system;
import java.util.Scanner;
/**
 *
 * @author jk
 */
public class AufgabenUVerzweigungen {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner (System.in);
        
        // 1. Schreibe ein Programm, das eine ganze Zahl über die Console 
        // einliest und prüft, ob sie gerade oder ungerade ist.
        /*
        System.out.println("Gib eine Zahl ein: ");
        int zahl = input.nextInt();
        
        boolean egal = zahl % 2 == 0;
        System.out.println(""+egal);
        */
        
        // 2. Schreibe ein Programm, 
        // das über die Console eine Zahl vom Benutzer einliest 
        // und gib aus, ob sie positiv, negativ oder gleich null ist.
        /*
        System.out.println("Gib eine zahl ein:");
        int zahl = input.nextInt();
            if (zahl >=0) {System.out.println("Die zahl ist Positiv!");}
            else {System.out.println("Die Zahl ist Negativ!");};
        */
        // 3. Schreibe ein Programm, welches zwei ganze Zahlen vom Benutzer einliest
        // und gib die größere Zahl aus (oder "gleich", falls sie gleich sind).

        /*
        System.out.println("Gib die erste Zahl ein:");
        int Zahlone = input.nextInt();
        System.out.println("Gib die zweite Zahl: ");
        int Zahltwo = input.nextInt();
        if (Zahlone <= Zahltwo){System.out.println(Zahltwo+" ist größer als "+Zahlone);}
        else {System.out.println(Zahlone+" ist größer als "+Zahltwo);}
        */
        
        // 4. Schreibe ein Programm, welches eine Punktzahl (0–100) 
        // vom Benutzer einliest und gib die Note nach folgendem Schema aus:
        // 90–100: Sehr gut
        // 80–89: Gut
        // 70–79: Befriedigend
        // 60–69: Ausreichend
        // <60: Nicht bestanden
        
        /*
        System.out.println("Gib eine Zahl ziwschen 0 - 100 ein:");
        int Note = input.nextInt();
            
            if (Note >= 90 && Note <= 100){System.out.println("Note: Sehr gut");}
            else if (Note >= 80 && Note <= 89){System.out.println("Note: Gut");}
            else if (Note >= 70 && Note <= 79){System.out.println("Note: Befriedigend");}
            else if (Note >= 60 && Note <= 69){System.out.println("Note: Ausreichend");}
            else if (Note <= 60){System.out.println("Note: Nicht bestanden");}
            else {System.out.println("Nicht gültige Zahl eingegeben!!");}
        */
        
        // 5. Schreibe ein Programm, welches ein Jahr 
        // vom Benutzer einliest und prüfe, ob es ein Schaltjahr ist 
        // (durch 4 teilbar, aber nicht durch 100, außer durch 400).
        
        /*
        System.out.println("Gibt ein Jahr ein:");
        int Jahr = input.nextInt();
        
        if ((Jahr % 4 == 0 && Jahr % 100 != 0) || (Jahr % 400 == 0)){System.out.println(Jahr+" ist ein Schaltjahr");}
        
        else {System.out.println("Ist kein Schaltjahr");}
        */
        
        // 6. Schreibe ein Programm, welches das Alter 
        // vom Benutzer einliest und anhand dessen den Eintrittspreis bestimmt
        //Unter 6: kostenlos
        // 6–17: 5€
        // 18–64: 10€
        // Ab 65: 7€
        /*
        
        System.out.println("Gib dein Alter ein;");
        int alter = input.nextInt();
        
        if (alter >=65 ) {System.out.println("Der Preiß ist: 7€");}
        else if (alter <=64 && alter >= 18) {System.out.println("Der Preiß ist: 10€");}
        else if (alter <= 17 && alter >= 6) {System.out.println("Der Preiß ist: 5€");}
        else {System.out.print.ln("Der Eintritt ist kostenlos!");}
        */
        
        // 7. Schreibe ein Programm, welches das Passwort 
        // vom Benutzer einliest und vergleiche es mit dem richtigen Passwort "geheim123".
        // Gib „Zugriff gewährt“ oder „Zugriff verweigert“ aus.
        /*
        String pwort = "geheim123";
        
        System.out.println("Geben sie das Passwort ein:");
        String password = input.nextLine();
        
        if (pwort.equals(password)){System.out.println("Das Passwort ist richtig");}
        else {System.out.println("Das Passwort ist falsch");}
        */
        
        
        // 8. Schreibe ein Programm, welches eine Zahl 
        // vom Benutzer einliest und prüfe, ob sie zwischen 10 und 20 (inklusive) liegt.
        /*
        System.out.println("Gib eine zahl ein:");
        int zahl = input.nextInt();
        if (zahl >= 10 && zahl <= 20){System.out.println("Die zahl liegt zwischen 10 und 20!");}
        else {System.out.println("Die zahl liegt nicht zwischen 10 und 20!");}
        */
        
        // 9. Schreibe ein Programm, welches drei Zahlen 
        // vom Benutzer einliest und prüfe ob sie ein gültiges Dreieck ergeben (Dreiecksungleichung).
        
        /*
        System.out.println("Gibt zahl 1 ein");
        double länge1 = input.nextDouble();
        System.out.println("Gibt zahl 2 ein");
        double länge2 = input.nextDouble();
        System.out.println("Gibt zahl 3 ein");
        double länge3 = input.nextDouble();
        
        if (länge1 + länge2 <= länge3){System.out.println("Das Dreieck ist Gültig");}
        else if (länge1 + länge3 <= länge2){System.out.println("Das Dreieck ist Gültig");}
        else if (länge2 + länge3 <= länge1){System.out.println("Das Dreieck ist Gültig");}
        else {System.out.println("Das Dreieck ist nicht Gültig");}
        */
        
        // 10. Schreibe ein Programm, welches ein Zeichen
        // vom Benutzer einliest und bestimme, ob es ein Buchstabe, eine Ziffer oder ein Sonderzeichen ist.
        
        /*
        System.out.println("Gib ein Beliebiges Zeichen ein");
        String eingabe;
        eingabe = input.nextLine();
        
        if (eingabe.matches("[a-zA-Z]+"))
            {System.out.println("Das Zeichen ist ein String");}
        else if (eingabe.matches("[0-9]+"))
            {System.out.println("Die Zeichen sind Zahlen");}
        else {System.out.println("Die Zeichen sind Sonderzeichen");}
        */
        
        // 11. Schreibe ein Programm, welches das Alter 
        // vom Benutzer einliest und gib aus, ob die Person alt genug für einen Führerschein ist (ab 16).
        
        
        /*
        System.out.println("Gibt dein Alter ein:");
        int alter = input.nextInt();
        if (alter >= 16)
            {System.out.println("Die Person ist alt genug!");}
        else 
            {System.out.println("Die Person ist nicht alt genug!!");}
        */
        
        // 12. Schreibe ein Programm, welches eine Temperatur in °C 
        // vom Benutzer einliest und gib eine Bewertung aus (heiß, warm, kühl, kalt). 
        
        
        /*
        System.out.println("Gib eine Temperatur ein:");
        double temp = input.nextDouble();
        if (temp >= 30)
            {System.out.println("Es ist heiß!");}
        else if (temp <= 30 && temp >= 15)
            {System.out.println("Es ist warm!");}
        else if (temp <= 14 && temp >= 5)
            {System.out.println("Es ist kühl!");}
        else 
            {System.out.println("Es ist kalt!");}
        */
        
        // 13. Schreibe ein Programm, welches eine Zahl 
        // vom Benutzer einliest und vergleiche sie mit 100.
        
        
        /*
        System.out.println("Gibt eine Zahl ein:");
        int zahl = input.nextInt();
        if (zahl >= 100)
            {System.out.println("Die zahl ist größer als 100");}
        else
            {System.out.println("Die Zahl ist kleiner als 100");}
        */
        
        // 14. Schreibe ein Programm, welches drei Zahlen 
        // vom Benutzer einliest und gib die kleinste aus.
        /*
        System.out.println("Gib erste Zahl ein:");
        int zahlone = input.nextInt();
        System.out.println("Gib zweite Zahl ein:");
        int zahltwo = input.nextInt();
        System.out.println("Gib dritte Zahl ein:");
        int zahlthree = input.nextInt();
        
        if (zahlone < zahltwo && zahlone >= zahlthree)
            {System.out.println("Die erste Zahl ist am kleinsten!");}
        
        else if (zahltwo < zahlone && zahltwo >= zahlthree)
            {System.out.println("Die zweite Zahl ist am kleinsten!");}
        
        else
            {System.out.println("Die dritte Zahl ist am kleinsten!");}
        */
        
        
        // 15. Schreibe ein Programm, welches den Benutzernamen und das Passwort 
        // vom Benutzer einliest und vergleiche Benutzername und Passwort mit "admin" und "pass123"
        
        
        /*
        String benutzer = "admin";
        String pword = "pass123";
        
        System.out.println("Gibt dein Benutzernamen ein:");
        
        String bname = input.nextLine();
        
        System.out.println("Gib dein Passwort ein:");
        
        String pass = input.nextLine();
        
        if( bname.equals(benutzer) && pass.equals(pword) ) 
            {System.out.println("Du bist ein Eingeloogt");}
        else 
            {System.out.println("Deine angaben waren falsch");}
        */
        
        // 16. Schreibe ein Programm, welches eine Zahl 
        // vom Benutzer einliest und prüfe, ob eine Zahl zweistellig und gerade ist.
        
        /*
        System.out.println("Gib eine Zahl ein:");
        int zahl = input.nextInt();
        if (zahl >= 10 && zahl <= 99 && zahl % 2 == 0)
            {System.out.println("Die zahl ist rund und zweistelleig");}
        else
            {System.out.println("Die zahl ist nicht rund oder und zweistellig");}
        */
        
        // 17. Schreibe ein Programm, welches zwei Seitenlängen 
        // vom Benutzer einliest, vergleiche die Seitenlängen und gib aus, 
        // ob es ein Quadrat oder Rechteck ist.
        
        
        System.out.println("Gib die erste Seitenlänge ein:");
        double zahlone = input.nextDouble();
        System.out.println("Gib die zweite Seitenlänge ein:");
        double zahltwo = input.nextDouble();
        
        if (zahlone == zahltwo)
            {System.out.println("Es ist ein Quadrat");}
        else 
            {System.out.println("Es ist ein Rechteck");}
        
        
        
        
        
        
        
    }
    
}
