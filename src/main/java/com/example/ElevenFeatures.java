package javaeleven;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
public class ElevenFeatures {
    public static void main(String[] args)
    {
    	
    	 String str = "JD\nJD\nJD"; 
         System.out.println(str);
         System.out.println(str.lines().collect(Collectors.toList()));
         
         System.out.println(" ".isBlank()); //true
         
         String s = "Anupam";
         System.out.println(s.isBlank()); //false
         String s1 = "";
         System.out.println(s1.isBlank()); //true
         
         
         String strr = " JD "; 
         System.out.print("Start");
         System.out.print(strr.strip());
         System.out.println("End");
         
         System.out.print("Start");
         System.out.print(str.stripLeading());
         System.out.println("End");
         
         System.out.print("Start");
         System.out.print(str.stripTrailing());
         System.out.println("End");
         
         String stir = "=".repeat(2);
         System.out.println(stir); //prints ==
         
    	String multilineString = "Baeldung helps \n \n developers \n explore Java.";
    	List<String> lines = multilineString.lines()
    	  .filter(line -> !line.isBlank())
    	  .map(String::strip)
    	  .collect(Collectors.toList());
    	System.out.println(lines);
    	
    	Path path;
		try {
			path = Files.writeString(Files.createTempFile("test", ".txt"), "This was posted on JD");
		
    	System.out.println(path);
    	String ss = Files.readString(path);
    	System.out.println(ss); //This was posted on JD
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
        List<String> sampleList = Arrays.asList("Java", "\n \n", "Kotlin", " ");
        List withoutBlanks = sampleList.stream()
          .filter(Predicate.not(String::isBlank))
          .collect(Collectors.toList());
        System.out.println(withoutBlanks);
        
        List sampleListTwo = Arrays.asList("Java", "Kotlin");
        String[] sampleArray = (String[]) sampleListTwo.toArray(String[]::new);
        System.out.println(sampleArray);
        
        
        
        // Local-Variable Syntax for Lambda Parameters
        List<String> sampleListthree = Arrays.asList("Java", "Kotlin");
        String resultString = sampleListthree.stream()
      //    .map((@Nonnull var x) -> x.toUpperCase())
          .collect(Collectors.joining(", "));
        System.out.println(resultString);
        
    }
}