package class12StringMethods;

public class CarTester {
    public static void main(String[] args) {
        Car car=new Car();
        car.make="Toyota";
        car.model="sport";
        car.mileage=0;
        car.speed=140;
        car.color="white";
        car.isNew=true;

        car.comfort();
        car.fast();
        car.electric();

    }
}
