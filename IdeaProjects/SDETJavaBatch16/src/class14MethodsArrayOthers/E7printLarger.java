package class14MethodsArrayOthers;
/*
Create a method that will take 2 parameters as
a numbers and prints which number is larger
 */
public class E7printLarger {
    void printLarger(int a,int b){
        if(a>b){
            System.out.println(a);
        }else {
            System.out.println(b);
        }
        //System.out.println(Math.max(a, b));
    }

    public static void main(String[] args) {
        E7printLarger e7=new E7printLarger();
        e7.printLarger(40,30);
    }
}
