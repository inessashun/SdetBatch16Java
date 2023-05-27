package class10Arrays2D;

public class Task2ArraysString2ways {
    public static void main(String[] args) {
        /*
        2) Create an array of names and store all names of your group.
        Then print your name from that array. (use 2 different ways of creating an array).
         */

        // 1st way of creating an array
        String[]group={"R", "A", "H", "S", "R"};
        System.out.println(group[1]);

        // 2nd way of creating an array
        String[]group2=new String[4];
        group2 [0]="A";
        group2 [1]="B";
        group2 [2]="C";
        group2 [3]="D";
        System.out.println(group2[0]);
    }
}
