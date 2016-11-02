package employee;

/**
 * Created by Divya Mamgai on 10/31/2016.
 * Employee
 */


public abstract class Employee {

    /*
        Needed to be public so that the Anonymous Inner class created in the company.Main can have access to it.
        Note: This is because we are in different package. This happens because where the anonymous inner class is
        created compiler defines a static class with a random name and since in our case the anonymous inner class
        is created in the company package which does not have access to the members with default access specifier in
        this class and hence we need to make it public.
     */
    public String name;
    public float salary;

    public Employee(String name, float salary) {
        this.name = name;
        this.salary = salary;
    }

    public Employee(float salary) {
        this("Anonymous", salary);
    }

    public abstract String toString();

}
