package class17ConstructorsThisKeyword;

public class Laptop {
    String make;
    String model;
    double batteryLife;
    int storage;
    boolean camera;
    boolean touchPad;
    boolean touchScreen;

    public Laptop(String make, String model, double batteryLife, int storage, boolean camera) {
        this.make = make;
        this.model = model;
        this.batteryLife = batteryLife;
        this.storage = storage;
        this.camera = camera;
    }

    public Laptop(String make, String model, double batteryLife, int storage, boolean camera, boolean touchPad, boolean touchScreen) {
        this.make = make;
        this.model = model;
        this.batteryLife = batteryLife;
        this.storage = storage;
        this.camera = camera;
        this.touchPad = touchPad;
        this.touchScreen = touchScreen;
    }

    public static void main(String[] args) {
        Laptop dell=new Laptop("Dell","65",3,512,true);

        String str=new String();
        new String("str");
        new String(new char[]{'c'});
        new String(new char[]{'c'},10,20);

    }

}
