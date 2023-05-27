package class14MethodsArrayOthers;

public class E1MethodPrinter{
    void printWord(String word){
    /*!! VOID can be replaced with any
        primitive and non-primitive Data Types */
    //all primitive and non-primitive data types can use RETURN METHOD

        System.out.println(word);
    }
    /*
    - void => is return type of the Method void means this method does not return
    any data other example of return types can be String int boolean char Dog Cat etc.
    - printWord => it's the name of the method
    - (String word) => parameters/input
    - { System.out.println(word); } => body of the method,
      you can write IF ELSE conditions or LOOPS inside this parameter or any other Methods
     */
    public static void main(String[] args) {
        /*
        - we are creating an object of the E1Methods class
        - in Java all the classes can be treated as Data Types
        - new E1MethodsPrinter() => creating the object of the E1MethodsPrinter class
         */
        E1MethodPrinter obj = new E1MethodPrinter();
        obj.printWord("Java");
        /*
        - we are calling the printWord() - method on obj - object
          and passing "java" as argument or input
        */
    }
}
