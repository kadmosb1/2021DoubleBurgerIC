package doubleburger;

import java.util.Scanner;

public class DoubleBurger {

    String name;

    public DoubleBurger (String name) {
        this.name = name;
    }

    public String getName () {
        return name;
    }

    protected boolean askForBacon (String baconChosen) {
        return baconChosen.equals ("j");
    }

    public boolean askForBacon () {
        System.out.print("Wil de klant bacon tussen de beide hamburgers (j/n)? ");
        Scanner scanner = new Scanner(System.in);
        return askForBacon (scanner.nextLine ());
    }
}
