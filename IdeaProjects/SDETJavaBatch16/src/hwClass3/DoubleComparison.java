package hwClass3;

        /*1)Create a Java program and name it Double Comparison.
        Declare 2 double values and if value of first variable is higher
        than the second, print “Double value  is larger than  .” Otherwise print
        */
public class DoubleComparison {

    public static void main(String[] args) {

        double firstNumber=100.587;
        double secondNumber=88.548;
        if (firstNumber>secondNumber) {
            System.out.println("Double value " + firstNumber + " is larger than " + secondNumber);
        }else{
            System.out.println("Double value " + secondNumber + " is larger than " +firstNumber );
        }
    }
}
