package class20MethodOverriding;

public class Animal {
    /*
    Below we have fields/properties/instatnce variables
     */

    String name;
    String color;
    int age;
    Animal(String name, String color, int age){
        this.name=name;
        this.color=color;
        this.age=age;
    }
    void eat(){
        System.out.println("Eating");
    }
    void sleep(){    //=> parent class
        System.out.println("ZZZzzzz");
    }

    void speak(){
        System.out.println("Speaking");
    }
}
class Dog extends Animal{
    Dog (String name, String color, int age){
        super(name, color,age);
    }
          //=> child class
    @Override //=> here optional only for informational purpose here
    void sleep() {  //void sleep(int number) => if you add creating new method in parameters
        System.out.println("Sleep 10.6 hours a day");

    }
}
class Cat extends Animal{
    Cat (String name, String color, int age){
        super(name, color,age);
    }
}
class Horse extends Animal{
    Horse (String name, String color, int age){
        super(name, color,age);
    }
}