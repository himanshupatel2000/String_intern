package internship;
import java.util.*;
public class stringp23
{
 public static void main(String args[])
 {
	 Scanner sc=new Scanner(System.in);
	 int i;
	 String s[]=new String[5];
	 int a[]=new int[5];
	 System.out.println("Enter roll no");
	 for(i=0;i<5;i++)
	  {
		 a[i]=sc.nextInt();
	  }
	 System.out.println("Enter name no");
	 for(i=0;i<5;i++)
	  {
		 s[i]=sc.nextLine();
	  }
	 System.out.println("Names "+ "      "+" Roll No.");
	 for(i=0;i<5;i++)
	  {
	   System.out.println(s[i]+ "        "+ a[i]);
	  }
	 sc.close(); 
  }
}
