package lesson3.task1;

public class Test {
    public static void main(String[] args) {
        Day day = Day.WEDNESDAY;
        showDay(day); // Method showDay we made static so we can call it from psvm
        Day day2 = Day.SUNDAY;
        showDay(day2);


        switch (day) {
            case MONDAY: {
                System.out.println("Today is Monday");
                break;
            }
            case TUESDAY: {
                System.out.println("Today is Tuesday");
                break;
            }
            case WEDNESDAY: {
                System.out.println("Today is Wednesday");
                break;
            }
            case THURSDAY: {
                System.out.println("Today is Thursday");
                break;
            }
            case FRIDAY: {
            }
            case SATURDAY: {
                System.out.println("Today is Friday or Saturday");
                break;
            }
            case SUNDAY: {
                System.out.println("Today is Sunday");
                break;
            }
        }

        System.out.println(day.ordinal());

        Day day3 = day.valueOf("WEDNESDAY");
        System.out.println(day3);

        Day[] array = Day.values();
        System.out.println(array);
//        for (int i = 0; i < array.length; i++) {
//            System.out.println(day2[i]);
//        }
        for (Day day5: array) {
            System.out.println(day5);
        }
    }

    //====================================
    public static void showDay(Day day) {
        if (day.ordinal() < 5) {
            System.out.println("It's working day");
        } else {
            System.out.println("It's weekend");
        }
    }
}
