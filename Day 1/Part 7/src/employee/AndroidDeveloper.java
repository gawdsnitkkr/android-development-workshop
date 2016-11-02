package employee;

/**
 * Created by Divya Mamgai on 10/31/2016.
 * AndroidDeveloper
 */

public class AndroidDeveloper extends Employee implements Developer {

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

    @Override
    public void develop() {
        System.out.println("I just developed an Android App!");
    }

}
