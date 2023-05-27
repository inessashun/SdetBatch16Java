package ReplitTasks.ReplitTask;

import java.util.Scanner;

public class Task36 {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);

        System.out.println("Please enter two strings");
        String word1=scan.nextLine();
        String word2=scan.nextLine();

        System.out.println("Please enter two numbers");
        int num1=scan.nextInt();
        int num2=scan.nextInt();

        if(word1.equals(word2) && num1==num2){
            System.out.println("AND");
        }else if(word1.equals(word2) || num1==num2){
            System.out.println("OR");
        }else if(!word1.equals(word2) && num1!=num2){
            System.out.println("NONE");

        }
    }

}
