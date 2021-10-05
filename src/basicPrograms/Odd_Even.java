package basicPrograms;

import java.util.Scanner;

public class Odd_Even {

	public static void main(String[] args) {
	int num;
	Scanner s= new Scanner(System.in); 
	System.out.println("Enter number");
	num=s.nextInt();
	if(num%2==0) {
	 System.out.println(num + "it is even");
	  		
	}
	else 
	{
		System.out.println("it's odd");
	}
	
	
	}

}
