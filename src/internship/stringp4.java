package internship;
import java.util.*;
public class stringp4
{
 public static void main(String args[])
 {
	 Scanner sc=new Scanner(System.in);
	 int i,l,count=0;
	 String s;
	 char ch;
	 System.out.println("Enter a string.");
	 s=sc.nextLine();
	 l=s.length();
	 for(i=0;i<l;i++)
	 {
		 ch=s.charAt(i);
		 if( ("aeiouAEIOU".indexOf(ch)!=-1))
		 {
			 count++;
		 }
	 }
	 System.out.println("Total no. of vovels are:"+count);
	 sc.close();
 }
}

