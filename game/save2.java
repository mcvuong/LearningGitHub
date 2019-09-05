import java.util.*;

//accepts a scanner and response
class save2 { //either quit or continues the game
    public static void main (String [] args) {
         Scanner scnr = new Scanner (System.in);
         String response = scnr.nextLine(); //

         System.out.println("Saving game... ");

         if (response.equals("quit") || response.equals("Quit")) {
             System.out.println("Ended game.");
             System.exit(1); //ends program
         }
         
         //comment out later
         else {
             System.out.println("Continuing game...");
         }
    }
}