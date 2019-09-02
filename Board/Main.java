import java.util.*;

class Main { //will serve as the title screen
     public static void main (String [] args ) { //serve as first part of title screen
         System.out.println("\nWelcome to Conway's Game of Life!\n"); //tells user the game
        
         System.out.println("This is a true idle game, meaning that you, the player," +
             " will have a minimal influence on the game once it starts.");

         System.out.print("\nWould you like the instructions? (y/n): ");

         Scanner scnr = new Scanner (System.in);

         String response = scnr.nextLine();

         if (response.equals("y") || response.equals("Y")) { //if yes, continues to instructions
             //instructions (scnr, response);
         }

         else { //if no, starts game
             //Main2(scnr, response); 
         }
    }
}