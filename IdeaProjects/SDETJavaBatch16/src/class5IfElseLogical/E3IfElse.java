package class5IfElseLogical;

import java.util.Scanner;

public class E3IfElse {
    public static void main(String[] args) {
        /*
        Ask the user for the age and based on the value of age
        write an if-else condition if age is <18 print you can't drive
        otherwise we have to print you can drive
         */
        Scanner scan=new Scanner(System.in);
        System.out.println("What is your age?");
        int age=scan.nextInt();
        if(age<18){ //15<18
            System.out.println("You can't drive");
        }else{
            System.out.println("You can drive");
        }

    }
}
