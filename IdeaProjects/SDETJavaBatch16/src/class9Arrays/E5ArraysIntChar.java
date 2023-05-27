package class9Arrays;

public class E5ArraysIntChar {
    public static void main(String[] args) {
        /*
        write a loop that starts from 0 and it goes till the number 5 and print
        only the even numbers.
        {a,b,c,d,e} => a c e
        create an array of chars, and you have to print all the chars on
        even indexes
         */
        int [] num={0, 1, 2 , 3 , 4 , 5};
        for(int i=0; i<num.length; i+=2){
            System.out.println(num[i]+" ");
        }
        char [] chars={'a', 'b', 'c' , 'd' , 'e' };
        for(int l=0; l<chars.length; l+=2){
              System.out.print(chars[l] + " ");
        }
    }
}

