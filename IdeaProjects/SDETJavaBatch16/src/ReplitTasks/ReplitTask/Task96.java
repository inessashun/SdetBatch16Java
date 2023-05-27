package ReplitTasks.ReplitTask;

import java.util.Scanner;

public class Task96 {
    public static void main(String[] args) {
        /*
        **For you to do:**
        You have Scanner class to input string value.
        If language is Java it should print the:
        "Java is a programming language".
        If language is C it should print the:
        "C is a procedural programming language"
        If language is C++ it should print the:
        "C++ is a middle-level programming language"
        If any other should print:
        "Doesn't match any programming language"
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any programming language");
        String lang = sc.nextLine();


        if(lang.equals("Java")){
            System.out.println(lang+" is a programming language");
        }else if(lang.equals("C")){
            System.out.println(lang+" is a procedural programming language");
        }else if(lang.equals("C++")){
            System.out.println(lang+" is a middle-level programming language");
        }else{
            System.out.println(" Doesn't match any programming language");
        }
    }
}



