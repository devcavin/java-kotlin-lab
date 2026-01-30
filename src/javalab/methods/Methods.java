package javalab.methods;

public class Methods {
    public static void main(String[] args) {
        /*
        A method is a block of reusable code
         */

        // calling the method
        method1();
        method2();
        String sayHelloMethod = sayHello(); // this has a return type
        System.out.println(sayHelloMethod);

        int addMethod = add(8, 9);
        System.out.printf("The result of the add method is: %d\n", addMethod);
    }

    // methods with no return values
    static void method1(){
        System.out.println("Hello from method1!");
    }
    static void method2(){
        System.out.println("Hello from method2!");
    }

    // methods with return values
    static String sayHello(){
        return "Hello there!";
    }

    // method with parameters
    public static int add(int a, int b){
        return a+b;
    }
}
