package groupProject2;

public class FirstNonRepeatChar {
    public static void main(String[] args) {
        /*
        Find the First Non-Repeating Character in a String: Given a string,
find and return the first non-repeating character. For example, in the
string "abracadabra", the first non-repeating character is 'c'.

         */
        String str = "abracadabra";
        for (char chars : str.toCharArray()){
            if (str.indexOf(chars) == str.lastIndexOf(chars)){
                System.out.println("The First Non-Repeating Character is '"+chars+"'");
                break;
            }
        }
    }
}
