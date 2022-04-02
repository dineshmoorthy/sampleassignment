package javaeleven;


interface Mayable{  
    void say();  
}  
public class MethodReferenceInstance {
	public  void saySomething(){  
        System.out.println("Hello, this is static method.");
    }
	
	 
public static void main(String[] args) {
	MethodReferenceInstance methodReference = new MethodReferenceInstance();
	
	 // Referring non-static method using reference  
    Mayable mayable = methodReference::saySomething;  
    mayable.say();
    
	}
}
