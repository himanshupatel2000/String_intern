package internship;
import java.util.*;
public class stringp5
{
 public static void main(String args[])
 {
	 Scanner sc=new Scanner(System.in);
	 int l;
	 String s,s1[];
	 System.out.println("Enter a string.");
	 s=sc.nextLine();
	 s1=s.split(" ");
	 l=s1.length;
	 System.out.println("No of words are:"+l);
	 sc.close();
 }
}


