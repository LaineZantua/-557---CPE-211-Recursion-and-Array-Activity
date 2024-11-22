
package arrayyy;

import java.util.Scanner;


public class ArrayOfPlayers {

    
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        
        System.out.println("Number of players:");
        int Playernum = scn.nextInt();
        System.out.println("");
        
        int[] score = new int[Playernum];
        
        for (int i = 0; i < Playernum; i++) {
            System.out.println("Input score for player " + (i + 1) );
            score[i] = scn.nextInt();
            System.out.println("");
    }  
        
        System.out.println("All Players and their Scores:");
        for (int i = 0; i < Playernum; i++) {
            System.out.println("Player " + (i + 1) + " | " + "Score: " + score[i]);
        }
    }
}
    

