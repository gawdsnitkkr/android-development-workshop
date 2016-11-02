package employee;

/**
 * Created by Divya Mamgai on 10/31/2016.
 * Employee
 */

/*
    Since every employee will either be a Designer, Developer, Android Developer or even a Web Developer, hence
    we don't need to create its instances as it is. So we make Employee a abstract class. The same is valid for the
    Developer class.
 */

public abstract class Employee {

    /*
        Abstract classes can have data members and hence it isn't full abstraction.
     */
    String name;
    float salary;

    /*
        Abstract classes can even have constructors and normal methods and hence it isn't full abstraction.
     */

    public Employee(String name, float salary) {
        this.name = name;
        this.salary = salary;
    }

    public Employee(float salary) {
        this("Anonymous", salary);
    }

    // Abstract classes can even have abstract methods which are required to be implemented in the inherited classes
    // which introduces some abstraction.
    public abstract String toString();

}
