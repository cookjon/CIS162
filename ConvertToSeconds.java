
/**
 * Write a description of class ConvertToSeconds here.
 * 
 * @Djenan Vujinovic & Jon Cook 
 * @9/17/2016
 */
import java.util.Scanner;
public class ConvertToSeconds
{
    public static void main(String [] args) {
      Scanner scnr = new Scanner(System.in);
      int numHours  = 0;
      int numMinutes = 0;
      int numSeconds = 0;
     int totalSeconds = numHours+numMinutes+numSeconds;
      
      System.out.println("Enter hours:");
      numHours = scnr.nextInt();
       numHours  = numHours*3600;
      System.out.println("Enter hours:" + numHours);      
      System.out.println("Enter minutes");
      numMinutes = scnr.nextInt();
      numMinutes = numMinutes*60;
      System.out.println("Enter minutes:"+numMinutes);
      System.out.println("Enter seconds");
      numSeconds=scnr.nextInt();
       numSeconds = numSeconds;
      System.out.println("Enter seconds:"+numSeconds);
       totalSeconds = numHours+numMinutes+numSeconds;
      System.out.println("This is equivalent to "+totalSeconds+ " seconds");
      return;
   }
}
