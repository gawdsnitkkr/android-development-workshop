package employee;

/**
 * Created by Divya Mamgai on 10/31/2016.
 * Designer
 */
public class Designer extends Employee {

    public Designer(String name, float salary) {
        super(name, salary);
    }

    public Designer(float salary) {
        super(salary);
    }

    @Override
    public String toString() {
        return String.format("I'm %s a Designer having salary Rs. %1f", name, salary);
    }

}
