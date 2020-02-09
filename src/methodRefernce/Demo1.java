package methodRefernce;

interface Sayable{  
    void say();  
}  
public class Demo1 {  
    public static void saySomething(){  
        System.out.println("Hello, this is static method.");  
    }  
    public static void main(String[] args) {  
        // Referring static method  
        Sayable sayable = Demo1::saySomething;  
        // Calling interface method  
        sayable.say();  
    }  
}