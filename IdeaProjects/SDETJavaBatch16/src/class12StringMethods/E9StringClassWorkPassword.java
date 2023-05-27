package class12StringMethods;

public class E9StringClassWorkPassword {
    public static void main(String[] args) {
        /*
        Store username, password and confirm password from a user and check following requirements:
        Username and Password cannot be  empty, if so→ message=”Username or Password cannot be empty”.
        Password should be minimum 8 characters, if less → message=”Password is too short”.
        Password cannot contain username if so, → message=”Password cannot contain username”.
        Password should match confirmed password, if not  → message=“Passwords do not match”.

        Only after all requirements met → message “Your username and password has been created”
        You do not have permission to send messages in this channel.
         */

        String username="forexample";
        String password="pass1234567";
        String confirmYourPassword="pass1234567";

        if (username.isBlank() && password.isBlank()){
            System.out.println("Username or Password cannot be empty");
        }else if (password.length()<8){
            System.out.println("Password is too short");
        }else if (password.contains(username)){
            System.out.println("Password cannot contain username");
        }else if (!password.equals(confirmYourPassword)){
            System.out.println("Passwords do not match");
        }else {
            System.out.println("Your username and password has been created");
        }

    }
}
/* OTHER way
        String username="admin33";
        String password="C432";

        if(username.isEmpty()&&password.isEmpty()){
            System.out.println("Username is good");
        }else{
            System.out.println("Username and password cannot be empty");
        }

        if(password.length()>=8){
            System.out.println("Password is good");
        }else{
            System.out.println("Password is too short");
        }

        if(password.contains(username)){
            System.out.println("Password cannot contain username");
        }

        if(password.equals(password)) {
            System.out.println("Equals");
        }else{
            System.out.println("Passwords do not match");
        }
        System.out.println("Your username and password has been created");
    }
 */
/* OTHER way
        String username="username";
        String password="asdwe";
        String confirmPassword="Password12";
        if (password.length()<8){
            System.out.println("Password is too short.");
        }else if (password==username){
            System.out.println("Password cannot contain username");
        } else if (password!=confirmPassword) {
            System.out.println("Passwords do not match");
        }else {
            System.out.println("Your username and password has been created");
        }
    }
 */
