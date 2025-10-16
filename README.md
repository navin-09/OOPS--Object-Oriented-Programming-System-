# Object_Oriented_Programming.

this repo consists of Concepts of OOPS.

# The Four Pillars of OOP

| **Pillar**            | **Definition**                                                                                                                        | **Purpose / Goal**                                        | **Keyword / Concept**                     | **Example (Java)**                                                                                                       | **Real-World Analogy**                                          |
| --------------------- | ------------------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------- | ----------------------------------------- | ------------------------------------------------------------------------------------------------------------------------ | --------------------------------------------------------------- |
| **1️⃣ Encapsulation** | Wrapping **data (variables)** and **methods (functions)** into a single unit (class), and restricting direct access to internal data. | Protect data, maintain control, ensure security.          | `private`, `public`, `getter`, `setter`   | `java\nclass BankAccount {\n  private double balance;\n  public void deposit(double amount) { balance += amount; }\n}\n` | A capsule hides medicine inside — only controlled access.       |
| **2️⃣ Abstraction**   | Showing **only essential details**, hiding the complex internal logic.                                                                | Simplify interaction, reduce complexity.                  | `abstract class`, `interface`             | `java\nabstract class Payment {\n  abstract void pay();\n}\n`                                                            | Driving a car — you use the steering, not the engine mechanism. |
| **3️⃣ Inheritance**   | One class acquires the **properties and behavior** of another.                                                                        | Promote code reuse and create hierarchical relationships. | `extends`, `super`                        | `java\nclass Car extends Vehicle {}\n`                                                                                   | A child inherits traits from parents.                           |
| **4️⃣ Polymorphism**  | One interface, many forms — same method behaves differently based on object type.                                                     | Increases flexibility, enables dynamic behavior.          | `method overriding`, `method overloading` | `java\nAnimal a = new Dog();\na.makeSound(); // Bark\n`                                                                  | A person behaves differently as a student, friend, or employee. |



# acccess modifiers

| **Modifier**           | **Within Class** | **Same Package** | **Subclass (diff pkg)** | **Other Packages**       |
| ---------------------- | ---------------- | ---------------- | ----------------------- | ------------------------ |
| `public`               | ✅                | ✅                | ✅                       | ✅                        |
| `protected`            | ✅                | ✅                | ✅                       | ❌ (only via inheritance) |
| *default* (no keyword) | ✅                | ✅                | ❌                       | ❌                        |
| `private`              | ✅                | ❌                | ❌                       | ❌                        |



# class objects constructors.

| Concept         | Description                             | Real-Life Analogy                      |
| --------------- | --------------------------------------- | -------------------------------------- |
| **Class**       | Blueprint / template defining structure | Blueprint of a car                     |
| **Object**      | Real instance of a class                | Actual car built from blueprint        |
| **Constructor** | Initializes new objects                 | The team assembling the car when built |


# contstrutor 

| **Feature**                 | **Description**                                              |
| --------------------------- | ------------------------------------------------------------ |
| **Same name as the class**  | Constructor name must match the class name                   |
| **No return type**          | Not even `void`                                              |
| **Called automatically**    | When you use `new`                                           |
| **Used for initialization** | Sets up initial state for object                             |
| **Can be overloaded**       | You can have multiple constructors with different parameters |

# default constructor

| **Scenario**                                           | **Compiler Adds Default Constructor?** | **What It Does**                        |
| ------------------------------------------------------ | -------------------------------------- | --------------------------------------- |
| No constructor defined                                 | ✅ Yes                                  | Calls `super()` and sets default values |
| You define a parameterized constructor                 | ❌ No                                   | You must add one manually if needed     |
| You define a no-arg constructor                        | ❌ No need                              | Your version replaces compiler’s        |
| Inheritance with no constructor in parent              | ✅ Yes (parent gets one)                | Calls `super()`                         |
| Inheritance with parameterized parent constructor only | ❌ No                                   | Must explicitly call `super(args)`      |


# Inheritance

