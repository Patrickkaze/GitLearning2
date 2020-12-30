package gitlearning;


public class GitLearning2 {
	
	
	int a; // non static
	
	static int b; // static
	
	static void m1() {
		
		
		System.out.println("This is m1 - Static Method");
		
	}
		
		void m2() { // NOT STATIC  METHOD
			
			
			System.out.println("This is m2 - Non Static Method");
			
		}	
		
		

//3) Not Static methods can access everything (non static & static).

		void m3() { // NON STATIC METHOD
			
			
			a= 500; // NON STATIC VARIABLE
			
			b= 800; //  NON STATIC VARIABLE
			
			m1();
			m2();
			
			
			System.out.println("This is m2 - Non Static Method");
			
		}		


     public static void main(String[] args) { // static method 
    	 
    	 
   // 1) Static method can access only static stuff (stuff means static variables and methods). 
    	 
    	 b=100;
    	 
    	 System.out.println(b);
    	 
    	 m1();
    	 
    	 
    	//a=200;  // not accessible, bcoz it is non static variable
    	 
    	// m2(); //  not accessible, bcoz it is non static Method.
  
    	 
   // 2) Static method can access non static stuff (stuff means static variables and methods) through object.

    	 
    	 GitLearning2 ne = new GitLearning2 (); // object declaration
    	 
    	 ne.a = 200;
    	 
    	 ne.m2();
    	 
    	 System.out.println(ne.a);
    	 