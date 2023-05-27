package hwClass2;

public class ChangeVariables {
    public static void main(String[] args) {
        /*3)Change student’s city, state, phone number and grade.
        And print those updated values:
        Example:
        My name is  and I moved to new city and new state.
        My new phone number is
         */
        String name="Innessa";
        String lastName="Shunko";
        String grade="A";
        String city="Brooklyn";
        String state="New York";
        String phoneNumber="646-123-4567";

        System.out.println("My name is "+name+ " and my last name is "+lastName);
        System.out.println("I am " +grade+" student " );
        System.out.println("I live in  "+city+ " and state " +state);
        System.out.println("And my phone number is "+phoneNumber);

         city="Dallas";
         state="Texas";
         phoneNumber="800-123-4567";

        System.out.println("My name is "+name+" "+lastName+" and I moved to new city " +city+ " and new state "+state);
        System.out.println("My new phone number is " +phoneNumber);
    }
}
