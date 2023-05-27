package class14MethodsArrayOthers;

public class E4ArrayUtilsIntObj {
    /*
    create a method to add int numbers, and it should return the results
    back when called name of the method should be => add
     */
    /* - solutions -
    return type =>
    name of the method => add
    parameters => (int a, int b)
    body of the method => {
    int sum=a+b;
    return sum;
    }
     */
    // => to create Method
    int add(int a, int b){
        int sum=a+b;
        return sum;
    }
    // => to use the Method create Obj
    public static void main(String[] args) {
        E4ArrayUtilsIntObj obj=new E4ArrayUtilsIntObj();
        /*
        we are calling the " add" method on "obj" passing two arguments
        one is 10 other is 20 and storing the "result" from method call
        into the "sum" variable
         */
        int sum=obj.add(10, 20); //-here is two int in line 18, you can add more there a, b, c, d ...
        System.out.println(sum);                     // - first way to Print
        //or => System.out.println(obj.add(10, 20)); // - second way to Print
    }
}
