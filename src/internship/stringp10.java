package internship;
import java.util.*;
public class stringp10
{
 public static void main(String args[])
 {
	 Scanner sc=new Scanner(System.in);
	 int l1,l2;
	 String s1,s2;
	 System.out.println("Enter a string.");
	 s1=sc.nextLine();
	 l1=s1.length();
	 System.out.println("Enter the position.");
	 l2=sc.nextInt();
	 s2=s1.substring(l2-1,l1);
     System.out.println("Substring part is: "+s2);
	 sc.close();
 }
}
