package class6LogicalSwitch;

public class E1LogicalOperators {
    public static void main(String[] args) {
        boolean chocolates=true;
        boolean flowers=false;
        if(chocolates||flowers){
            System.out.println("I'm happy");
        }else{
            System.out.println("I'm sad");
        }

        boolean fiveG=true;
        boolean wifi=false;
        if(wifi||fiveG){
            System.out.println("You can browse the Internet");
        }else{
            System.out.println("Not connected to Internet");
        }
    }
}
