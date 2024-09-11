package FinalNStatic;

public class StaticMethodDemo {

    int rno;
    String  name;
    static String college = "ITS";

    void display()
    {
        System.out.println("rno="+rno);
        System.out.println("name="+name);
        System.out.println("college="+college);
    }

    static  void staticMethod1()
    {
     //   System.out.println("rno="+rno); // non-static - not allowed
     //   System.out.println("name="+name);// non-static - not allowed
        System.out.println("college="+college);// static - allowed
        staticMethod2();// static - allowed
     //   display();// non-static - not allowed
     //   nonStaticMethod1();// non-static - not allowed
    //    nonStaticMethod2();// non-static - not allowed

    }

    static  void staticMethod2()
    {
        System.out.println("inside static method 2");
    }

    void nonStaticMethod1()
    {
        System.out.println("inside non static method 2");
    }

    void nonStaticMethod2()
    {
        System.out.println("inside non static method 2");
        System.out.println("rno="+rno); // non-static -  allowed
        System.out.println("name="+name);// non-static -  allowed
        System.out.println("college="+college);// static - allowed
        staticMethod2();// static - allowed
        display();// non-static -  allowed
        nonStaticMethod1();// non-static -  allowed
        nonStaticMethod2();// non-static -  allowed
    }

    public static void main(String[] args) {
        StaticMethodDemo ob = new StaticMethodDemo();

        ob.staticMethod1();
        ob.staticMethod2();

        StaticMethodDemo.staticMethod1();
        StaticMethodDemo.staticMethod2();
    }
}
