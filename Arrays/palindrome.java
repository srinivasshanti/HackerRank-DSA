package src;
import java.util.*;

public class pracc {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		
		String nstr="";
		
		for (int i=0; i<str.length(); i++)
	      { 
	        char c= str.charAt(i); //extracts each character
	         nstr= c+nstr; //adds each character in front of the existing string
	      }
		System.out.println(nstr);
		
		if(str.equals(nstr))
		{
			System.out.println("palindrom");
		}
		else {
			System.out.println("not ");
		}
		
		

  }
}
