package AbstractionDemo;

public interface InterfaceDemo {

    void start();
    void run();

    static void method1()
    {
        System.out.println("method 1");
    }

    default void method2()
    {
        System.out.println("method 2");
    }

    private void method3()
    {
        System.out.println("method 3");
    }
}

class ChildInterface implements InterfaceDemo
{
    public void run()
    {
        System.out.println("run");
    }
    public void start()
    {
        System.out.println("start");
    }

    public static void main(String[] args) {

        InterfaceDemo ob = new ChildInterface();
        ob.start();
        ob.run();
    }
}
