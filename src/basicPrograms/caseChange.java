package basicPrograms;

public class caseChange {

	public static void main(String[] args) {
		//using toUpper()
		String str = "I am the $ikita";
		str = str.toUpperCase();
		System.out.println(str);

		
		//Uppercasing 1st alphabet of every word
		String s = "i Am the $ikita";
		String s1 = "";
		s = ' ' + s;
		for (int i= 0; i<s.length();) {
			char ch = s.charAt(i);
			if (ch == ' ' && Character.isLowerCase(s.charAt(i+1))
					){
				s1 = s1 +' '+ Character.toUpperCase(s.charAt(i+1));
				i = i + 2;

			} else {
				s1 = s1 + ch;
				i++;

			}

		}

		System.out.println(s1);

	}
}
