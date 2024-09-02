package Inheritance;

public class ClassBase {
     int a;
     double d;
     char c;
     String str ; // data members

}

class ClassChild  extends ClassBase
{
    int a1;
    double d1;

    public static void main(String[] args) {
        ClassChild ob = new ClassChild();
        ob.a1 = 90;
        ob.d1 = 88.56;
        ob.a = 10;
    }
}
