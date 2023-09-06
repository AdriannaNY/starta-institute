package lesson24.task6;

import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        // У нас есть класс, описывающий товар - Item
        // Товар должен иметь наименование и цену.
        // Создайте список товаров (штук 7)
        // Напишите метод, который в качестве аргументов принимает строку
        // для поиска и цену, а также список
        // Задача метода отфильтровать товары таким образом, чтобы результирующий
        // список содержал товары, если в имени присутствует строка поиска,
        // а также товары по цене не выше, чем та цена, которая была передана в метод
        // Запросите у пользователя строку поиска и цену, вызовите метод, передав значения туда
        // Выведите в консоль отфильтрованный список.
        // Если товаров не осталось в выборке вообще, бросьте свой кастомный эксепшн.
        // Pineapple и Apple, строка для поиска - Apple -> должны найтись оба этих товара

        List<Item> items = List.of(
                new Item("TV", 2000.59),
                new Item("Sony", 1500.50),
                new Item("Player", 700.67),
                new Item("Watches", 550.50),
                new Item("Iphone", 1200.6),
                new Item("Sega", 678.90),
                new Item("Flashdisk", 59.90),
                new Item("Disk", 125.34),
                new Item("Pineapple", 77.69),
                new Item("Apple", 27.07)
        );
        System.out.println(items);

        System.out.println("Enter item for search:");
        Scanner scanner1 = new Scanner(System.in);
        String itemName = scanner1.nextLine();

        System.out.println("Enter filter max price:");
        Scanner scanner2 = new Scanner(System.in);
        double itemPrice = scanner2.nextDouble();

        try {
            System.out.println(filter(itemName, itemPrice, items));
        } catch (NoItemsFoundException e) {
            System.out.println("Items not found");
        }
    }

    public static List<Item> filter(String name, double price, List<Item> items) throws NoItemsFoundException {
        List<Item> filteredList = items.stream()
                .filter(x -> x.getPrice() <= price &&
                        x.getName().toLowerCase().contains(name.toLowerCase()))
                .collect(Collectors.toList());

        if (filteredList.isEmpty()) throw new NoItemsFoundException(); // user exception

        return filteredList;
    }

}
