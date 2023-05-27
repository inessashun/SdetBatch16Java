package class3;

public class E15TypeCastingDoubleInt {
    public static void main(String[] args) {
        //byte=>short=>int=>long=>float=>double
        double num=100.56754;
        int num2=(int)num;//from double to int stores only decimal whole number=>100
        System.out.println(num2); //100
    }
}
