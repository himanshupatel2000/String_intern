package internship;
import java.util.*;
public class stringp19
 {
   public static void main(String args[])
    {
	  Scanner sc=new Scanner(System.in);
	  char ch,ch1;
	  int l,i;
	  String s,s1[],wrd;
	 System.out.println("Enter the string.");
	 s=sc.nextLine();
	 s1=s.split(" ");
	 l=s1.length;
	 for(i=0;i<l;i++)
	 {
		 wrd=s1[i];
		 ch=wrd.charAt(0);
		 ch1=Character.toUpperCase(ch);
		 s1[i]=ch1+wrd.substring(1);
	 }
	 for(i=0;i<l;i++)
		 System.out.print(s1[i]+" ");
	 sc.close();
    }
 }

