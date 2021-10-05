package basicPrograms;

public class CaseCheck {

	public static void main(String[] args) {
		String str = "I am in India. And it S$cks123";
		int ucount = 0, lcount = 0, scount = 0, ncount = 0;
		System.out.println("Giving case count");
		
	//this is without method	

	/*	for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (ch >= 'A' && ch <= 'Z')
				ucount++;
			else if (ch >= 'a' && ch <= 'z')
				lcount++;
			else if (ch >= '0' && ch <= '9')
				ncount++;
			else if(ch!=' ')
				scount++;

		}
		System.out.println(ucount);
		System.out.println(lcount);
		System.out.println(scount);
		System.out.println(ncount);
	}*/


		int len = str.length();
		for (int i = 0; i < len; i++) {
			if (Character.isUpperCase(str.charAt(i)))
				ucount++;
			if (Character.isLowerCase(str.charAt(i)))
				lcount++;
			if (Character.isDigit(str.charAt(i)))
				ncount++;
		}

System.out.println(ucount);
System.out.println(lcount);
System.out.println(ncount);


}

}