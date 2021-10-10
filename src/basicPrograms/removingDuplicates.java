package basicPrograms;

public class removingDuplicates {

	public static void main(String[] args) {

		StringBuilder str = new StringBuilder();
		String s = "I am NOT NIKITA I am from nainital";
		char[] ch = s.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			boolean repeated = false;
			for (int j = i + 1; j < ch.length; j++) {
				if (ch[i] == ch[j]) {
					repeated = true;
					break;

				}

			}
			if (!repeated) {
				str.append(ch[i]);

			}

		}
		System.out.println(str);

		// USING StringBuilder functions
		StringBuilder str1 = new StringBuilder();
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			int ind = s.indexOf(c, i + 1);
			if (ind == -1) {
				str1.append(c);

			}

		}
		System.out.println(str1);

	}

}
