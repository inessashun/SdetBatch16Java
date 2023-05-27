package class19Super;

public class Math {
    static void add(int num1, int num2){      //1) addTwoInt
        System.out.println(num1+num2);
    }
    static void add(int num1, double num2){   //2) addOneIntOneDouble
        System.out.println(num1+num2);
    }
    static void add(double num1, double num2){ //3) addTwoDouble
        System.out.println(num1+num2);
    }
    static void add(double num1, int num2){ //4) addOneDoubleOneInt
        System.out.println(num1+num2);
    }
    static void add(long num1, double num2){ //5) addOneLongOneDouble
        System.out.println(num1+num2);
    }
    static void add(long num1, double num2, int num3){ //6) addOneLongOneDoubleOneInt
        System.out.println(num1+num2+num3);
    }
//we must have different 1) number of parameters 2) data types of parameters 3) sequence of datatypes
    public static void main(String[] args) {
        add (10,10);   //simple methods easy to read / easy for users
        add(10,20.5);
        add(2.5, 2.5);
        add(5.7, 50);
        add(1111111111L,1.1);
        add(11111111111L, 4.5, 78);



    }
}
