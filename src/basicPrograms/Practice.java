package basicPrograms;

class A {

  A() {

		System.out.println("in parent constructor");

  }

	public void run() {

		System.out.println("Parent class");

	}

}

class Practice extends A{
	Practice(){
				
		System.out.println("in child constructor");
	}
	Practice(int i){
		super();
		
		System.out.println("in child constructor");
	}

  
	public void run() {

		System.out.println("child class");}
	
	public void display(String... values) {
		
		for(String s:values) {
		System.out.print(s);
		}		
	}
	
	

	public void stay() {

		System.out.println("child class stay");}
		public static void main(String args[]) {
		
			Practice b= new Practice();
			//A a= new Practice();
		    b.run();
		   // a.run();
		    b.display("I" ,"\s", "am","\s", "me");
		    
		    
		    		}

	}
	


