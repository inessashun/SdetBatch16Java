package class13MethodsStringOther;

public class E5StringVsStringBuilder {
    public static void main(String[] args) {
        StringBuilder str=new StringBuilder("Java");
        System.out.println(str.reverse());

        System.out.println("************");

        String str1="Computer";
        StringBuilder str2=new StringBuilder(str1);
        System.out.println(str2);

        str2.reverse();
        str1=str2.toString();
        System.out.println(str1);
    }
}
