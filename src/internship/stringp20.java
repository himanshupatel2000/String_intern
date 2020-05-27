package internship;
import java.util.*;
public class stringp20
 {
   public static void main(String args[])
    {
	  Scanner sc=new Scanner(System.in);
	  int i,l;
	  String s,s1[],wrd;
	  System.out.println("Enter the string.");
	  s=sc.nextLine();
	  s1=s.split(" ");
	  l=s1.length;
	  System.out.println("Words having length more than 5 are:");
	 for(i=0;i<l;i++)
	 {
		 wrd=s1[i];
		 if(wrd.length()>5)
		 System.out.println(wrd); 
	}
	 sc.close();
    }
 }

