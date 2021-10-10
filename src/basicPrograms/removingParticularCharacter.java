package basicPrograms;

public class removingParticularCharacter {
	public static void main(String[] args) {
       String str="I am the Nikita ";
       char ch='t'; int counter=0;
       int j;
       char[] carr= str.toCharArray();
       for(int i=j=0;i<str.length();i++ ) {
    	  
    	   if(carr[i]!=ch) {
    		   carr[j++]=carr[i];}
    		 else    
    		   { counter++;}

    	   }
    	   while(counter>0)
    	   {
    		  carr[j++]='\0';
    		  counter--;
    	   }
    		   
    	   System.out.println(carr);

       }
}

	


