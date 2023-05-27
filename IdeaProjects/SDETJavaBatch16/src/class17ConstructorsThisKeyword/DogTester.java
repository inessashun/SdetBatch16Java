package class17ConstructorsThisKeyword;

public class DogTester {
    //create 3-5 objects of this dog class provide initial values
    // and for each object call the printInf method

    /* ******* MINE (1 object) *********
    public static void main(String[] args) {
        Dog obj=new Dog();
        obj.name="Max";
        obj.color="White";
        obj.breed="German";
        obj.age=10;
        obj.printInfo();
    }*/
    // *********From class explanation *****
    public static void main(String[] args) {
        /*Dog dog1 = new Dog();
        Dog dog2 = new Dog();
        Dog dog3 = new Dog();
        Dog dog4 = new Dog();
        Dog dog5 = new Dog();

        dog1.name = "Dog1";
        dog2.name = "Dog2";
        dog3.name = "Dog3";
        dog4.name = "Dog4";
        dog5.name = "Dog5";

        dog1.breed = "Breed1";
        dog2.breed = "Breed2";
        dog3.breed = "Breed3";
        dog4.breed = "Breed4";
        dog5.breed = "Breed5";

        dog1.color = "Brown";
        dog2.color = "Green";
        dog3.color = "White";
        dog4.color = "Black";
        dog5.color = "Grey";

        dog1.age = 5;
        dog2.age = 7;
        dog3.age = 6;
        dog4.age = 8;
        dog5.age = 9;

        dog1.printInfo();
        dog2.printInfo();
        dog3.printInfo();
        dog4.printInfo();
        dog5.printInfo();*/
        /*
        Below the code will create the object of the Dog class
        new Dog("Jack", "black","persian",12);
        new Dog()
         */
        Dog dog1=new Dog("Jack","black", "persian", 14);
        Dog dog2=new Dog("Puff","white", "German", 10);
        Dog dog3=new Dog("Max","rudy", "english", 12);
        dog1.printInfo();
        dog2.printInfo();
        dog3.printInfo();

    }
}
