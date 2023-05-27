package class12StringMethods;

public class DogTester {
    public static void main(String[] args) {

        Dog actualDog=new Dog();
        actualDog.name="Jacky";
        actualDog.age=15;
        actualDog.breed="German";
        actualDog.color="Black";
        actualDog.weight=50;

        actualDog.bark();
        actualDog.eat();
        actualDog.sleep();

        Dog newDog=new Dog();
        newDog.name="Rocky";
        newDog.age=7;
        newDog.breed="England";
        newDog.color="Rudy";
        newDog.weight=25;
        newDog.isFat=false;

        newDog.bark();
        newDog.eat();
        newDog.sleep();



    }
}
