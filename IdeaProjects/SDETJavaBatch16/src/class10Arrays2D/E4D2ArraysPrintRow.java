package class10Arrays2D;

public class E4D2ArraysPrintRow {
    public static void main(String[] args) {
        /*
        when ever we repeat code we should
        replace it with a loop
         */
        int[][]matrix={ //indicates 2DArrays
                {10, 20, 30},
                {20, 50, 65},
                {102, 54, 60}
        };
        for(int j=0; j<3; j++){ // we can replace => j<matrix.length
            int [] arr1=matrix[j]; //indicates 1DArrays
            for(int i=0; i<arr1.length; i++){
                System.out.print(arr1[i]+ " ");
            }
            System.out.println();
        }



    }
}
