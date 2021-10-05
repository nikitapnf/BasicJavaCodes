package basicPrograms;

public class Fibonacci {

	public static void main(String[] args) {
		int a = 1, num3;
		int b = 2;
		int counter = 0;

		while (counter<11) {
			System.out.print(a+" ");
			num3 = a + b;
			a = b;
			b = num3;
			counter ++;

		}

	}

}
