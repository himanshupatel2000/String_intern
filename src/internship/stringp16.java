package internship;
import java.util.*;
public class stringp16
{
 public static void main(String args[])
 {
	 Scanner sc=new Scanner(System.in);
	 String s[]=new String[5];
	 String wrd;
	 char ch;
	 int i;
	 System.out.println("Enter 5 string");
	 for(i=0;i<5;i++)
	   {
		 s[i]=sc.nextLine();
	   }
	 
	 for(i=0;i<5;i++)
	   {
		 wrd=s[i];
		 ch=s[i].charAt(0);
		 if("aeiouAEIOU".indexOf(ch)!=-1)
		 System.out.println("word is: "+wrd);
	   }
	 sc.close();
 }
}

