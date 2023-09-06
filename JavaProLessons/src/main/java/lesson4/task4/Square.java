package lesson4.task4;

import java.util.Objects;

public class Square {
    private int sideLength;

    public Square(int sideLength) {
        this.sideLength = sideLength;
    }

    public int getSideLength() {
        return sideLength;
    }

    public void setSideLength(int sideLength) {
        this.sideLength = sideLength;
    }

    @Override
    public boolean equals(Object o) {  //среда разработки сгенерировала нам метод, сравнивающий:
        // равенство обьектов, принадлежность к одному классу и если все совпало - содержимое (длины сторон)
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Square square = (Square) o;
        return sideLength == square.sideLength;
    }

    @Override
    public int hashCode() {
        return Objects.hash(sideLength);
    }
}
