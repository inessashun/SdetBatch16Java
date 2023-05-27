package class13MethodsStringOther;

public class E3StringDemoNotReplace {
    public static void main(String[] args) {
        String str="jhdhsjufKFFYF321425*&*^^";
        //to learn MORE => https://regexr.com/
        System.out.println(str.replaceAll("[^a-z]","")); // ^ - don't replace letters a-z
        System.out.println(str.replaceAll("[^a-z0-9]","")); // ^ - don't replace letters a-z and numbers 0-9
        System.out.println(str.replaceAll("[Dn3]",""));
        System.out.println(str.replaceAll("[s-t]","\\$")); // $ - gives you an ERROR


    }
}
