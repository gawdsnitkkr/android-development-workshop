package employee;

/**
 * Created by Divya Mamgai on 10/31/2016.
 * WebDeveloper
 */
public class WebDeveloper extends Developer {

    public WebDeveloper(String name, float salary) {
        super(name, salary);
    }

    public WebDeveloper(float salary) {
        super(salary);
    }

    @Override
    public String toString() {
        return String.format("I'm %s an Web Developer having salary Rs. %1f", name, salary);
    }


}
