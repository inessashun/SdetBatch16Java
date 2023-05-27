package hwClass4;

import java.util.Scanner;

public class TempFahrenheit_Celsius {
    public static void main(String[] args) {
        /*4)Create a Java program that will ask user to input city and temperature.
            Your program should convert Fahrenheit into celsius and print
            “The temperature is  the city  is ”*/
        double celsius, fahrenheit;

        System.out.print("Please enter the city - ");
        Scanner scan=new Scanner(System.in);
        String city=scan.next();

        System.out.print("Please enter the temperature in F - ");
        Scanner temp=new Scanner(System.in);

        fahrenheit = temp.nextDouble();
        celsius = (fahrenheit-32)*(0.5556);
        System.out.println("The temperature is "+celsius+ " the city is "+city);

    }
}
