package class4IfElseScanner;

import java.util.Scanner;

public class E6ScannerIfElseName {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Please Enter your name");
        String name=scanner.next();

        if(name.equals("Elena")){
            System.out.println("Mac user");
        }else{
            System.out.println("Windows user");
        }
    }
}
