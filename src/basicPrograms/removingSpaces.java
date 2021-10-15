package basicPrograms;

public class removingSpaces {

	public static void main(String[] args) {
		// if encounter any space remove it
		// Use replaceALL or do by simple method
		// using replaceAll
		String s = "I am the Nikita";
		String s2 = s.replaceAll("\\s", "");
		System.out.println(s2);

		// By simple approach
		StringBuilder s3 = new StringBuilder();
		char ch[] = s.toCharArray();
		for (int i = 0; i < s.length(); i++) {
			if (ch[i] != ' ' && ch[i] != '\t') {
				s3.append(ch[i]);

			}

		}

		System.out.println(s3);
	}

}
