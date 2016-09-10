
/**
 * MadLib 
 * 
 * Cookjon
 * 9/7/2016
 */import java.util.Scanner;
import java.text.DecimalFormat;
public class MadLib
{   public static void main(String [] args) {
      Scanner scnr = new Scanner(System.in);
      String food = new String();
      String color = new String();
      String emotion = new String();
      String name = new String();
      String animal = new String();
      
      System.out.println("Enter a food:");
      food = scnr.nextLine();
      System.out.println("Enter a color:") ;
      color = scnr.nextLine();
      System.out.println("Enter a emotion:");
      emotion = scnr.nextLine();
      System.out.println("Enter your name:");
      name = scnr.nextLine(); 
      System.out.println("Enter an animal:");
      animal = scnr.nextLine();
      System.out.println(name + " had a long day at work. After a long day, " + name + " couldn’t help but feel "  + emotion + ". His favorite way to unwind after his long workday is with a giant serving of " + food + ". The dinner was so good that even his pet "+ animal +" wanted a serving! After their meal, the duo sat down and watched the beautiful " + color +" sunset. "); 

      return;
   }

    
}
