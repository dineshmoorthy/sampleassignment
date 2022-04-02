package javaeleven;

@FunctionalInterface
interface Water {
	public void taste();
}
public class FunctionalTry implements Water{

	public void taste() {
		System.out.println("Damn taste");
		
	}
	
	public static void main(String[] args) {
		FunctionalTry st = new FunctionalTry();
		st.taste();
	}
	
}
