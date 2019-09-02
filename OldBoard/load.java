import java.util.*;
import java.io.*;

class load { //sees how many lines a saved board has
     public static void main (String [] args) {
         try {
             // ** comment this all out **//
             Scanner scnr = new Scanner(System.in);
             System.out.print("File name: ");
             String response = scnr.nextLine();
             File file = new File (response);

             //**                       **//
             
             FileInputStream in = new FileInputStream (file);
             Scanner scan = new Scanner (in);

             int lineNum = 0;

             while (scan.hasNext()) {
                 String lines = scan.nextLine();
                 //checks how many lines there are
                 lineNum ++;
             }
             System.out.println("Number of lines: " + lineNum); //comment this out
             
             /** //next parts (uncomment when ready)
             FileInputStream state = new FileInputStream(file);
             Scanner scanner = new Scanner (state);

             String [] array = new String [lineNum];

             for (int i = 0; i < lineNum; i++) {
                 array[i] = scanner.nextLine();
             }

             for (int i = 0; i < array.length; i++) {
                 System.out.println(array[i]);
             }
              */
         } catch (FileNotFoundException e) {
             System.out.println("File does not exist.");
         }
     }
 }