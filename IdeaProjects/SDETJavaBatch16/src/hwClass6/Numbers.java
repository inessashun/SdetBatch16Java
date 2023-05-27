package hwClass6;

public class Numbers {
    public static void main(String[] args) {
        /*
        2.) Ask user to enter a number and then define if number is small, medium or large
            Small number is value between 1 and 10
            Medium number is value between 11 and 100
            Large number is value between 101 and 1000

         */
        int number=55;
        if(number>=1 && number<=10){
            System.out.println("number is small");
        }else if(number>=11 && number<=100){
            System.out.println("number is medium");
        }else if(number>=101 && number<=1000){
            System.out.println("number is large");
        }

    }
}
