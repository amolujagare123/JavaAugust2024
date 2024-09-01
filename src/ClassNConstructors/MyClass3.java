package ClassNConstructors;

public class MyClass3 {

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



    MyClass3(int a1,double d1,char c1,String str1) // constructor
    {
        a = a1;
        d = d1;
        c = c1;
        str = str1;
    } // Parameterized Constructor

    public static void main(String[] args) {

        MyClass3 ob = new MyClass3(12,34.67,'h',"Selenium");

        ob.display();

    }

}
