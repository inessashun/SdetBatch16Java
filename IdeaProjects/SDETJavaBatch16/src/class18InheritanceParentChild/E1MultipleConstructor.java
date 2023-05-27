package class18InheritanceParentChild;

public class E1MultipleConstructor {
    public static void main(String[] args) {
        String str=new String("Java");
        char []chars={'J', 'a', 'v', 'a'};
        String str1=new String(chars);
        //extract java and convert it to upper case
        char[]chars2={'t','h', 'e','J', 'a', 'v', 'a'};
        String str3=new String(chars2,3,4); // 3 => ignore first 3 letters, 4 => next 4 letters
        System.out.println(str3.toUpperCase());
    }
}
