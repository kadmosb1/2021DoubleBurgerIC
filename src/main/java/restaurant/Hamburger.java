package restaurant;

public class Hamburger extends Meal {

    public Hamburger (boolean withSodaAndFries) {
        super ("Broodje Hamburger", withSodaAndFries);
    }

    public String getOrderLine () {
        return "";
    }
}