| **Member Type**             | **Inherited?** | **Notes**                                         |
| --------------------------- | -------------- | ------------------------------------------------- |
| `public` fields/methods     | ✅ Yes          | Fully accessible                                  |
| `protected` fields/methods  | ✅ Yes          | Accessible in child and subclasses                |
| *default* (package-private) | ✅ Yes          | Only if in same package                           |
| `private` fields/methods    | ❌ No           | Hidden from child                                 |
| Constructors                | ❌ No           | Not inherited (but can be called using `super()`) |


| **Type**         | **Structure**                            | **Example**                                 | **Supported in Java?**                 |
| ---------------- | ---------------------------------------- | ------------------------------------------- | -------------------------------------- |
| **Single**       | One class extends another                | `Car extends Vehicle`                       | ✅                                      |
| **Multilevel**   | Chain of inheritance                     | `ElectricCar extends Car extends Vehicle`   | ✅                                      |
| **Hierarchical** | Multiple children share one parent       | `Car`, `Bike`, `Truck` all extend `Vehicle` | ✅                                      |
| **Multiple**     | One class inherits from multiple parents | `class C extends A, B`                      | ❌ (not allowed directly)               |
| **Hybrid**       | Combination of multiple forms            | Mix of above types                          | ❌ (partially supported via interfaces) |


# Polymorphism

Polymorphism means “one interface, many implementations.”

In Java, polymorphism allows one object reference (usually of a parent type) to represent different forms (subclasses) at runtime.
# types of Polymorphism

| **Type**                      | **When it Happens** | **How it’s Achieved**  | **Example**                                 |
| ----------------------------- | ------------------- | ---------------------- | ------------------------------------------- |
| **Compile-time Polymorphism** | During compilation  | Method **Overloading** | Same method name, different parameters      |
| **Runtime Polymorphism**      | During execution    | Method **Overriding**  | Parent reference calls child implementation |

| **Aspect**                | **Description**                                                | **Example**                                          |
| ------------------------- | -------------------------------------------------------------- | ---------------------------------------------------- |
| **Definition**            | Ability of one interface to represent multiple implementations | `Animal a = new Dog();`                              |
| **Compile-time (static)** | Method overloading                                             | `add(int,int)` vs `add(double,double)`               |
| **Runtime (dynamic)**     | Method overriding                                              | `Animal.makeSound()` overridden by `Dog.makeSound()` |
| **Resolved at**           | Compile-time / Runtime                                         | Compiler / JVM                                       |
| **Keywords used**         | `@Override`, `super`, `abstract`                               | —                                                    |
| **Main advantage**        | Flexibility and code reusability                               | Write general code that works for many subclasses    |
| **How it works**          | JVM picks correct method using object’s type (vtable)          | —                                                    |
| **Limitation**            | Can’t override `static`, `final`, or `private` methods         | —                                                    |
| **Common use**            | Strategy pattern, Factory pattern                              | Behavior changes dynamically                         |


# Interfaces.

| **Feature**                                    | **Description**                             |
| ---------------------------------------------- | ------------------------------------------- |
| **All methods are abstract by default**        | You only declare, not define (until Java 8) |
| **All fields are public, static, and final**   | Constants only                              |
| **Supports multiple inheritance**              | A class can implement multiple interfaces   |
| **Cannot have constructors**                   | Interfaces cannot create objects            |
| **Used to achieve abstraction + polymorphism** | Enables flexible design                     |

| **Feature**     | **Abstract Class**                   | **Interface**                        |
| --------------- | ------------------------------------ | ------------------------------------ |
| **Methods**     | Can have abstract + concrete methods | Abstract (default + static allowed)  |
| **Fields**      | Can have instance variables          | Only `public static final` constants |
| **Constructor** | Can have                             | Cannot have                          |
| **Inheritance** | Single                               | Multiple allowed                     |
| **Use Case**    | When classes share behavior + state  | When classes share behavior only     |
| **Keyword**     | `extends`                            | `implements`                         |
