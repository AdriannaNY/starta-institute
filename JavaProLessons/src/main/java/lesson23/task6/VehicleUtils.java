package lesson23.task6;

import java.util.List;

public class VehicleUtils {

    public static void moveVehicles(List<? extends Car> storage, List<? super Car> garage) {
        garage.addAll(storage); // storage = producer, garage = consumer, use "WildCards"
    }
}
