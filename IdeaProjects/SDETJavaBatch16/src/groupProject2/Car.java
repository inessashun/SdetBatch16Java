package groupProject2;


public class Car {
        /*
        Create a Class Car that would have the following fields: carPrice and
color and method calculateSalePrice() which should be returning a price of the car.
Create 2 sub classes: Sedan and Truck. The Truck class has a field as weight and has its
own implementation of calculateSalePrice() method in which returned price is calculated
as following: if weight>2000 then returned price car should include 10% discount,
otherwise 20% discount.
The Sedan class has field as length and also does it is own implementation of
calculateSalePrice(): if length of sedan is >20 feet then returned car price should
include 5% discount, otherwise 10% discount

    */
    int length;
    double discount;
    void calculateSalePrice(int length, double carPrice) {
        if (length > 20) {
            discount = carPrice - (carPrice * 0.05);
        } else if (length < 20) {
            discount = carPrice - (carPrice * 0.1);
        }
        carPrice = discount;
        System.out.println(carPrice);
    }
}
class Sedan extends Car {
    int weight;
    double discountprice;
    void calculateSalePrice(int weight, double carPrice) {
        if (weight > 2000) {
            discountprice = carPrice - (carPrice * 0.1); //10% discount
        } else if (weight < 2000) {
            discountprice = carPrice - (carPrice * 0.2); //20% discount
        }
        carPrice = discountprice;
        System.out.println(carPrice);
    }
}
abstract class CarTester {
    public static double carPrice;
    String color;
    abstract void calculateSalePrice(int weight, double carPrice);

    public static void main(String[] args) {
        Car price = new Car();
        price.calculateSalePrice(50, 5700.0);
        Car price1=new Car();
        price1.calculateSalePrice(3500, 15000);
    }
}
