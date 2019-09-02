import java.util.*;
import java.io.*;

class load3 { //displays game board in terminal
     public static void main (String [] args) {
         try {
             // ** comment this all out **//
             Scanner scnr = new Scanner(System.in);
             System.out.print("File name: ");
             String response = scnr.nextLine();
             File file = new File (response);

             //**                       **//
             
             /**
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

             /**
             String [] array = new String [lineNum];

             for (int i = 0; i < lineNum; i++) {
                 array[i] = scanner.nextLine();
             }
             */
             String [] array = new String [3]; //delete this

             for (int i = 0; i < 3; i++) {
                 array[i] = scanner.nextLine(); //delete this
                 System.out.println(array[i]);
             }
         } catch (FileNotFoundException e) {
             System.out.println("File does not exist.");
         } 
     }
 }