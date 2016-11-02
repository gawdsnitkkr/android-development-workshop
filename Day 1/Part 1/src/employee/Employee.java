package employee;

/**
 * Created by Divya Mamgai on 10/31/2016.
 * Employee
 */
public class Employee {

    float salary;

    public Employee(float salary) {
        this.salary = salary;
    }

    public String toString() {
        return String.format("I'm Employee having salary Rs. %1f", salary);
    }

}
