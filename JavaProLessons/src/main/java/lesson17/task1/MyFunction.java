package lesson17.task1;

import java.util.function.Function;

// if we didn't use lambda we need this auxiliary class
public class MyFunction implements Function<Double, Long> {
    @Override
    public Long apply(Double aDouble) {
        return Math.round(aDouble);
    }
}
