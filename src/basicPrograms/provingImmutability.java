package basicPrograms;

public class provingImmutability {

	public static void main(String[] args) {
		// Change values--> compare--> and check what message is displayed
        String s1= "NIKITA";
        String s2= "NIKITA";
        System.out.println("Before changing s2");
        if(s1==s2)
        {System.out.println("referring same location");}
        else System.out.println("Referring different locations");
        
        System.out.println("Before changing s2");
        s2=s2.concat("Nainwal");
        if(s1==s2)
        {System.out.println("referring same location");}
        else System.out.println("Referring different locations");

        
        
        
	}

}
