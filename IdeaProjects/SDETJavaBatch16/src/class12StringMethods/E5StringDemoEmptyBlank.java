package class12StringMethods;

public class E5StringDemoEmptyBlank {
    public static void main(String[] args) {
        String name="     ";
        System.out.println(name.isEmpty()); //false
        System.out.println(name.isBlank()); //true  //it checks the spaces as well


    }
}
