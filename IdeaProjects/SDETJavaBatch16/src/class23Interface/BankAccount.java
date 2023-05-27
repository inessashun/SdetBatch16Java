package class23Interface;

public class BankAccount {
    private String userName;
    private String password;
    private double accountBalance=120;

    public BankAccount(String userName, String password) {
        this.userName = userName;
        this.password = password;
    }
    public double getAccountBalance(){  //(String password){ - we remove this methods
        /*if(password.equals(this.password)){
            return accountBalance;
        }else{
            return 0;
        }*/ //    EASY WAY  to get result in one line =>
        return accountBalance;
    }
    public void setAccountBalance(double balance){
        accountBalance=balance;
    }
    void setPassword(String password){
        this.password=password;
    }

}
class BankTester{
    public static void main(String[] args) {
        BankAccount bankAccount=new BankAccount("User 123 ","password");
        System.out.println(bankAccount.getAccountBalance());
        bankAccount.setAccountBalance(100000);
        System.out.println(bankAccount.getAccountBalance());
    }
}