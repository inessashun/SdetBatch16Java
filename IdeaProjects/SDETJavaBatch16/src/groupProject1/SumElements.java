package groupProject1;
/*
2. Create an array of integer values. After the array is
created, calculate the sum of all stored elements in
that array
 */
public class SumElements {
    public static void main(String[] args) {
       int [] arr={4, 9, 6, 19, 22, 26 };

       int sum = 0;
       for (int num : arr) {
           sum = sum + num;
       }
       System.out.print("sum= " + sum);

    }
}
