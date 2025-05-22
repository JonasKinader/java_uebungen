/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package einundausgabe;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class EinundAusgabe {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.println("Bitte geben sie ihren Vornamen ein");
        String vorname = input.nextLine ();//firstname
        
        System.out.println("Bitte geben sie ihren Nachnamen ein");
        String nachname = input.nextLine();//lastname
        System.out.println("Herzlich Willkommen: "+ vorname+" "+nachname);
        input.close();
       
        
        
    }
    
}
