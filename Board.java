import java.util.*;

class Board { //will serve as the title screen
     public static void main (String [] args ) { //serve as first part of title screen
         System.out.println("\nWelcome to Conway's Game of Life!\n"); //tells user the game
        
         System.out.println("This is a true idle game, meaning that you, the player," +
             " will have a minimal influence on the game once it starts.");

         System.out.print("\nWould you like the instructions? (y/n): ");

         Scanner scnr = new Scanner (System.in);

         String response = scnr.nextLine();

         if (response.equals("y") || response.equals("Y")) { //if yes, continues to instructions
             instructions (scnr, response);
         }

         else { //if no, starts game
             Main2(scnr, response); 
         }
    }

     public static void instructions (Scanner scnr, String response) { //provides instructions to player
         System.out.println("\nAs the user, your purpose is to either load or create" +
             " a new board to start the game. If you choose \nto create a board, you will set" +
             " the size and provide a seed (a string of words and/or numbers)\n" + 
             "and then the game will begin.");

         System.out.println("\nAfter the board has been loaded, the game will proceed" +
             " as follows: \n");

         System.out.println("1. Each cell with one or no neighbors dies (solitude).");
         System.out.println("2. Each cell with four or more neighbors dies (overpopulation).");
         System.out.println("3. Each cell with two or three neighbors survives.");
         System.out.println("4. Each empty cell with three neighbors becomes populated.\n");

         System.out.println("As the user, you have the ability to save the game " +
            " at any point by entering \"save\". \nYou can also save and quit" +
            " at any point by entering \"quit\".");

         System.out.print("\nWould you like me to repeat the instructions?: ");
         response = scnr.nextLine();

         if (response.equals("y") || response.equals("Y")) {
             //System.out.println("Went to instructions.");
             instructions (scnr, response); //goes back to itself
         }

         else {
             //System.out.println("Went to next part of title.");
             Main2(scnr, response); //goes to next part of main menu
         }
    }

     public static void Main2 (Scanner scnr, String response) { //continuation of title screen
         System.out.print("\nWould you like to start a new game?: ");
         
         response = scnr.nextLine();

         System.out.println("\nRemember: to save the game, you must enter: \"save\". To save and quit a game, " +
             "remember to type, \"quit\".");
       
         if (response.equals("y") || response.equals("Y")) {
             //NewBoard NewBoard = new NewBoard ();
             //NewBoard();
         }
       
         else {
             //OldBoard OldBoard = new OldBoard ();
             //OldBoard();
         }
     }
}