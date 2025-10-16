package Inheritance.Mulit_Level;

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog();  // Constructor chaining
        dog.walk();           // From Mammal
        dog.eat();            // Overridden in Dog
    }
}
