package Inheritance.superDemo;

public class Employee {

    int salary = 15000;

    Employee()
    {
        System.out.println("inside employee constructor");
    }

    Employee(int a)
    {
        salary = a;
        System.out.println("salary="+salary);
    }

     void calculateSalary() // E
    {
        int total = 30 * 500;
        System.out.println("Total salary="+total);
    }

    void empWork()
    {
        System.out.println("empWork");
    }
}

class Programmer  extends Employee
{
    int bonus = 5000;
    int salary = 20000;
 //   int salary = 15000;  // emp

    Programmer()
    {
        super(40000);
        System.out.println("inside Programmer constructor");
    }

    void programmerWork()
    {
        System.out.println("programmerWork");
    }

    @Override
    void calculateSalary() // p
    {
        int total = 30 * 500 + bonus;
        System.out.println("Total salary="+total);
    }

    void display()
    {
        System.out.println("bonus="+bonus);
        System.out.println("salary="+super.salary); //
        programmerWork();
        super.calculateSalary(); //
    }

    public static void main(String[] args) {

        Programmer p = new Programmer();

      //  p.display();

        p.calculateSalary();

        Employee e = new Programmer(); // upcasting
        e.calculateSalary();

    }
}
