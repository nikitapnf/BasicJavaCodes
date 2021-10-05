package basicPrograms;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		// Palindrome are that which are equal to their reverse.
		// String

		String revStr = "";
		Scanner s = new Scanner(System.in);
		System.out.println("Enter string to check");
		String str = s.nextLine();
		int len = str.length();
		for (int i = len - 1; i >= 0; i--) {

			revStr = revStr + str.charAt(i);

		}
		System.out.println("reversed string is: " + revStr);

		if (str.equals(revStr))
			System.out.println("Palindrome");

		else
			System.out.println("not palindrome");
		
		// number
		Scanner r = new Scanner(System.in);
		System.out.println("Enter number to check");
		int i = r.nextInt();
		int temp = i;
		int rem, rev = 0;
		while (temp != 0) {
			rem = temp % 10;
			rev = rev * 10 + rem;
			temp = temp / 10;
		}
		
		System.out.println("reverse number is:" +rev);
		if (rev == i)
			System.out.println("Palindrome");
		else
			System.out.println("Not palimdrome");

	}
}
