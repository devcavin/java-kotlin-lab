package javalab.oop.classes;

public class UserObject {
    public static void main(String[] args) {
        User user1 = new User("John");
        System.out.println(user1.name);

        User user2 = new User("Dave", "dave@test.domain" /*, 10*/);
        System.out.printf("My name is %s, and my email is %s", user2.name, user2.email);

        User user3 = new User("Chris", "chris@gmail.com", 16);
        System.out.printf("My name is %s, I am %d years old and my email is %s", user3.name, user3.age, user3.email);
    }
}
