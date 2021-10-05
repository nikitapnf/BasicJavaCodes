package basicPrograms;

import java.util.Arrays;

import java.util.Scanner;

public class StringReverse {

	public static void main(String[] args) {
		String rev="";
	// using StringBuilder reverse() method
		String S1= new String("I AM REVERSING THE JAVA STRING");
		StringBuilder S2= new StringBuilder(S1);
		//S2.append(S1);
		System.out.println(S2.reverse());
		
	//converting to char array and then reversing
	   char[] s1ar= S1.toCharArray();
		   for(int i=s1ar.length-1; i>=0; i--)
	   {
				rev=rev+s1ar[i];
				
	   }		   
				System.out.println(rev);
				
	//using StringBuffer class		
				
				StringBuffer S= new StringBuffer(S1);
				System.out.println(S.reverse());
			 
	//use of scanner class
				System.out.println("Enter String");
				Scanner s =new Scanner(System.in);
				String Str= s.nextLine();
				int len=Str.length();
				for(int i= len-1;i>=0;i-- )
				{
					rev=rev+Str.charAt(i);
										
				}
				
				System.out.println(rev);
					
					
				
		
}
	
}
