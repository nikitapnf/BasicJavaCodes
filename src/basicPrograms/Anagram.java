package basicPrograms;

import java.util.Arrays;

public class Anagram {
	// Anagarm are two strings that has same alphabets but order id different. eg:
	// LISTEN, SILENT
	// approach: 1. check for length, if not equal, not anagram
	// 2.convert to character array and then sort the array.
	// 3. compare if equal the Anagram

	public static void main(String[] args) {
		String str1= "LISTEN";
		String str2= "SILENT";
		if(str1.length()!= str2.length())
		System.out.println("not anagram");
		else 
		{
			char[] c1=str1.toCharArray();
			char[] c2=str2.toCharArray();
			Arrays.sort(c1);
            Arrays.sort(c2);
            System.out.println(c1);
            System.out.println(c2);
            
            if(Arrays.equals(c1, c2))
            	System.out.println("anagram");
            else 
            	System.out.println("not anagram");
                    
			
		}
	}

}


