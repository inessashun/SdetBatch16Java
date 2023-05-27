package class4IfElseScanner;

import java.util.Scanner;

public class E9ScannerTrueFalse {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Are you hungry enter True/False");
        boolean hungry=scanner.nextBoolean();

        if(hungry){
            System.out.println("Lets take a Lunch");
        }else {
            System.out.println("Continue to study");
        }
    }
}
