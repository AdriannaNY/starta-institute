package task2;

public class Phone {
    private long number;
    private String model;
    private int weight;
    private String name;

    public Phone(long number, String model, int weight, String name) {
        this.number = number;
        this.model = model;
        this.weight = weight;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Number: " + number + "; model: " + model + "; weight: " + weight;
    }

    void receiveCall() {
        System.out.println("Звонит " + name);
    }
    public long getNumber() {
        return number;
    }
}
