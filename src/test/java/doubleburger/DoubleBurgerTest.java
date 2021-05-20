package doubleburger;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DoubleBurgerTest {

    @Test
    public void askForBacon () {
        assertFalse (new DoubleBurger ("").askForBacon ("n"));
        assertTrue (new DoubleBurger ("").askForBacon ("j"));
    }
}