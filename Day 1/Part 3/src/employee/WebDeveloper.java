package employee;

/**
 * Created by Divya Mamgai on 10/31/2016.
 * WebDeveloper
 */
public class WebDeveloper extends Developer {

    public WebDeveloper(float salary) {
        super(salary);
    }

    public String toString() {
        return String.format("I'm Web Developer having salary Rs. %1f", salary);
    }


}
