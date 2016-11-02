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

    /*
        All abstract methods in the inheriting class are needed to be defined in the inherited class.
     */

    @Override
    public String toString() {
        return String.format("I'm %s a Designer having salary Rs. %1f", name, salary);
    }

}
