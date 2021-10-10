package basicPrograms;

public class PracticeJava {
	// magic number
	public static void main(String[] args) {

		int i = 325, sum = 0, nNum;

		while (i > 0 || sum > 9) {

			if (i == 0) {
				i = sum;
				sum = 0;

			}

			nNum = i % 10;
			sum = sum + nNum;
			i = i / 10;

		}

		if (sum == 1)
			System.out.println("Magic Number");
		else
			System.out.print("Not a magic number");
	}

}
