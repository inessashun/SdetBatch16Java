package class21;

class Animal {
    String name;
    String color;
    String breed;

    public Animal(String name, String color, String breed) {
        this.name = name;
        this.color = color;
        this.breed = breed;
    }

    void printInfo() {
        System.out.println(name + " " + color + " " + breed);
    }

    void speak() {
        System.out.println("Animals speak");
    }

    void sleep() {
        System.out.println("Animals sleep from 1 to 20 hours a day");
    }

    void eat(){
        System.out.println("Animals eat many different things ");
    }
}
public class Dog extends Animal{

    public Dog(String name, String color, String breed) {

        super(name, color, breed);
    }
    @Override
    void speak(){
        System.out.println("bark bark");
    }
    @Override
    void sleep(){
        System.out.println("Sleeping 10 hours");
    }
    @Override
    void eat(){
        System.out.println("eating meats");
    }
}
class Cat extends Animal{

    public Cat(String name, String color, String breed) {

        super(name, color, breed);
    }
    @Override
    void speak(){
        System.out.println("Meow");
    }
    @Override
    void sleep(){
        System.out.println("Sleep 15 hours");
    }
    @Override
    void eat(){
        System.out.println("eat fish");
    }
}
class Horse extends Animal{

    public Horse(String name, String color, String breed) {

        super(name, color, breed);
    }
    @Override
    void speak(){
        System.out.println("Pffff");
    }
    @Override
    void sleep(){
        System.out.println("Sleeping for 2-3 hours");
    }

    void run(){
        System.out.println("Can run fast");
    }
    @Override
    void eat(){
        System.out.println("eating brass");
    }
}
class AnimalTester{
    public static void main(String[] args) {
        Dog dog=new Dog("shaggy","black","German");
        dog.printInfo();
        //Parent class variables can store the objects of the child classes
        Animal dog1=new Dog("shaggy","black","German");
        dog1.printInfo();

        Animal [] animals= {new Dog("Shaggy", "Black", "German"), new Dog("Tom", "Blue", "Persian")};
        for(Animal animal:animals){
            animal.printInfo();
        }
    }
}
