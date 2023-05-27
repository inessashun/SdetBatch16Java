package groupProject1;
/*
1. Create a program that uses an array to store a list of
temperatures for a week, and then uses a loop to find
the highest and lowest temperature for the week.
 */
public class HighLowTempList {
    public static void main(String[] args) {
        int [] temp={65, 53, 67, 80, 74, 77, 75};
           int highest=temp[0];
           int lowest=temp[0];
                for(int temps1:temp) {
                    if (temps1 > highest) {
                        highest = temps1;
                    }
                }
                for(int temps2:temp) {
                     if (temps2 < lowest) {
                        lowest = temps2;
            }
        }
        System.out.println("The Highest temperature is " + highest+ " and the Lowest temperature is " +lowest+ " for the week.");

    }
}
