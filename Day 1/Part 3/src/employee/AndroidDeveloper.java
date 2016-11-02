package employee;

/**
 * Created by Divya Mamgai on 10/31/2016.
 * AndroidDeveloper
 */
public class AndroidDeveloper extends Developer {

    public AndroidDeveloper(float salary) {
        super(salary);
    }

    public String toString() {
        return String.format("I'm Android Developer having salary Rs. %1f", salary);
    }

}
