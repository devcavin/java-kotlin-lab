package javalab.oop.classes;

public class User {
    String name;
    String email;
    int age;

    // constructor overloading
    User(String name){
        this.name = name;
    }

    User(String name, String email) {
        this.name = name;
        this.email = email;
    }


    public User(String name, String email, int age) {
        this.name = name;
        this.email = email;
        this.age = age;
    }
}
