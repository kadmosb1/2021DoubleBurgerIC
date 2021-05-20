package restaurant;

import java.util.Scanner;

public class Special extends Meal {

    public Special (boolean withSodaAndFries) {
        super ("Broodje hamburger speciaal", withSodaAndFries);
    }

    public String getOrderLine () {
        System.out.print ("Wil de klant curry of ketchup bij het broodje hamburger speciaal? ");
        Scanner scanner = new Scanner(System.in);
        return "= Saus: " + scanner.nextLine () + "\r\n";
    }
}
