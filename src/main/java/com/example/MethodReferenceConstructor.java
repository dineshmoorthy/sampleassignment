package javaeleven;

import java.util.Optional;

interface Translate{
	public void saynumber();
}

class Four{
	Four(){
		System.out.println("4");
	}
}
public class MethodReferenceConstructor {
	

	public static void main(String[] args) {  
		
			Translate trans = Four::new;
		  trans.saynumber(); 
		 
       
    }  
	
}
