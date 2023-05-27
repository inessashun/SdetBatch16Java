package class16;

public class Person {
    private String name="Leo";
    String SSN="1234123432";
    private String password;
    private static double bankBalance=120000;
    private void printPassword(){
        System.out.println(password);
    }

    private static void printBalance() {
        System.out.println(bankBalance);

    }

    public static void main(String[] args) {
        Person farwa=new Person();
        farwa.password="12345621";
        farwa.printPassword();
        System.out.println(Person.bankBalance);
        System.out.println(farwa.SSN);
        System.out.println(farwa.name);

    }
}
