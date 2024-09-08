package printcustomizeddiamond;
import java.util.Scanner;
public class PrintCustomizedDiamond {
public static void main(String[] args) {
Scanner scnr = new Scanner(System.in);

String letter;
int size;

System.out.print("Enter a letter: ");
letter = scnr.nextLine();
System.out.print("Enter a size (even number no less than 6): ");
size = scnr.nextInt();

while (true) {

if (size >= 6 && size % 2 == 0) {
               int spaces = size / 2;
               int chars = 1;
               
               System.out.println();
               
               for (int i = 0; i < size / 2; i++) {
                   for (int j = 0; j < spaces; j++) {
                       System.out.print(" ");
                   }
                   for (int j = 0; j <= chars; j++) {
                       System.out.print(letter);
                   }
                   System.out.println();
                   --spaces;
                   chars += 2;
               }
               spaces = 1;
               chars = size - 2;
               for (int i = 0; i < size / 2; i++) {
                   for (int j = 0; j < spaces; j++) {
                       System.out.print(" ");
                   }
                   for (int j = -1; j <= chars; j++) {
                       System.out.print(letter);
                   }
                   System.out.println();
                   ++spaces;
                   chars -= 2;
               }
               break;
           } else {
               System.out.print("Enter a size (even number no less than 6): ");
               size = scnr.nextInt();
               continue;
           }
       }
scnr.close();
   }
}