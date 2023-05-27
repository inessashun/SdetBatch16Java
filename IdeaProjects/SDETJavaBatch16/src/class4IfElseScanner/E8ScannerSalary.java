package class4IfElseScanner;

import java.util.Scanner;

public class E8ScannerSalary {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Please Enter your salary");
        //for int type data we should be using nextInt() method
        int salary=scanner.nextInt();

        if(salary>100000){
            System.out.println("You are rich");
        }else {
            System.out.println("Look for better opportunity");
        }
    }
}
