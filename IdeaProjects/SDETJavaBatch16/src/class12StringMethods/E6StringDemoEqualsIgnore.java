package class12StringMethods;

public class E6StringDemoEqualsIgnore {
    public static void main(String[] args) {
        String name="Leo";
        System.out.println(name.equals("Axel")); //false
        System.out.println(name.equals("Leo")); //true
        System.out.println(name.equalsIgnoreCase("JUSTIN")); //true
        System.out.println(!name.equalsIgnoreCase("JUSTIN")); //false

    }
}
