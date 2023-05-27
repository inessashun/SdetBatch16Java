package class14MethodsArrayOthers;

public class E5ArrayUtilsTester {
    public static void main(String[] args) {
      int[]arr= {10,20,45};
      int num=20;
      E5ArrayUtils  obj=new E5ArrayUtils();
      boolean result=obj.contains(arr, num);
      System.out.println(result);
    }
}
