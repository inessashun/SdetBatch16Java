package hwClass3;
        /*3) Create Java program to store 2 values for expected and actual hours.
        Your program should check if expected hours are more than  actual the
        program should print “You will love the course and you will succeed”,
        otherwise “Course will be very hard for you!”*/
public class TwoValues {
    public static void main(String[] args) {
        int expectedHours=20;
        int actualHours=5;
        if(expectedHours>actualHours){
            System.out.println("You will love the course and you will succeed");
        }else{
            System.out.println("Course will be very hard for you!");
        }
    }
}
