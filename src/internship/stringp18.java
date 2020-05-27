package internship;
import java.util.*;
public class stringp18
{
	 public static void main(String args[])
	 {
		 Scanner sc=new Scanner(System.in);
		 String s;
		 char ch,ch1;
		 int i,j,l,c=0;
		 System.out.println("Enter the string.");
		 s=sc.nextLine();
		 l=s.length();
		 for(i=0;i<l;i++)
		 {
			 
			 ch=s.charAt(i);
			 for(j=0;j<l;j++)
			 {
				 ch1=s.charAt(i);
				 if(ch==ch1)
					 c++;
			 }
			 System.out.println("Frequency of"+ch+"is"+c);
		 }
		 sc.close();
     }
}

