package javalab.methods;

import java.util.Date;

public class OverloadedMethods {
    public static void main(String[] args) {
        /*
        Overloaded methods: methods that share the same name but different parameters
        Signature = name + parameters
         */
        System.out.println(add(2, 8));
        System.out.println(add(7, 12, 6));
    }

    static int add(int a, int b){
        return a + b;
    }

    static int add(int x, int y, int z){
        return x + y + z;
    }
}
