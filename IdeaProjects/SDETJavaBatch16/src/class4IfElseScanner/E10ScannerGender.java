package class4IfElseScanner;

import java.util.Scanner;

public class E10ScannerGender {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        /*
        There is no direct method for the char datatype in scanner class
        we use a workaround we use first use the next method to take
        a String from the user and from that String we extract the first
        letter by passing 0 to the charAt() method
         */
        System.out.println("Please, enter the gender");
        char gender=scanner.next().charAt(0); //female => f=0/ e=1/ m=2/ =3/ l=4/ e=5
        System.out.println("you entered "+gender);

    }
}
