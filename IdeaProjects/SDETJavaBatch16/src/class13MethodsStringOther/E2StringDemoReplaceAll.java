package class13MethodsStringOther;

public class E2StringDemoReplaceAll {
    public static void main(String[] args) {
        String str="hgagJFYD&#%!98698";
        System.out.println(str.replaceAll("[a-z]","*")); //lower case replaced with *
        System.out.println(str.replaceAll("[A-Z]","#")); //upper case replaced with #
        System.out.println(str.replaceAll("[0-9]","%")); //numbers replaced with %
        System.out.println(str.replaceAll("[a-zA-Z0-9]","%")); //(no coma/no space) all replaced with %
        System.out.println(str.replaceAll("[a-g]","*")); //specific letters lower case replaced with *
        System.out.println(str.replaceAll("[#-z]","*")); //according to ASCII table all replaced with *

        char c='A';
        c++;
        System.out.println(c);
        for (int i=0; i<10 ; i++){
            System.out.print(c++);
        }
    }
}
