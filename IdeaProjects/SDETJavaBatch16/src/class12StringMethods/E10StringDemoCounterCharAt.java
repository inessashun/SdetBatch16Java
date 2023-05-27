package class12StringMethods;

public class E10StringDemoCounterCharAt {
    public static void main(String[] args) {
        String name="Leonel";
        System.out.println(name.charAt(1)); //index number of letter

        int counter=0;
        for(int i=0; i<name.length(); i++){
            System.out.print(name.charAt(i));
            if (name.charAt(i)=='e') {
                counter++;
            }
        }
        System.out.print(" e="+counter);
    }
}
