package internship;
import java.util.*;
public class stringp22
 {
   public static void main(String args[])
    {
	  Scanner sc=new Scanner(System.in);
	  int i,k,l,l1,flag=0;
	  String s,wrd,s1[];
	  char ch,ch1;
	  System.out.println("Please enter the sentence.");
	  s=sc.nextLine();
	  s1=s.split(" ");
	  l=s1.length;
	 for(i=0;i<l;i++)
	 {
		 wrd=s1[i];
		 l1=wrd.length();
		 for(k=0;k<l1-1;k++)
		 {
			 ch=s1[i].charAt(k);
			 ch1=s1[i].charAt(k+1);
			 if(ch==ch1)
			 {
			 System.out.println("Word double sequence is :"+wrd) ;
			 flag++;
			 }
			 
		 }
		 
	 }
	 if(flag==0)
		 System.out.println("No word founded with double sequence.") ;
	 sc.close();
    }
 }

