import java.util.*;
/**
 * method: Main2(scnr, response)
 */
class Main2 { //serves to either redirect to class NewBoard or class OldBoard
     //public Main2(scnr, response) {
     public static void main (String [] args) { //comment this out later
         System.out.println("Would you like to start a new game?");
         
         Scanner scnr = new Scanner (System.in);
         String response = scnr.nextLine();

         System.out.println("Remember: to save the game, you must enter: \"save\"."
             + "\nTo save and quit a game, remember to type, \"quit\".");
        
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