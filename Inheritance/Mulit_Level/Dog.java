package Inheritance.Mulit_Level;

public class Dog extends Mammal {
    public Dog() {
        System.out.println("Dog created");
    }

    @Override
    void eat() {
        super.eat();
        System.out.println("Dog eats bones.");
    }
}
