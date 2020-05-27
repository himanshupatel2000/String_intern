package internship;
import java.util.*;
public class stringp17
 {
   public static void main(String args[])
    {
	  Scanner sc=new Scanner(System.in);
	  int i,j,l,l1;
	  String s,s1[],s2=" ",wrd;
	  char ch;
	  System.out.println("Enter the string.");
	  s=sc.nextLine();
	  s1=s.split(" ");
	  l=s1.length;
	  
	  for(i=0;i<l;i++)
	  {
		  wrd=s1[i];
		  l1=wrd.length();
	        for(j=0;j<l1;j++)
	          {
		        ch=wrd.charAt(j);
		        if(j%2==0)
		          {
		            ch=Character.toUpperCase(ch);
		            s2=s2+ch;
		          }
		        else
		          {
		            ch=Character.toLowerCase(ch);
		            s2=s2+ch;
	              }
	          }
	       System.out.print(s2+" ");
	       s2=" ";
	  }  
	  sc.close();
    }
 }
