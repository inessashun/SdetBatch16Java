package class13MethodsStringOther;

public class E6StringDemoStringBuilderReverse {
    public static void main(String[] args) {
        String str="Wife";
        str.toLowerCase();
        System.out.println(str);  //STRING Method doesn't have REVERSE

        StringBuilder str2=new StringBuilder("Husband");
        str2.reverse();
        System.out.println(str2);
    }
}
