package internship;
import java.util.*;
public class stringp6
{
 public static void main(String args[])
 {
	 Scanner sc=new Scanner(System.in);
	 int l;
	 boolean l1;
	 String s1,s2;
	 System.out.println("Enter first string.");
	 s1=sc.nextLine();
	 System.out.println("Enter second string.");
	 s2=sc.nextLine();
     l=s1.compareTo(s2);
     l1=s1.equals(s2);
	 System.out.println("Comparision of two strings is:"+l);
	 System.out.println("Comparision of two strings is:"+l1);
	 sc.close();
 }
}
