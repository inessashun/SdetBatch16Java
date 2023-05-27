package class18InheritanceParentChild;

public class AnimalTester {
    /*
    create 3 classes of different animals like Cat, Dog, Zebra, Camel, Horse etc
    In each class create 5 fields and 3 Methods
     */
    public static void main(String[] args) {
        Horse horse=new Horse();
        horse.color="Black";
        System.out.println(horse.color="Black");
        horse.eat();

        Cat cat=new Cat();
        cat.name="Nano";
        cat.sleep();
        cat.speak();


    }
}
