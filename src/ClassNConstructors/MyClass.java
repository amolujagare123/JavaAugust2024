package ClassNConstructors;

public class MyClass {

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

    void displayNumeric() {
        System.out.println("a=" + a);
        System.out.println("d=" + d);
    }

    void printA()
    {
        System.out.println(a);
    }
    public static void main(String[] args) {

        int x ;
        x = 10;

        MyClass ob = new MyClass();

        ob.a = 89 ;
        ob.d = 56.67;
        ob.c = 'h';
        ob.str = "Sam";
        ob.display();

        /*System.out.println(ob.a);
        ob.displayNumeric();
        ob.printA();*/

        MyClass ob2 = new MyClass();

        ob2.a = 69 ;
        ob2.d = 51.67;
        ob2.c = 'c';
        ob2.str = "Samir";
        ob2.display();


    }

}
