package class4IfElseScanner;

import java.util.Scanner;

public class E7ScannerIfElseIfName {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Please Enter your name");
        String name=scanner.next();

        if(name.equals("Elena")){
            System.out.println("Mac user");
        }else if(name.equals("Safyan")){
            System.out.println("Naughty");
        }else if(name.equals("Halima")){
            System.out.println("Best");
        }
    }
}
