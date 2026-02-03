package javalab.oop.classes;

public class Friend {
    String name;
    static int numberOfFriends;

    Friend(String name) {
        this.name = name;
        numberOfFriends++;
    }

    static void showFriends() {
        System.out.printf("You have %d friends.", numberOfFriends);
    }
}
