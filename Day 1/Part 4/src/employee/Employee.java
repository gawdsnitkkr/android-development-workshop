package employee;

/**
 * Created by Divya Mamgai on 10/31/2016.
 * Employee
 */
public class Employee {

    String name;
    float salary;

    // Overloaded Constructor, same can be done for method.
    public Employee(String name, float salary) {
        this.name = name;
        this.salary = salary;
    }

    public Employee(float salary) {
        // Call other constructors, this reduces Content Coupling.
        this("Anonymous", salary);
    }

    public String toString() {
        return String.format("I'm %s an Employee having salary Rs. %1f", name, salary);
    }

}
