package basicPrograms;
//program to find missing number from array of 1 to n number
public class MissingNumber {
	public static void main(String[] args) {
		int[] arr = { 4, 3, 5, 6, 1, 2, 7 };
		int no = findnum(arr);
		System.out.println(no);

	}

	private static int findnum(int[] array) {

		int n = array.length+1;
		int s = 0;
		int sum = n * (n + 1) / 2;
		for (int i = 0; i < array.length; i++) {
			s = s + array[i];

		}

		int numb = sum - s;

		return numb;
	}
}
