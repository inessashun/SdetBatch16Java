package class11Arrays2D;

public class E7OOP4BadWays5Students {
    public static void main(String[] args) {
     /*
     Basic:
        String[] name = new String[5];
        String[] id = new String[5];
        int[] age = new int[5];
        char[] grade = new char[5];
        double[] weight = new double[5];
      *//*=========================================*/
       //write a OOP code for 5 students: ID, age, grade, weight


        /*not good yet, but THE WAY BETTER than 2 previous code SOLUTIONS(check it down)

        System.out.println("***** code with 2D ARRAYS ******");

        //if we want to pass this data in another class we need to pass all arrays
        //data is not organized properly even if add just one element all will be ruined

        String[] names={"Sam", "Carol","Jim","Lenny","Col"};
        int[] id={012,013,014,015,016};
        int[] age={34,24,43,27,30};
        char[] grade={'A','B','C','B','A'};
        int [] weight={150,130,124,149,119};
        */

        /*
        System.out.println("***** code with 2D ARRAYS ******");
        not good:
        1)problems here we don't know what is for example what does this 102 represents
        2)we can't pass this data around easily
        3)we can't do calculations because


        String [] [] names={
                {"Farwa", "id", "A"," 102"},
                {"Halima", "id", "B"," 101"},
                {"Dania", "id", "C"," 100"},
                {"Fatima", "id", "D"," 99"},
                {"Zara", "id", "E"," 88" },
        };*/

        /*
        not good/ too long code
        System.out.println("***** code with VARIABLES ******");

        String name1="Veronica";
        String Id="897-54-3465";
        int age=32;
        char grade='A';
        int weight=130;

        String name2="Vlad";
        String Id1="897-54-3444";
        int age1=33;
        char grade1='B';
        int weight1=140;

        String name3="Sarah";
        String Id2="897-54-1111";
        int age2=30;
        char grade2='C';
        int weight2=120;

        String name4="Leandro";
        String Id3="897-54-2222";
        int age3=25;
        char grade3='A';
        int weight3=135;

        String name5="Pavel";
        String Id4="897-54-3333";
        int age4=30;
        char grade4='C';
        int weight4=125;

        System.out.print(name1+" "+Id+" "+age+" "+grade+" "+weight);
        System.out.println();
        System.out.print(name2+" "+Id1+" "+age1+" "+grade1+" "+weight1);
        System.out.println();
        System.out.print(name3+" "+Id2+" "+age2+" "+grade2+" "+weight2);
        System.out.println();
        System.out.print(name4+" "+Id3+" "+age3+" "+grade3+" "+weight3);
        System.out.println();
        System.out.print(name5+" "+Id4+" "+age4+" "+grade4+" "+weight4);
        */

    }
}
