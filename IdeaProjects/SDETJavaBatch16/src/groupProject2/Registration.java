package groupProject2;

public class Registration {
    /*
    Create Registration Class in which you would have variables as
email, userName and password that have an access scope only
within its own class. After creating an object of the class user should
be able to call methods and in each method separately pass values
to set users email, username and password.
Requirements:
A. Valid email consider to be only yahoo
B. Valid userName and password cannot be empty and should be of
length larger than 6 characters. Also valid password cannot contain
userName.
     */
    private String email;
    private String userName;
    private String password;

    void setUserEmail(String email) {
        this.email=email;
        if (this.email.contains("yahoo")) {
            System.out.println("Email created successful");
        }else {
            System.out.println("Email consider to be only Yahoo");
        }
    }
    void setUserName(String userName) {
        this.userName=userName;
        if (!this.userName.isEmpty() && this.userName.length()>6) {
            System.out.println("Username created successful");
        } else {
            System.out.println("Valid userName cannot be empty and should be of length larger than 6 characters");
        }
    }
    public void setUserPassword(String password) {
        this.password=password;
        if (!this.password.isEmpty() && this.password.length()>6 && !password.contains(this.userName)) {
            System.out.println("Password created successfully");
        } else {
            System.out.println("Valid password cannot be empty and should be of length larger than 6 characters.Also valid password cannot contain 'userName'");
        }
    }
}
class RegistrationTester{
    public static void main(String[] args) {
        Registration user1 = new Registration();
        user1.setUserEmail("useremail@gmail.com");
        user1.setUserName("UName");
        user1.setUserPassword("Uname");
    }
}
