package internship;
import java.util.*;
public class stringp12
{
 public static void main(String args[])
 {
	 Scanner sc=new Scanner(System.in);
	 int l;
	 String s,s1[];
	 System.out.println("Enter a string.");
	 s=sc.nextLine();
	 s1=s.split(" ");
	 l=s1.length;
	 String s2=s1[0];
	 s2=s2.toLowerCase();
	 String s3=s1[l-1];
	 s3=s3.toLowerCase();
	 if(s2.equalsIgnoreCase("miss") || s3.equalsIgnoreCase("kumari")||s2.equalsIgnoreCase("kumari."))
		 System.out.println("Gender: Unmarried Girl");
	 else if(s2.equalsIgnoreCase("mrs") || s2.equalsIgnoreCase("mrs."))
		 System.out.println("Gender: Married Women");
	 else if(s2.equalsIgnoreCase("mr")|| s2.equalsIgnoreCase("mr."))
		 System.out.println("Gender:Male");
	 else
		 System.out.println("Gender:Can't determine.");
	 sc.close();
 }
}