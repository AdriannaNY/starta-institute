package lesson2.practice2;

class Apartment extends LivingSpace {

    private int floor;

    public Apartment(String street, int builder, String[] family, int floor) {
        super(street, builder, family);
        this.floor = floor;
    }

    @Override
    public String toString() {
        return "[Apt] " + super.toString() + "; floor: " + floor;
    }
}
