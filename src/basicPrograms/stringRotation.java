package basicPrograms;

public class stringRotation {

	public static void main(String[] args) {
		// Rotation: the string rotate around a certain character or collection of
		// characters eg: NIKITA, TANIKI
		// Approach: 1. concatenate the original string with itself this way it contains
		// all its rotations. NIKITANIKITA
		// 2. CHECK if 2nd string is a sunset of this concatenated string

		String s1 = "NIKITA";
		String s2 = "TANIKI";
		String temp = s1 + s1;
		if (s1.length() != s2.length())
			System.out.println("Not a Rotation");

		else if (temp.contains(s2))
			System.out.println("Is a rotation");
		else
			System.out.println("Not a rotation");

	}
}
