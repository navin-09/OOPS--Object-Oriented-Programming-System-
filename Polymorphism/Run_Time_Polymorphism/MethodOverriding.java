package Polymorphism.Run_Time_Polymorphism;

public class MethodOverriding {
    void makeSound() {
        System.out.println("Some generic animal sound");
    }
}


class Dog extends MethodOverriding {
    @Override
    void makeSound() {
        System.out.println("Bark");
    }
}

class Cat extends MethodOverriding {
    @Override
    void makeSound() {
        System.out.println("Meow");
    }
}
