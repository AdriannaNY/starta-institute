package lesson23.task6;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Honda> hondaCars = List.of(new Honda(), new Honda(), new Honda());
        List<Vehicle> hangar = new ArrayList<>(); // common hangar for all kind of vehicles

        hangar.add(new Honda());

        VehicleUtils.moveVehicles(hondaCars, hangar);
        System.out.println(hangar);
        // [lesson23.task6.Honda@279f2327, lesson23.task6.Honda@2ff4acd0, lesson23.task6.Honda@54bedef2, lesson23.task6.Honda@5caf905d]
    }
}
