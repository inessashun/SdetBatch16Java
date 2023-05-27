package ReplitTasks.ReplitTask;

import java.util.Scanner;

public class Task35 {
    public static void main(String[] args) {
        /*
        **For you to do:**

Create a program that prompt user with question:  "Do you need a loan?"(Use a boolean)
If the result is true then prompt user with question: "What is your credit score?". Otherwise eligibility is "Unknown"
Based on the score define users eligibility:

- if score is below  600 --> eligibility = "Not eligible"
- if score is between 600 and 700 inclusive -->  eligibility = "Maybe eligible"
- if score is between 701 and 800 inclusive -->  eligibility = "Eligible"
- if score is higher than any other previous values --> eligibility = "Definitely eligible" .

**Output:**

```
The eligibility is ____
```
         */
        System.out.println("Do you need a loan?");

        Scanner scan = new Scanner(System.in);
        boolean loan = scan.nextBoolean();

        if (loan == true) {
        } else {
            System.out.println("Unknown");
        }
        System.out.println("What is your credit score?");
        int scoreNum = scan.nextInt();

        if (scoreNum < 600) {
            System.out.println("The eligibility is Not eligible");
        } else if (scoreNum >= 600 && scoreNum <= 700) {
            System.out.println("The eligibility is Maybe eligible");
        } else if (scoreNum >= 701 && scoreNum <= 800) {
            System.out.println("The eligibility is Eligible");
        } else {
            System.out.println("The eligibility is Definitely eligible");
        }



    }
}
