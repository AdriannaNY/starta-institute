package lesson4.practice4;

import java.util.Scanner;

public class CoffeeMachine {

    private static Scanner sc;
    static boolean selected = false;
    static Drink choice = null;
    static int subprocessCount = 1;

    public static void main(String[] args) {

        sc = new Scanner(System.in);

        while (!selected) {

            System.out.println("Push button pls with number (1 - ESPRESSO, 2 - AMERICANO, 3- CAPPUCCINO, 4- LATTE)");
            int button = sc.nextInt();

            switch (button) {
                case 1 -> {
                    choice = Drink.ESPRESSO;
                    System.out.println("You've selected " + choice + ". Making " + choice);
                    makeEspresso(false);
                    selected = true;
                }
                case 2 -> {
                    choice = Drink.AMERICANO;
                    System.out.println("You've selected " + choice + ". Making " + choice);
                    makeAmericano();
                    selected = true;
                }
                case 3 -> {
                    choice = Drink.CAPPUCCINO;
                    System.out.println("You've selected " + choice + ". Making " + choice);
                    makeCappuccino();
                    selected = true;
                }
                case 4 -> {
                    choice = Drink.LATTE;
                    System.out.println("You've selected " + choice + ". Making " + choice);
                    makeLatte();
                    selected = true;
                }
                default -> System.out.println("Incorrect button");
            }

            if (choice != null)
                System.out.println("Your drink is ready, pls pay " + choice.getPrice() + " Euro");
        }

        sc.close();
    }

    public static void makeEspresso(boolean subprocess) {
        if (subprocess)
            System.out.println("\t" + subprocessCount + ". Adding an espresso (" + Volume.SMALL.getVolume() + " ml)");
        else
            System.out.println("Making an espresso (" + Volume.SMALL.getVolume() + " ml)");
    }

    public static void addSomeWater() {
        System.out.println("\t" + subprocessCount + ". Adding some water (" +
                (Volume.MIDDLE.getVolume() - Volume.SMALL.getVolume()) + " ml)");
    }

    public static void makeAmericano() {
        makeEspresso(true);
        addSomeWater();
    }

    public static void addSomeFoamMilk(Drink drink) {
        String template = "Adding some foam milk (";

        if (drink == Drink.CAPPUCCINO)
            System.out.println(template + (Volume.MIDDLE.getVolume() - Volume.SMALL.getVolume()) + " ml)");
        else
            System.out.println(template + (Volume.LARGE.getVolume() - Volume.SMALL.getVolume()) + " ml)");
    }

    public static void makeCappuccino() {
        makeEspresso(true);
        addSomeFoamMilk(Drink.CAPPUCCINO);
    }

    public static void makeLatte() {
        addSomeFoamMilk(Drink.LATTE);
        makeEspresso(true);
    }
}

enum Drink {
    // espresso, americano, cappuccino, latte
    ESPRESSO(1.5, Volume.SMALL, true),
    AMERICANO(1.9, Volume.MIDDLE, true),
    CAPPUCCINO(2.6, Volume.MIDDLE, false),
    LATTE(2.8, Volume.LARGE, false);

    private double price;
    private Volume volume;
    private boolean strong;

    Drink(double price, Volume volume, boolean strong) {
        this.price = price;
        this.volume = volume;
        this.strong = strong;
    }

    public double getPrice() {
        return price;
    }

    public Volume getVolume() {
        return volume;
    }

    public boolean isStrong() {
        return strong;
    }
}

enum Volume {
    SMALL(50), MIDDLE(120), LARGE(200);

    private int volume;

    Volume(int volume) {
        this.volume = volume;
    }

    public int getVolume() {
        return volume;
    }
}
