package basicPrograms;

import java.util.HashMap;
import java.util.Map;

public class ReccuranceinString {

	public static void main(String[] args) {
		String str = "I am in India and I love my Country";
		char arr[] = str.toCharArray();

		for (int i = 0; i < arr.length; i++) {
			int count = 1;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j] && arr[i] != ' ') {
					count++;
					arr[j] = '0';

				}
			}
			if (count > 1 && arr[i] != '0')
				System.out.println("repeatition of: " + arr[i] + count);

		}
//for distinct irrespective of case
		System.out.println("Distinct count:");
		String strng = str.toLowerCase();
		char arr1[] = strng.toCharArray();

		for (int i = 0; i < arr1.length; i++) {
			int count = 1;
			for (int j = i + 1; j < arr1.length; j++) {
				if (arr1[i] == arr1[j]  && arr[i] != ' ') {
					count++;
					arr1[j] = '0';

				}
			}
			if (count > 1 && arr1[i] != '0')
				System.out.println("repeatition of " + arr1[i] + count);

		}

	}

}
