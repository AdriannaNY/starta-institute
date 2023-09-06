package lesson4.task3;

public class AutoBoxingMethods {
    public static void main(String[] args) {
        Integer a = 10;    //Autoboxing int (10 - primitive) -> Integer (a - reference, object)
        print(a);          //Unboxing Integer -> int

        byte b = 8;
        print((int)b);   // + явное приведение типов byte -> int, либо должен быть класс-оболочка для byte -> Byte

        Integer[] array = {7,9,22};  //Autoboxing - 3 times
        System.out.println(getSum(array));
    }



    public  static void print(int value) {
        System.out.println(value);
    }

    public static Integer getSum(Integer[] array ) {
        int sum = 0; // так как переменная локальна (внутри метода, а не в Main), то инициализируем ее сразу же тут
        for (int i = 0; i < array.length; i++) {
            sum = sum + array[i];  //primitive 0 + objects array i = unboxing -> primitive + primitive
        }
        return sum; //Autoboxing: sum=int -> Integer
    }


}
