package internship;
import java.util.*;
public class stringp21
 {
   public static void main(String args[])
    {
	  Scanner sc=new Scanner(System.in);
	  int i,j,l,l1,flag=0;
	  String s,s1[],wrd,s3="";
	  char ch;
	  System.out.println("Please enter the sentence.");
	  s=sc.nextLine();
	  s=s.replace(".", "");
	  System.out.println(s);
	  s1=s.split(" ");
	  
	  l=s1.length;
	  System.out.println("Palindrome words are:");
	 for(i=0;i<l;i++)
	 {
		 wrd=s1[i];
		 l1=wrd.length();
		 for(j=0;j<l1;j++)
		 {
			  ch=wrd.charAt(j);
			  s3=ch+s3;
		 }
		 if(s3.equals(wrd))
		 {
		   System.out.println(wrd);
		   flag=1;
		 }
		 s3="";
	 }
	 if(flag==0)
	 System.out.println("Zero");	 
	 sc.close();
    }
 }

