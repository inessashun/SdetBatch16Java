package class14MethodsArrayOthers;

public class E2ArrayManipulator {
    /* create a method that will take an int array call it sumArr
    and return the sum of all the elements from that array
    create the object of the class and call the method.
     */
    /*
    return type int
    name of the method => sumArr
    parameters => (int [] arr)
    body =>
    {
    go through all the elements of the array add them and return the results
    }
     */
    int sumArr(int []arr){ //int => here is Return class , sumArr=> is name of the method
        int sum=0;    // inside the Method, arr - elements , { }  => is body of the method
        //here you can use two Methods => For Loop and => Enhanced For Loop
        // - regular For loop
        for(int i=0; i<arr.length; i++){
            sum=sum+arr[i];
        }
        return sum; //60

        /* - enhanced For loop
        for(int num:arr){
            sum=num;
        }
        return sum;
        */
    }

    public static void main(String[] args) {
        // after created array needs to create an object of class
        E2ArrayManipulator obj=new E2ArrayManipulator(); //calls a method of a class, create an obj
        int [] array={10, 20, 30}; //array variable is an Argument here
        int result=obj.sumArr(array); //called a Method, => same as Scanner class, create an object name
        System.out.println(result); //return sum => 60
        //=> Scanner scan=new Scanner(System.in);
        //=> int age= scan.nextInt();  //same as Scanner class


    }
}
