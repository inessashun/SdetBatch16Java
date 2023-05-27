package class12StringMethods;

public class E11StringDemoIndexLetters {
    public static void main(String[] args) {
        String name="Today is Saturday";
        System.out.println(name.indexOf('i'));  //index# 6
        System.out.println(name.indexOf('a'));  //index# 3
        System.out.println(name.indexOf('a',4)); //start the search From letter#4 // letters

        //what INDEX for all 'a' in a sentence
        for(int i=0; i<name.length(); i++){
            if(name.charAt(i)=='a'){
                System.out.print(i+" "); //indexes of all char 'a' - 3, 10, 15
                System.out.println(name.charAt(i));
            }
        }

    }
}
