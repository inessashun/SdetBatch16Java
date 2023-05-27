package class13MethodsStringOther;

public class E1StringDemoReplace {
    public static void main(String[] args) {
        String str="Batch 16 is good";
        str=str.replace("good","Excellent");
        //System.out.println(str.replace("good","Excellent"));
        System.out.println(str);
        System.out.println(str.replace('e','E'));
    }
}
