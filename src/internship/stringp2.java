package internship;
import java.util.*;
public class stringp2 
{
 public static void main(String args[])
 {
	 Scanner sc=new Scanner(System.in);
	 String f,m,l,full;
	 String initials=" ";
	 System.out.println("Enter your first name");
	 f=sc.nextLine();
	 System.out.println("Enter your middle name");
	 m=sc.nextLine();
	 System.out.println("Enter your last name");
	 l=sc.nextLine();
	 full=f+" "+m+" "+l;
	 initials=f.charAt(0)+"."+m.charAt(0)+"."+l.charAt(0);
	 System.out.println("Your full name is:"+full);
	 System.out.println("Initials are:"+initials); 
	 sc.close();
 }
}
