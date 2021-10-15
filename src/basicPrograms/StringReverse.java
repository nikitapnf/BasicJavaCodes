package basicPrograms;

import java.util.Arrays;

import java.util.Scanner;

public class StringReverse {

	public static void main(String[] args) {
		/*
		 * String rev = ""; // using StringBuilder reverse() method String S1 = new
		 * String("I AM REVERSING THE JAVA STRING"); StringBuilder S2 = new
		 * StringBuilder(S1); // S2.append(S1); System.out.println(S2.reverse());
		 * 
		 * // converting to char array and then reversing char[] s1ar =
		 * S1.toCharArray(); for (int i = s1ar.length - 1; i >= 0; i--) { rev = rev +
		 * s1ar[i];
		 * 
		 * } System.out.println(rev);
		 * 
		 * // using StringBuffer class
		 * 
		 * StringBuffer S = new StringBuffer(S1); System.out.println(S.reverse());
		 * 
		 * // use of scanner class String rever = "";
		 * System.out.println("Enter String"); Scanner s = new Scanner(System.in);
		 * String Str = s.nextLine(); int len = Str.length(); for (int i = len - 1; i >=
		 * 0; i--) { rever = rever + Str.charAt(i);
		 * 
		 * }
		 * 
		 * if (rever.equals(Str)) System.out.println("Palindrome"); else
		 * System.out.println("Not Palindrome"); System.out.println(rever);
		 * 
		 * // reversing each word in JAVA
		 * 
		 * String s3 = "I love Coding"; String[] strar = s3.split("\\s"); String reverse
		 * = ""; for (int i = 0; i < strar.length; i++) { String rword = ""; String word
		 * = strar[i]; for (int j = word.length() - 1; j >= 0; j--) { rword = rword +
		 * word.charAt(j);
		 * 
		 * } reverse = reverse + ' ' + rword;
		 * 
		 * } System.out.println(reverse);
		 */

		// toggle each word
		String s4 = "coDIng iS Good";

		char ch[] = s4.toCharArray();

		for (int i = 0; i < ch.length; i++) {
			if (ch[i] >= 'A' && ch[i] <= 'Z') {
				ch[i] = (char) ((int) ch[i] + 32);
			} else if (ch[i] >= 'a' && ch[i] <= 'z') {
				ch[i] = (char) ((int) ch[i] - 32);
			}
		}
		System.out.println("The toggled string is :-");
		for (int j = 0; j < ch.length; j++)
			System.out.print(ch[j]);

		// with methods
		int len = s4.length();
		String str1 = "";
		for (int i = 0; i < len; i++) {
			if (Character.isUpperCase(s4.charAt(i))) {
				str1 = str1 + Character.toLowerCase(s4.charAt(i));

			}

			else if (Character.isLowerCase(s4.charAt(i))) {
				str1 = str1 + Character.toUpperCase(s4.charAt(i));

			}

		}
		System.out.println("\t" + str1);

		// using split
		String tr="";
		String s5 = "cOding is The job";
	     String s6 = "";
		for (int j = 0; j < s5.length(); j++) {
				if (Character.isUpperCase(s5.charAt(j)))
					s6 = s6 + Character.toLowerCase(s5.charAt(j));
				else
					s6 = s6 + Character.toUpperCase(s5.charAt(j));

			}
		System.out.println(s6);
		
		//reverse toggle each word.
		String s7= "coDING iS in JAva";
		String s8="";
		String temp[]= s7.split("\\s");
		int len1= temp.length;
		for(int i=0;i<len1;i++) {
			String tword= temp[i];
		    for(int j=tword.length()-1;j>=0;j--) {
		    	s8=s8+tword.charAt(j);
		    	if(j==0)
		    		s8=s8+ ' ';
		    	else
		    		continue;
		    	 }
			
		}
	
		System.out.println(s8);
		for(int p=0;p<s8.length();p++) {
			if(Character.isUpperCase(s8.charAt(p)))
				tr=tr+Character.toLowerCase(s8.charAt(p));
				else	tr=tr+Character.toUpperCase(s8.charAt(p));			
			
			
			
		}

		System.out.println(tr);
		
		}

	}

