package restaurant;

import doubleburger.DoubleBurger;

public class DoubleBurgerAdapter extends Meal {

    DoubleBurger doubleBurger;

    public DoubleBurgerAdapter(boolean withSodaAndFries) {
        super("Broodje double burger", withSodaAndFries);
        doubleBurger = new DoubleBurger ("Broodje double burger");
    }

    @Override
    public String getOrderLine() {
        String antwoord = doubleBurger.askForBacon () ? "ja" : "nee";
        return "= Bacon: " + antwoord + System.lineSeparator ();
    }
}
