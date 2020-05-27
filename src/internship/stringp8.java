package internship;
import java.util.*;
public class stringp8
{
 public static void main(String args[])
 {
	 Scanner sc=new Scanner(System.in);
	 int i,l;
	 String s,s1="";
	 char ch;
	 System.out.println("Enter a string.");
	 s=sc.nextLine();
	 l=s.length();
	 for(i=0;i<l;i++)
	 {
		ch=s.charAt(i);
		if(Character.isUpperCase(ch))
		{
		  ch=Character.toLowerCase(ch);
		  s1=s1+ch;
		}
		else if(Character.isLowerCase(ch))
		{
		  ch=Character.toUpperCase(ch);
		  s1=s1+ch;
		}
	 }
	System.out.println("Converted string is."+s1);
	 sc.close();
 }
}