// Name: Deepak Kumar | Roll No: 2410303156 | Student ID: BCS2024358 | Assignment 10
public class Main {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.sound();
    }
}

class Animal {
    void sound() {
        System.out.println("Some sound");
    }
}

class Dog extends Animal {
}
