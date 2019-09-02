import java.util.*;

class save2 {
    public static void main (String [] args) {
         Scanner scnr = new Scanner (System.in);
         String response = scnr.nextLine();

         if (response.equals("quit") || response.equals("Quit")) {
             System.exit(1); //ends program
         }
         
         //comment out later
         else {
             System.out.println("Continued.");
         }
    }
}