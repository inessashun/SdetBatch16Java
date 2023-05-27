package class3;

import java.sql.SQLOutput;

public class E8StringConcat {
    public static void main(String[] args) {

        System.out.println("Leo"+10+10);
        System.out.println(10+10+"Leo");
        //Due to parenthesis Addition will be performed first
        System.out.println("Leo"+10+10);
        //left to Right rule is not applicable to math
        System.out.println(2+2*2);
        System.out.println((2+2)*2);

    }
}
