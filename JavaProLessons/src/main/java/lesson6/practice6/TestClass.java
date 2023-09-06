package lesson6.practice6;

public class TestClass {
    public static void main(String[] args) throws CloneNotSupportedException {
        Coffee coffee1 = new Coffee(4, true, new Size("S", 50));
        System.out.println(coffee1);

        // Example1 через Clonable() интерфейс
//        Coffee coffee2 = coffee1.clone();

        // Example 2 через создание экземпляра на базе объекта
        Coffee coffee2 = new Coffee(coffee1);
        coffee2.setPrice(14);
        coffee2.getSize().setType("L");
        coffee2.getSize().setVol(200);
        System.out.println(coffee2);

        System.out.println(coffee1);
    }
}

class Coffee {//} implements Cloneable { // Example1
    private double price;
    private boolean strong;
    private Size size;

    public Coffee(double price, boolean strong, Size size) {
        this.price = price;
        this.strong = strong;
        this.size = size;
    }

    // Example 2 конструктор, который принимает объект
    public Coffee(Coffee coffee) {
        this(coffee.getPrice(), coffee.isStrong(), new Size(coffee.getSize()));
    }

    @Override
    public String toString() {
        return "Price: " + price + ", strong: " +
                strong + ", Size(type): " + size.getType() + ", Size(vol): " + size.getVol();
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isStrong() {
        return strong;
    }

    public void setStrong(boolean strong) {
        this.strong = strong;
    }

    // Example1
//    @Override
//    protected Coffee clone() throws CloneNotSupportedException {
//        Coffee newCoffee = (Coffee) super.clone();
//        newCoffee.size = size.clone();
//        return newCoffee;
//    }

    public Size getSize() {
        return size;
    }

    public void setSize(Size size) {
        this.size = size;
    }
}

class Size {//} implements Cloneable { Example1
    private String type;
    private int vol;

    public Size(String type, int vol) {
        this.type = type;
        this.vol = vol;
    }

    // Example 2 конструктор, который принимает объект
    public Size(Size size) {
        this(size.getType(), size.getVol());
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getVol() {
        return vol;
    }

    public void setVol(int vol) {
        this.vol = vol;
    }

    // Example1
//    @Override
//    protected Size clone() throws CloneNotSupportedException {
//        return (Size) super.clone();
//    }
}