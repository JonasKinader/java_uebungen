/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package kartenspiel;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author jk
 */
public class Kartenspiel {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        Random random = new Random();
       
        //name spieler 1
        System.out.println("Gib den Namen von Spieler 1 ein:");
        String playerone = input.nextLine();
        
        //name spieler 2
        System.out.println("Gib den Namen von Spieler 2 ein:");
        String playertwo = input.nextLine();
        
        //playerlive 
        System.out.println("Ihr habt beide 10 Leben!");
            
        int playeronel = 10;
        int playertwol = 10;
        
        //karten anzahl   
        int playeronek = 0;
        int playertwok = 0;
        
        
        
        while (playeronel > 0 && playertwol > 0){
        
            playeronek++;
            playertwok++;
            
            if (playeronek > 0 && playertwok > 0){
                
                // karten werte
                int cardp1 = random.nextInt(11);
                int cardp2 = random.nextInt(11);
                
                
                if (cardp1 > cardp2){
                    playertwol--; 
                    System.out.println(playerone+" Hat diese runde Gewonnen");
                    System.out.println(playertwo+" -1 Leben: "+playertwol);
                }
                else {
                    playeronel--;
                    System.out.println(playertwo+" Hat diese runde Gewonnen");
                    System.out.println(playerone+" -1 Leben: "+playeronel);
                }
               
                    
            }
            
            
    
    
    }
        
        if(playeronel > playertwol){
                System.out.println(playerone+" Hat Gewonnen Glückwunsch!!");
            
            } 
        else{
                System.out.println(playertwo+" Hat Gewonnen Glückwunsch!!");
            }
            
        
        
        
        
    }
    
}
