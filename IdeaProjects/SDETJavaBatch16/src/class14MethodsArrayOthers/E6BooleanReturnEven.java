package class14MethodsArrayOthers;

public class E6BooleanReturnEven {
    /*
    create a method which returns true or false and takes an int number as a parameter.
    If number is Even it returns True otherwise it returns False.
    Name of the method should be isEven
     */
    boolean isEven(int num){

        boolean isNumEven=false;
        if(num%2==0){
            isNumEven=true;
        }
        return isNumEven;
        //=> return num%2==0;
    }

    public static void main(String[] args) {
        E6BooleanReturnEven obj=new E6BooleanReturnEven();
        System.out.println(obj.isEven(15));
    }


}
