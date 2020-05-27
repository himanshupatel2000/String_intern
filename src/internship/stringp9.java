package internship;
import java.util.*;
public class stringp9
{
 public static void main(String args[])
 {
	 Scanner sc=new Scanner(System.in);
	 int i,l;
	 String s,s1="";
	 char ch[];
	 System.out.println("Enter a string.");
	 s=sc.nextLine();
	 ch=s.toCharArray();
	 l=ch.length;
	 for(i=l-1;i>=0;i--)// forward loop
	 {
		s1=s1+ch[i]; //s1=ch+s1;
	 }
	 if(s.equalsIgnoreCase(s1))
		 System.out.println("String "+s+" is palindrome.");
	 else
		 System.out.println("Not a palindrome.");
	 sc.close();
 }
}



