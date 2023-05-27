package class3;

public class E14TypeCastingShortByte {
    public static void main(String[] args) {
        //byte=>short=>int=>long=>float=>double

        short num=126; //short stores up to 16 digits - byte store up to 8 digits
        byte num2=(byte)num; //type casting to force to do operation
        System.out.println(num2);

    }
}
