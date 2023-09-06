package lesson1.practice1;

public class Main {
    public static void main(String[] args) {
        LivingSpace space = new LivingSpace(
                "Seestr.", 10, 3, new String[]{"Bob", "Anna", "Emily"}
        );

        System.out.println(space);
        space.setFloor(7);
//        space.street = null;
        space.setStreet(null);
        System.out.println(space);
    }
}