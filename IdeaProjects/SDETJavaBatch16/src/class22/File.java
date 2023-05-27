package class22;

public abstract class File {
    /* ClassTASK
    Create a class File that will have the following behaviors: open, edit, close.
    Edit and close are implemented method while open is an abstract.
    Create 3 subclasses: JavaFile, WordFile, PdfFile that will provide specific
    implementation of open behaviour:
    Example: to open .java file we need notepad++ or sublime text, to open .doc file
    we need Microsoft word to be installed etc.
    Create a Tester class and call all of the methods from these classes.
     */ //Ivana's code
    private String name;
    private double size;

    public File(String name, double size) {
        this.name = name;
        this.size = size;
    }
    abstract void open();

    void edit() {
        System.out.println("editing.....");
    }
    void close() {
        System.out.println("closing the file");
    }
    void printInfo() {
        System.out.println(name + " " + size);
    }
}
class JavaFile extends File {
    public JavaFile(String name, double size) {
        super(name, size);
    }
    @Override
    void open() {
        System.out.println(" to open .java file we need Intellij");
    }
    @Override
    void close() {
        System.out.println("Clos the file by clicking on the cross sign");
    }
}
class WordFile extends File {
    public WordFile(String name, double size) {
        super(name, size);
    }
    @Override
    void open() {
        System.out.println(" to open .doc file we need Microsoft word to be installed");
    }
}
class PdfFile extends File {

    public PdfFile(String name, double size) {
        super(name, size);
    }
    @Override
    void open() {
        System.out.println("open pdf file in Adobe");
    }
}
class FileTester {
    public static void main(String[] args) {
        File[] files = {new JavaFile("Animals", 5.6), new PdfFile("Dog", 4.0), new WordFile("cat", 6.2)};
        for (File file : files) {
            file.printInfo();
            file.open();
            file.close();
            file.edit();
        }
    }
}
