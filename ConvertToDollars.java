
/**
 * ConvertToDollars
 * 
 * Cookjon
 * 9/7/2016
 */
import java.util.Scanner;
import java.text.DecimalFormat;
public class ConvertToDollars
{   public static void main(String [] args) {
      Scanner scnr = new Scanner(System.in);
      double quarters;
      double dimes;
      double nickles;
      double pennies;
      double totalChange =0;
      
      System.out.println("Enter quarters:");
      quarters = scnr.nextInt();
       quarters  = quarters*.25;
       System.out.println("Enter dimes:");
      dimes = scnr.nextInt();
       dimes  = dimes*.10;
       System.out.println("Enter nickles:");
      nickles = scnr.nextInt();
       nickles  = nickles*.05;
       System.out.println("Enter pennies:");
      pennies = scnr.nextInt();
       pennies  = pennies*.01;
        totalChange = quarters+dimes+nickles+pennies;
        DecimalFormat numberFormat = new DecimalFormat("#.00");
        System.out.println("This is equivalent to $" + numberFormat.format(totalChange));
      return;
   }
    
}
