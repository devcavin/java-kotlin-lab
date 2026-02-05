package javalab.oop.classes;

public class WrapperClasses {
    // this allows primitives to be used as objects
    public static void main(String[] args) {

        // Autoboxing: primitive → wrapper object
        Integer a = 23;
        Double b = 23.2;
        Float c = 23.2f;
        Character d = '$';
        Boolean e = true;

        // Unboxing: wrapper → primitive
        boolean f = e;

        String g = "Hello";
        char h = g.charAt(0);
    }
}
