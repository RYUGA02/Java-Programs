//Question -->  Create a class hierarchy with a base class Animal and derived classes Dog and Cat.
//Implement a method makeSound() in each class that prints the sound the animal makes.
//Demonstrate dynamic method dispatch by creating an Animal reference that points to both Dog and Cat objects and calls the makeSound() method.

class Animal{
    public void makeSound(){
        System.out.println("Printing the sound that animal makes!");
    }
}
class Dog extends Animal{
    public void makeSound(){
        System.out.println("Dog Barks");
    }
}
class Cat extends Animal{
    public void makeSound(){
        System.out.println("Cat Meows");
    }
}

public class Main {
    public static void main(String[] args) {

        Animal obj = new Dog();
        Animal obj2 = new Cat();

        obj.makeSound();
        obj2.makeSound();
    }
}