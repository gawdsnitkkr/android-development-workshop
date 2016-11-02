package employee;

/**
 * Created by Divya Mamgai on 10/31/2016.
 * Developer
 */
/*
    Since our Developer is only contributing a small function develop() to its inherited classes we converted it
    into an interface.
    Note: According to Java naming conventions this is incorrect, since all the interfaces
    should have a name that is an adjective and clearly ours is a noun.
 */
public interface Developer {

    // In interface all methods are by default public and abstract and cannot have a body.
    void develop();

}
