package class13MethodsStringOther;

public class MethodTester {
    public static void main(String[] args) {
        E9MethodsPrintWord obj=new E9MethodsPrintWord();
        obj.printSomething(); // 4
        obj.printSomething(); // 4 - second line to print it twice

        obj.printWord("Java");
        obj.printWord("Artem");

        obj.printWordManyTimes("Java class",5); //to print words 5 times lines


    }
}
