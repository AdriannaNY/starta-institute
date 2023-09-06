package lesson23.task7;

import java.util.ArrayList;
import java.util.List;

public class Box<T extends Fruit> {

    List<Fruit> boxFruit = new ArrayList<>();

    public void add(T t) {
        boxFruit.add(t);
    }

    public boolean compare(Box<? extends Fruit> box) {
        if (box.getWeight() == this.getWeight()) {
            return true;
        } else {
            return false;
        }
    }

    public float getWeight() {
        if (boxFruit.isEmpty()) return 0;
        return boxFruit.size() * boxFruit.get(0).weight;
    }

    public void move(Box<T> newBox) {
        this.boxFruit.addAll(newBox.boxFruit);
        newBox.boxFruit.clear();
    }

}
