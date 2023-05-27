package ReplitTasks.ReplitTask;

public class Task87 {
        /*
        **For you to do:**
        Create a class named 'Main' with specific attributes.
        Create two objects of that class in which you will be assigning the following values and then print them.
        carColor='Black'
        carYear=2019
        carMake='BMW'
        carColor='White'
        carYear=2018
        carMake='Toyota'
        **Expected Output:**
        ```
        Car color is Black and car year is 2019 and car model is BMW
        Car color is White and car year is 2018 and car model is Toyota
        ```
        */
        String carColor;
        int carYear;
        String carMake;

        String carColor1;
        int carYear1;
        String carMake1;

        void car(){System.out.println("Car color is "+carColor+" and car year is " +carYear+" and car model is "+carMake);}

        void car1(){System.out.println("Car color is "+carColor1+" and car year is " +carYear1+" and car model is "+carMake1);}

        public static void main(String[] args){
            Task87 obj=new Task87(); //Main obj=new Main();
            obj.carColor="Black";
            obj.carYear=2019;
            obj.carMake="BMW";
            obj.car();

            Task87 obj1=new Task87();//Main obj1=new Main();
            obj1.carColor1="White";
            obj1.carYear1=2018;
            obj1.carMake1="Toyota";
            obj1.car1();

    }
}
