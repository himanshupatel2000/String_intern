package internship;
import java.util.*;
public class stringp11 
{
 public static void main(String args[])
 {
	 Scanner sc=new Scanner(System.in);
	 String s,s1=" ";
	 int i,l;
	 char ch;
	 System.out.println("Enter a string");
	 s=sc.nextLine();
	 l=s.length();
	 for(i=0;i<l;i++)
	 {
		 ch=s.charAt(i);
		 if("aeiouAEIOU".indexOf(ch)!=-1)
		 {
			 s1=s1+s.substring(i)+s.substring(0,i)+"ay";
			 break;
		 }
	 }
	 System.out.println("Piglatin form is:"+s1);
	 sc.close();
 }
}
