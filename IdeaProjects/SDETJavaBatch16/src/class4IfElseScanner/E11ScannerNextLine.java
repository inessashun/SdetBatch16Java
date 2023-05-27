package class4IfElseScanner;

import java.util.Scanner;

public class E11ScannerNextLine {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        /*
        if we want to take a complete line from the user we
        should use nextLine method
         */
        String sentence=scanner.nextLine();
        System.out.println(sentence);

    }
}
