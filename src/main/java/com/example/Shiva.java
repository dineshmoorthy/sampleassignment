package javaeleven;

interface Girl{
	public void call();
}
public class Shiva {

	public static void item() {
		System.out.println("called 1 hour arrive");
	}

	public static void main(String[] args) {
		Girl girl = Shiva::item;
		girl.call();
	}
}
