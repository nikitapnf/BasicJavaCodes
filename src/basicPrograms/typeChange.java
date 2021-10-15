package basicPrograms;

public class typeChange {

	public static void main(String[] args) {
		// Using Wrapper class methods
		//int to string : toString(),  String to int: parseInt()
		String s="1100875";
		int i=Integer.parseInt(s);
		System.out.println("Integer is: " +i);
		
		int a=1008;
		String str=Integer.toString(a);
		System.out.println("The converted string: " +str);
		
		

	}

}
