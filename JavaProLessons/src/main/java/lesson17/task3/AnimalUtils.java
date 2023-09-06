package lesson17.task3;

import java.util.List;
public class AnimalUtils {

    // ? means that we don't know type of extended class (Cow or Cheetah), also LandAnimal
    // and don't know type of super class (Animal or Object - super class of Animal and all other classes), also LandAnimal
    public static void copy(List<? extends LandAnimal> source, List<? super LandAnimal> target) {
//        for (LandAnimal currentAnimal : source) {
//            target.add(currentAnimal);
//        }
        target.addAll(source);

    }
}
