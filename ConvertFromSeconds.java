
/**
 * Write a description of class ConvertFromSeconds here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
  import java.util.Scanner;
public class ConvertFromSeconds
{
    public static void main(String [] args) {
      Scanner scnr = new Scanner(System.in);
      int numHours  = 0;
      int numMinutes = 0;
      int numSeconds = 0;
      int aux = 0;
      
      System.out.println("Enter seconds:");
      numSeconds = scnr.nextInt();
       numSeconds  = numSeconds;
       numHours = numSeconds/3600;
       numMinutes = numSeconds%3600;
       aux = numMinutes;
       numMinutes = aux/60;
       numSeconds = aux%60;
      System.out.println("This is " + numHours + ", " + numMinutes + " and " + numSeconds + " seconds.");      

      return;
   }
}
