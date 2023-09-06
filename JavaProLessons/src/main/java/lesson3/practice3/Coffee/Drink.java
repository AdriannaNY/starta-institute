package lesson3.practice3.Coffee;

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
