package lesson2.practice2;

public class Main {
    public static void main(String[] args) {
        LivingSpace space = new LivingSpace(
                "Seestr.", 10, new String[]{"Bob", "Anna", "Emily"}
        );

        System.out.println(space);

        Home home = new Home("Friedrichstr.", 12, new String[]{"Bob", "Anna", "Emily"}, 4);
        System.out.println(home);

        Apartment apartment = new Apartment("Eichstr.", 30, new String[]{"Bob", "Anna", "Emily"}, 3);
        System.out.println(apartment);

    }
}