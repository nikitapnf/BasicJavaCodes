package basicPrograms;

public class string1 {

	private void caseCount(String str) {
		int len = str.length();
		int ucount = 0, lcount = 0, scount = 0, sscount = 0, dcount = 0;
		for (int i = 0; i < len; i++) {
			char ch = str.charAt(i);
			if (Character.isUpperCase(ch)) {
				ucount++;
			} else if (Character.isLowerCase(ch)) {
				lcount++;
			} else if (Character.isDigit(ch)) {
				dcount++;
			} else if (ch != ' ')
				scount++;
			else
				sscount++;

		}
		System.out.println("Upper Case letters are: " + ucount);
		System.out.println("Lower Case letters are: " + lcount);
		System.out.println("Digits are: " + dcount);
		System.out.println("Special Characters are: " + scount);
		System.out.println("Spaces are are: " + sscount);

		// calculating their percentage
		System.out.println("% Uppercase " + (ucount * 100) / len);
		System.out.println("% lowercase " + (lcount * 100) / len);
		System.out.println("% digits " + (dcount * 100) / len);
		System.out.println("% Special characters " + (scount * 100) / len);
		System.out.println("% Space Count " + (sscount * 100) / len);

	}

	public static void main(String[] args_) {

		string1 s = new string1();
		s.caseCount("I am Nikita AND I live in U||arakhand 1");

	}

}
