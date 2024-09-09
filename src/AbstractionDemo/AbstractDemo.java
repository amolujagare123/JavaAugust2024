package AbstractionDemo;

public abstract class AbstractDemo {

    abstract void run(); // declared
    abstract void start(); // declared

    void display() // defined
    {
        System.out.println("");
    }

}

class ChildAbstract extends AbstractDemo
{
    void run()
    {
        System.out.println("run");
    }
    void start()
    {
        System.out.println("start");
    }

    public static void main(String[] args) {

        AbstractDemo ob = new  ChildAbstract();
        ob.run();
        ob.start();
        ob.display();
    }
}
