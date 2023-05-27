package class13MethodsStringOther;

public class Task3RemoveSelected {
    public static void main(String[] args) {
        /*
        Create a String that should be combination of letters,
        numbers and special characters. Find out how many Alphanumeric(abd AZ 284)
        characters (non-special characters) are there in the String.
         */
        String str="awagtddkhfjHTDYTWE140987325*&%%##";

        String str1=str.replaceAll("[^a-zA-Z0-9]",""); // "" - means replaced with empty string
        System.out.println(str1);
        System.out.println(str.length());

        //OTHER EASY WAY just in one line
        System.out.println(str.replaceAll("[^a-zA-Z0-9]","").length());
    }
}
