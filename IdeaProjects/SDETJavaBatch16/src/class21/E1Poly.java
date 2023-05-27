package class21;

public class E1Poly {
    public static void main(String[] args) {

        Animal[] animals = { new Dog("Jack", "black", "German"),
                new Cat("Tom", "blue", "Persian"),
                new Horse("Spirit", "brown", "Arabian Horse")
        };

        for (Animal animal : animals) {
            //animal.run();
            animal.eat();
            animal.sleep();
            animal.speak();
        }
        Animal animal=new Dog("Kantoor", "Black", "German");
        //we must type cast the animal back to a dog to call the run method
        //as this run method only exists in the Dog class
        Dog d=(Dog) animal;
       /* d.run();
        //direct way without using a variable
        ((Dog)animal).run();*/

        int num= (int)10.5;
    }
}

