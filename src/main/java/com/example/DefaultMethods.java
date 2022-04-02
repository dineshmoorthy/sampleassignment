package javaeleven;

interface Rayable{  
    // Default method   
    default void say(){  
        System.out.println("Hello, this is default method");  
    }  
    // Abstract method  
    void sayMore(String msg);  
} 
public class DefaultMethods implements Rayable{  

	
	     
	        public void sayMore(String msg){        // implementing abstract method   
	            System.out.println(msg);  
	        }  
	        
			/*
			 * public void say() { System.out.println("overrided .... "); }
			 */
	        
	        public static void main(String[] args) {  
	            DefaultMethods dm = new DefaultMethods();  
	            dm.say();   // calling default method  
	            dm.sayMore("Work is worship");  // calling abstract method  
	      
	        }  
}
