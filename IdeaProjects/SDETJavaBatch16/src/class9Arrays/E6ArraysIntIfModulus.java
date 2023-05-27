package class9Arrays;

public class E6ArraysIntIfModulus {
    public static void main(String[] args) {
        /*
        create an array store 10, 50, 60, 45, 100 then print elements
        which are present on odd indexes
        expected OUT  - 50, 45
         */
        int [] num={10, 50, 60 , 45 , 100 };
        for(int i=0; i<num.length; i++){
            if(i%2!=0) {
                System.out.println(num[i]);
            }
        }

    }
}
