package javalab.oop.classes;

public class MethodOverride {
    public static void main(String[] args) {
        Parent parent = new Parent();
        Parent child = new Child();

        parent.info();
        child.info();

        parent.display();
        child.display();
    }
}
