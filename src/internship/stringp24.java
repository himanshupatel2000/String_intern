package internship;
import java.util.*;
public class stringp24
{
 public static void main(String args[])
 {
	 Scanner sc=new Scanner(System.in);
	 int i;
	 String s1[]=new String[7];
	 String s2[]=new String[7];
	 String name;
	 System.out.println("Enter the country names.");
	 for(i=0;i<7;i++)
	 {
		 s1[i]=sc.nextLine();
	 }
	 System.out.println("Enter corresponding wonder names.");
	 for(i=0;i<7;i++)
	 {
		 s2[i]=sc.nextLine();
	 }
	 System.out.println("Enter a country or wonder name.");
	 name=sc.nextLine();
	 for(i=0;i<7;i++)
	 {
		 if(name.equals(s1[i]))
		 {
			 System.out.println("Wonder of "+s1[i]+"is : "+s2[i]);
			 System.exit(1);
		 }
		 else if(name.equalsIgnoreCase(s2[i]))
		 {
			 System.out.println("Country with wonder '"+s2[i]+"' is: "+s1[i]);
			 System.exit(1);
		 }
	 }
	 System.out.println("Wrong input");
	 sc.close(); 
	 
	 
 }
}
