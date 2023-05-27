package class8WhileNestedLoop;

import java.util.Scanner;

public class E2WhileLoopTwoScan {
    public static void main(String[] args) {
        //in a while loop ask a user to enter a numbers and if user enters any number
        // other than -1 print "Try again" and keep asking the user for a number
        // the moment user enters the number -1 the loop should stop

        System.out.println("Please enter any number other than -1");
        Scanner scan=new Scanner(System.in);
        int num=scan.nextInt();    //1st user input

        while(num!=-1){
            System.out.println("Try again, enter the number");
            num=scan.nextInt(); //2nd user input  //next number from user
        }
    }
}
