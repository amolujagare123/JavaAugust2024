package ClassNConstructors;

public class MyClass4 {

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


   MyClass4(int a, double d, char c, String str) // constructor
    {
        this.a = a;
        this.d = d;
        this.c = c;
        this.str = str;
    } // Parameterized Constructor with 'this' operator






    public static void main(String[] args) {

        MyClass4 ob = new MyClass4(12,34.67,'h',"Selenium");

        ob.display();

    }

}
