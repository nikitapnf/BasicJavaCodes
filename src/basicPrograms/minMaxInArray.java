package basicPrograms;

public class minMaxInArray {

	public static void main(String[] args) {
		int[] arr = { 45, 97, 0, 87, 44 , -2};
		int min = 0;
		int max = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max)
				max = arr[i];
			if (arr[i] < min)
				min = arr[i];

		}
		System.out.println(max);
		System.out.println(min);

	}

}
