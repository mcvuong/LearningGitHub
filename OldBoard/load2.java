import java.util.*;
import java.io.*;

class load2 { //sets each element of the array to a line on doc
     public static void main (String [] args) {
         try {
             // ** comment this all out **//
             Scanner scnr = new Scanner(System.in);
             System.out.print("File name: ");
             String response = scnr.nextLine();
             File file = new File (response);

             //**                       **//

             /** //from old load
             FileInputStream in = new FileInputStream (file);
             Scanner scan = new Scanner (in);

             
             int lineNum = 0;

             while (scan.hasNext()) {
                 String lines = scan.nextLine();
                 //checks how many lines there are
                 lineNum ++;
             }
              */
             
             FileInputStream state = new FileInputStream(file);
             Scanner scanner = new Scanner (state);

             String [] array = new String [3]; //change back to lineNum

             for (int i = 0; i < 3; i++) { //change back to lineNum
                 array[i] = scanner.nextLine();
                 System.out.println("Worked."); //tells if it worked.
             }

             /**

             for (int i = 0; i < array.length; i++) {
                 System.out.println(array[i]);
             }
              */ //for next load
         } catch (FileNotFoundException e) {
             System.out.println("File does not exist.");
         }
     }
 }