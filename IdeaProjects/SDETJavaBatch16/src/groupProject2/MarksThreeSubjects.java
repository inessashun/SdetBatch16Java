package groupProject2;

public abstract class MarksThreeSubjects {
        /*
        We have to calculate the average of marks obtained in three subjects
by student A and by student B. Create class 'Marks' with an abstract method
'getPercentage' that will be returning the average percentage of marks.
Provide implementation of abstract method in classes 'A' and 'B'.
The constructor of student A takes the marks in three subjects as its
parameters and the marks in four subjects as its parameters for student B.
Test your code
         */
        abstract int getPercentage();
}
class A extends MarksThreeSubjects{
    int subject1;
    int subject2;
    int subject3;
    public A(int subject1, int subject2, int subject3) {
        this.subject1 = subject1;
        this.subject2 = subject2;
        this.subject3 = subject3;
    }
    @Override
    int getPercentage() {
        return (subject1+subject2+subject3)/3;
    }
}
class B extends A {
    int subject4;
    public B(int subject1, int subject2, int subject3, int subject4) {
        super(subject1, subject2, subject3);
        this.subject4 = subject4;
    }
    @Override
    int getPercentage() {
        return (subject1 + subject2 + subject3 + subject4) / 4;
    }
}
class MarksThreeSubjectsTester{
    public static void main(String[] args) {
        A student=new A(65,75,85);
        int results=student.getPercentage();
        System.out.println(results);
        B student1=new B(55,69,95,98);
        int results1=student1.getPercentage();
        System.out.println(results1);
    }
}
