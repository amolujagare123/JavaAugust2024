package FinalNStatic;

//import static  FinalNStatic.StaticMethodDemo.*;

import static FinalNStatic.StaticMethodDemo.staticMethod1;
import static  FinalNStatic.StaticMethodDemo.*;

public class Student {

    int rno;
    String  name;
    static String college = "ITS";

    void display()
    {
        System.out.println("rno="+rno);
        System.out.println("name="+name);
        System.out.println("college="+college);
    }

    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student();
        Student s3 = new Student();

        s1.rno = 1;
        s1.name = "Deepali";

        s2.rno = 2;
        s2.name = "Shubham";
        s2.college = "Pune college";

        s3.rno = 3;
        s3.name = "Lavanya";
        s3.college = "Delhi college";

        Student.college = "LTS";

        s1.display();
        s2.display();
        s3.display();

       staticMethod1();
       staticMethod2();

       college = "PS Ahmednagar";
    }
}
