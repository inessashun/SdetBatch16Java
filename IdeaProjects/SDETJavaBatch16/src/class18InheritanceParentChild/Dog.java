package class18InheritanceParentChild;

public class Dog {
    String name;
    String color;
    String breed;
    int age;
    double weight;
    Dog (String name, String color, String breed){
        this.name=name;
        this.color=color;
        this.breed=breed;
    }
    Dog (String name, String color, String breed, int age, double weight) {
       /* this.name=name;
        this.color=color;
        this.breed=breed;
        this.age=age;
        //calling the constructor from the same class which takes name color
        //breed and age as parameters  */
        this(name, color, breed, age);
        this.weight = weight;
    }
        Dog(String name, String color, String breed, int age){
            //this(name,color,breed,age,12.5); => NEVER ever try to do this way!
        this.name = name;
        this.color = color;
        this.breed = breed;
        this.age = age;
       }

}
