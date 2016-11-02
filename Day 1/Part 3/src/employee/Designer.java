package employee;

/**
 * Created by Divya Mamgai on 10/31/2016.
 * Designer
 */
public class Designer extends Employee {

    public Designer(float salary) {
        super(salary);
    }

    public String toString() {
        return String.format("I'm Designer having salary Rs. %f", salary);
    }

}
