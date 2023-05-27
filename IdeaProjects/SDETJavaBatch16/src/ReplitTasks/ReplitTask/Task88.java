package ReplitTasks.ReplitTask;


public class Task88 {
    /*
    Create a Class Main
    In this class, you should specify the following attributes: breed, name, color, and following behaviors: bark(), run(), play().
    Create 3 different objects of it: Husky, Bulldog, Labrador with specific attributes and behaviors.
    The output of the program should be as following:
    ```
    Husky can bark
    ```
    ```
    Husky can run
    ```
    ```
    Husky can play
    ```
    ```
    Bulldog can bark
    ```
    ```
    Bulldog can run
    ```
    ```
    Bulldog can play
    ```
    ```
    Labrador can bark
    ```
    ```
    Labrador can run
    ```
    ```
    Labrador can play
    ```
     */
    String breed;
    String name;
    String color;
    void bark() {System.out.println(breed+" can bark");}

    void run() {System.out.println(breed+" can run");}

    void play() {System.out.println(breed+" can play");}


    public static void main (String[]args) {
        Task88 dog1 = new Task88();//Main dog1=new Main();
        dog1.breed = "Husky";
        dog1.name = "Jacky";
        dog1.color = "Grey";
        dog1.bark();
        dog1.run();
        dog1.play();

        Task88 dog2 = new Task88();//Main dog2=new Main();
        dog2.breed = "Bulldog";
        dog2.name = "Max";
        dog2.color = "White";
        dog2.bark();
        dog2.run();
        dog2.play();

        Task88 dog3 = new Task88();//Main dog3=new Main();
        dog3.breed = "Labrador";
        dog3.name = "Rocky";
        dog3.color = "Brown";
        dog3.bark();
        dog3.run();
        dog3.play();
    }
}
