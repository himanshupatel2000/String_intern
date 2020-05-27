package internship;
import java.util.*;
public class stringp7 
{
  public static void main(String args[])
  {
   Scanner sc=new Scanner(System.in);
   int n;
   while(true)
   {
   System.out.println("Enter a  number.");
   System.out.println("press 8 to exit");
   n=sc.nextInt();
   switch(n)
   {
   case 1:
	   System.out.println("Monday");
	   break;
   case 2:
	   System.out.println("Tuesday");
	   break;
   case 3:
	   System.out.println("Wednesday");
	   break;
   case 4:
	   System.out.println("Thursday");
	   break;
   case 5:
	   System.out.println("Friday");
	   break;
   case 6:
	   System.out.println("Saturday");
	   break;
   case 7:
	   System.out.println("Sunday");
	   break;
   case 8:
	   System.exit(0);
	   sc.close();
	default:
	 System.out.println("Wrong choice.");
	} 
   }  
} 
}
