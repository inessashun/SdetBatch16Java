package class16;

public class DogTester {
    public static void main(String[] args) {
        Dog dog1=new Dog();
        dog1.name="Jacky";
        dog1.breed="German";
        dog1.color="Black";


        Dog dog2=new Dog();
        dog2.name="Rocky";
        dog2.breed="England";
        dog2.color="Rudy";

        dog2.printInfo();

        Dog.age=20;
        Dog.printInfo2();
        dog1.age=30;



    }
}
