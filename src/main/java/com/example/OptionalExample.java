package javaeleven;

import java.util.Optional;

public class OptionalExample {

	public static void main(String[] args) {
		 String[] str = new String[10];  
	        str[0] = "di";
	        str[1] = "ne";
	        str[2] = "sh";
	        str[3] = "da";
	        str[4] = "ks";
	       // str[5] = "hi";
	        str[6] = "na";
	        Optional<String> checkNull = Optional.ofNullable(str[5]);  
	        if(checkNull.isPresent()){  // check for value is present or not  
	            String lowercaseString = str[5].toLowerCase();  
	            System.out.print(lowercaseString);  
	        }else  
	            System.out.println("string value is not present");  
	}
}
