package lesson17.task3;

import java.util.ArrayList;
import java.util.List;

public class AnimalTest {

    public static void main(String[] args) {

        List<Cow> cows = new ArrayList<>();
        cows.add(new Cow());
        cows.add(new Cow());
        cows.add(new Cow());

        List<Cheetah> cheetahs = new ArrayList<>();
        cheetahs.add(new Cheetah());
        cheetahs.add(new Cheetah());
        cheetahs.add(new Cheetah());

        List<Animal> animals = new ArrayList<>();

        AnimalUtils.copy(cows, animals);
        AnimalUtils.copy(cheetahs, animals);

        for (Animal animal : animals) {
            animal.voice();
        }
    }
}
