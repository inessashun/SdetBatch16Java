package class17ConstructorsThisKeyword;

public class Person {
    String name;
    Person(){
        System.out.println("No argument Constructor");
    }
    Person(String personName){
        name=personName;
        System.out.println("1 Argument Constructor");
    }
}
