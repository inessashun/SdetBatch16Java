package class4IfElseScanner;

public class E2IfElseStatement {
    public static void main(String[] args) {
        //String is non-primitive data type and with non-primtive data types
        // we can't use == sign or relational operators
        String name="Jacob";
        //name.equals("Corey) => checks if name and the value that we
        // write inside equals() are same or not
        if(name.equals("Jacob")){
            System.out.println("I like swimming");
        }else{
            System.out.println("I like programming");
        }
    }
}
