package class10Arrays2D;

public class E2D2ArraysMatrix {
    public static void main(String[] args) {
        //indexes are always size- 1 here 3 is size
        int[][]matrix=new int[3][3];
        matrix[0][0]=10;
        matrix[1][1]=20;
        matrix[2][2]=30;

        System.out.println(matrix[1][3]); //error because we don't have 3rd row
        System.out.println(matrix[2][1]);

    }
}
