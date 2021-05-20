package restaurant;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("Welke maaltijd wil de klant bestellen?");
        System.out.println ();
        System.out.println("1. Broodje hamburger");
        System.out.println("2. Broodje hamburger met fris en frites");
        System.out.println("3. Broodje hamburger speciaal");
        System.out.println("4. Broodje hamburger speciaal met fris en frites");
        System.out.println("5. Broodje double burger");
        System.out.println("6. Broodje double burger met fris en frites");
        System.out.println ();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Welke maaltijd? ");
        int keuze = scanner.nextInt();
        scanner.nextLine ();

        Meal meal;

        switch (keuze) {
            case 1: meal = new Hamburger(false); break;
            case 2: meal = new Hamburger(true); break;
            case 3: meal = new Special(false); break;
            case 4: meal = new Special(true); break;
            case 5: meal = new DoubleBurgerAdapter(false); break;
            case 6: meal = new DoubleBurgerAdapter (true); break;
            default : meal = null;
        }

        System.out.println (meal.getOrder ());
    }
}