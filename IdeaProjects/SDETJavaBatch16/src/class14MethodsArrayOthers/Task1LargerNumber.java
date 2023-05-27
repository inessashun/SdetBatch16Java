package class14MethodsArrayOthers;

public class Task1LargerNumber {
    /*
    Create a method that will take 2 parameters as a numbers and prints
    which number is larger.
     */
    void printLarger(int a, int b) {
        if (a > b) {
            System.out.println(a);
        } else {
            System.out.println(b);
        }

    }
    public static void main(String[] args) {
        Task1LargerNumber obj = new Task1LargerNumber();
        obj.printLarger(4, 12);

    }
}