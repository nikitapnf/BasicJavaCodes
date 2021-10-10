package basicPrograms;

import java.util.Arrays;

class largetInArray {

	public static void main(String[] args) {
		// for largest and second number in array
		int[] i = { 24, 768876, 45, 1 };
	
		int temp;

		for (int a = 0; a < i.length; a++) {
			for (int n = a + 1; n < i.length; n++) {
				if (i[a] > i[n]) {
					temp = i[a];
					i[a] = i[n];
					i[n] = temp;

				}
			}

		}
		System.out.println("First Largest:" + i[i.length - 1]);
		System.out.println("Second Largest:" + i[i.length - 2]);

	  Arrays.sort(i);
	  System.out.println("First Largest:" + i[i.length - 1]);
	  System.out.println("Second Largest:" + i[i.length - 2]);

	  
		
		
	}

}
