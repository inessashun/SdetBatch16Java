package class15MethodsLocalInstanceStatic;

public class E4 {
    String name="Jimmi"; //instance variable
    void print(){
        int number=10;  //local variable
        System.out.println(number);
    }

    public static void main(String[] args) {
       int number=10;

        E4 e4=new E4();
        e4.print();

        if(true){
            int sum;
            //System.out.println(sum);
        }
        switch("java"){
            case"a":   //<= colon-: - not semi-colon
            int sum=0;
        }
        for (int i = 0; i < 10; i++) {
            int sum=0;
            for (int j = 0; j <5; j++) {
                System.out.println(sum);
            }

        }
    }
}
