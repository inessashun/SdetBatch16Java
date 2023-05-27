package class20MethodOverriding;

public class AnimalTester {
    public static void main(String[] args) {
        Dog dog=new Dog("Jam", "Brown", 10);
        Cat cat=new Cat("Tom", "White", 5);
        Horse horse=new Horse("Sun", "Rudy", 7);


        dog.sleep();
      /*  dog.eat();
        dog.speak();

        cat.eat();
        cat.sleep();
        cat.speak();

        horse.eat();
        horse.sleep();
        horse.speak();*/
    }
}