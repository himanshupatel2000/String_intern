package internship;
import java.util.*;
public class stringp14
 {
   public static void main(String args[])
    {
	  Scanner sc=new Scanner(System.in);
	  String s;
	  System.out.println("Enter the first string.");
	  s=sc.nextLine();
	  s=s.replaceAll("15 august", "26 january");
	  s=s.replaceAll("independence", "republic");
	  System.out.println("String is"+s);
	  sc.close();
    }
 }

