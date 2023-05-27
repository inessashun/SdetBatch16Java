package class17ConstructorsThisKeyword;

import java.util.Scanner;

public class MethodTester {
    public Dog method1(){
        String str=new String();
        Scanner scan=new Scanner(System.in);
        Dog dog=new Dog("Jin","Dark Black", "Unknown", 30);
        return dog;
    }
}
