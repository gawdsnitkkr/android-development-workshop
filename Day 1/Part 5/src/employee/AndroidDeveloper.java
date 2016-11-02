package employee;

/**
 * Created by Divya Mamgai on 10/31/2016.
 * AndroidDeveloper
 */
public class AndroidDeveloper extends Developer {

    public AndroidDeveloper(String name, float salary) {
        super(name, salary);
    }

    public AndroidDeveloper(float salary) {
        super(salary);
    }

    @Override
    public String toString() {
        return String.format("I'm %s an Android Developer having salary Rs. %1f", name, salary);
    }

}
