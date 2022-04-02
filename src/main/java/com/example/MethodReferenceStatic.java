package javaeleven;


interface Sayable{  
    void say();  
}  
public class MethodReferenceStatic {  
    public static void saySomething(){  
        System.out.println("Hello, this is static method.");  
    }  
    public static void main(String[] args) {  
        // Referring static method  
        Sayable sayable = MethodReferenceStatic::saySomething;  
        // Calling interface method  
        sayable.say();  
    }  
} 