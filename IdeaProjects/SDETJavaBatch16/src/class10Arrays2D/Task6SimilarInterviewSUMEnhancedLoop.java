package class10Arrays2D;

public class Task6SimilarInterviewSUMEnhancedLoop {
    public static void main(String[] args) {
        /*
        6) Create an array of integers and calculate
        the sum of all elements in an array
         */
        int[] numbers={10,20,30,50};
        int sum=0;
        for (int num:numbers){       //Enhanced For Loop
            sum=sum+num;
        }
        System.out.println(sum);


    }
}
