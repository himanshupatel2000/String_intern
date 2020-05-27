package internship;
import java.util.*;
public class stringp13
 {
   public static void main(String args[])
    {
	  Scanner sc=new Scanner(System.in);
	  String s1,s2;
	  System.out.println("Enter the first  string.");
	  s1=sc.nextLine();
	  System.out.println("Enter the second  string.");
	  s2=sc.nextLine();
	  if(s1.compareTo(s2)>0)
	   {
		 System.out.println(s2);
		 System.out.println(s1);
	   }
	 else if(s1.compareToIgnoreCase(s2)<0)
	   {
		 System.out.println(s1);
		 System.out.println(s2);
	  }
	 else
	  {
		 System.out.println("Both are same .");
	  }
	
	 sc.close();
    }
 }

