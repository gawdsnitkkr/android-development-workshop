package employee;

/**
 * Created by Divya Mamgai on 10/31/2016.
 * Employee
 */
public class Employee {

    // Class Variable
    public static int count;

    /*
        Instance Variable
        Made public so that it can be accessed in other packages and outside the class.
        Note : It is not a good approach to give access to the members of your class to everyone. This is because many
        times these members might be crucial for the working of your class and hence if modified your class will fail.
    */
    public float salary;

    public Employee(float salary) {
        count++;
        this.salary = salary;
    }

    public String toString() {
        return String.format("I'm Employee having salary Rs. %1f", salary);
    }

}
