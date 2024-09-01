package ClassNConstructors;

public class MyClass2 {

    int a;
    double d;
    char c;
    String str ; // data members

    void display()
    {
        System.out.println("a="+a);
        System.out.println("d="+d);
        System.out.println("c="+c);
        System.out.println("str="+str);
    }

   /* MyClass2() // empty constructor
    {


    }*/

    MyClass2() // constructor
    {
        a = 11;
        d = 67.11;
        c = 'h';
        str = "Text";
    }

    public static void main(String[] args) {

        MyClass2 ob = new MyClass2();

        ob.display();

    }

}
