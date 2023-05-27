package class4IfElseScanner;

public class HW3IfStatement {
    public static void main(String[] args) {
        /*
Create Java program to store 2 values for expected and actual hours.
Your program should check
if expected hours are more than  actual the program should print
“You will love the course and you will succeed”,
otherwise “Course will be very hard for you!
 */
        int expected=20;
        int actual=5;

        if(expected>actual){
            System.out.println("You will love the course and you will succeed");
        }else {
            System.out.println("Course will be very hard for you!");
        }
    }
}
