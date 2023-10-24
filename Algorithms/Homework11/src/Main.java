
public class Main {

    //  1 уровень сложности: Вызов лифта:
    // В доме два лифта.
    //
    // Реализовать алгоритм отправки наиближайшего на вызывающий этаж.
    // Алгоритм будет применяться в домах разной этажности.
    // *Алгоритм будет применяться в домах с количеством > 2 лифтов
    //
    // Пример:
    // в доме 19 этажей
    // работают лифт А и лифт В
    // лифт А находится на 0 этаже
    // лифт В находится на 8 этаже
    // лифт C находится на 7 этаже
    // на вход: 1
    // отправляем лифт А

    public static int elevator(int[] arr, int num) {

        int minDistance = Integer.MAX_VALUE;
        int index = -1;
        for (int i = 0; i < arr.length; i++) {
            if (Math.abs(arr[i] - num) < minDistance) {
                minDistance = Math.abs(arr[i] - num);
                index = i;
            }
        }
        return index;
    }

    public static void main(String[] args) {

        int[] array = {10, 20, 30, 40};
        int number = 26; // We have to send the elevator C to the passenger
        String elevatorLetter = Character.toString((char) (65 + elevator(array, number)));
        System.out.println("We have to send the elevator " + elevatorLetter + " to the passenger");
    }
}