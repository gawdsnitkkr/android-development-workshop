package company;

import employee.*;

public class Main {

    public static void main(String[] args) {

        Developer divya = new WebDeveloper("Divya", 2000000);
        Developer anshul = new AndroidDeveloper("Anshul", 2000000);

        // Look into WebDeveloper.develop() method for more details.
        divya.develop();
        anshul.develop();

    }

}