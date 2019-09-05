import java.io.*;
import java.util.*;

//receives an array and scanner
class save {
    public static void main (String [] args) {
         try {
             /** Delete this **/
             
             String [] array = new String [2];
             array[0] = "10101";
             array[1] = "11011";

             Scanner scnr = new Scanner (System.in);

             /** Delete this **/

             System.out.print("Choose a file to save in: ");
             String name = scnr.nextLine();
             File file = new File (name);

             if (!file.exists()) {
                 try {
                     file.createNewFile();
                 } catch (IOException e) {
                     System.out.println("Could not find file.");
                 }
             }

             FileOutputStream out = new FileOutputStream(file);
             String enter = "\n";
             byte [] enterToBytes = enter.getBytes();

             for (int i = 0; i < array.length; i++) {
                 String string = array[i];
                 byte [] lettersToBytes = string.getBytes();
                 out.write(lettersToBytes);
                 out.write(enterToBytes);
             }
   
         } catch (IOException e) {
             System.out.println("Failed.");
         }
         
    }
}