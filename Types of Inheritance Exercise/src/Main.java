// Question-1
//Suppose you have a class Animal with a method sound(), and a class Dog that inherits from Animal.
//How would you override the sound() method in the Dog class?


// single level Inheritance or single Inheritance
// class Animal {
//
//    public void sound(){
//        System.out.println("Making sound >>>>>>>>>>>>>>>>>>>");
//    }
// }
//
// class Dog extends Animal{
//    public void sound(){
//        System.out.println("Dog is Barking >>>>>>>>>>>>>>>>>>>>>>");
//    }
// }
//
//public class Main {
//    public static void main(String[] args) {
//
//        Dog d = new Dog();
//
//        d.sound();
//
//    }
//}


// Question-2
//Create a class Vehicle with a method start().
//Create a subclass Car that extends Vehicle, and then create another subclass ElectricCar that extends Car.
//Override the start() method in ElectricCar.
//Provide the code and explain how the method overriding works in this scenario.

//class Vehicle{
//
//    public void start(){
//        System.out.println("The Vehicle engine is gonna start.");
//    }
//}
//
//class Car extends Vehicle{
//
//}
//
//class ElectricCar extends Car{
//    public void start(){
//        System.out.println("The Electric Engine is Gonna Start.");
//    }
//}
//
//public class Main{
//    public static void main(String[] args) {
//
//        ElectricCar lamborghini = new ElectricCar();
//
//        lamborghini.start();
//    }
//}


// Question-3
//Create a class Shape with a method draw(). Create two subclasses Circle and Rectangle that extend Shape.
//Override the draw() method in both subclasses to provide specific implementations.

class Shape{
    public void draw(){
        System.out.println("I am drawing in the Shape class or superclass.");
    }
}

class Circle extends Shape{
    public void draw(){
        System.out.println("I am drawing in the Circle class.");
    }
}

class Rectangle extends Shape{
    public void draw(){
        System.out.println("I am drawing in the Rectangle class.");
    }
}
public class Main{
    public static void main(String[] args) {

        // Overriding the Shape class or Superclass.
        Circle c  = new Circle();
        c.draw();

        // Overriding the Shape class or Superclass.
        Rectangle r = new Rectangle();
        r.draw();
    }
}