package class15MethodsLocalInstanceStatic;

public class Dog {
    String name;
    String color;
    int age;
    static double weight;
    static int noLegs=4;
    static String planetName="Earth";

    public static void main(String[] args) {
        Dog dog=new Dog();
        dog.color="green";
        //dog.weight=20;

        Dog dog1=new Dog();
        //System.out.println(dog1.weigth);
        System.out.println(dog1.color);
    }
}
