import java.util.*;

class instructions { //reads instructions and redirects back to instructions or ends and goes to Main2
    /**
     * To note: delete Scanner scnr + String response when combining and in
     *  the paramaters when moving, add those.
     */

     //publiic instructions (scnr, response) {
     public static void main (String [] args) {//provides instructions and details on game
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
         
         Scanner scnr = new Scanner (System.in); //delete this

         String response = scnr.nextLine(); //delete this

         //comment out sysouts later
         if (response.equals("y") || response.equals("Y")) {
             System.out.println("Went to instructions.");
             //instructions (scnr, response); //goes back to itself
         }

         else {
             System.out.println("Went to next part of title.");
             //Main2(scnr, response); //goes to next part of main menu
         }
    }
}