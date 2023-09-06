package lesson6.task1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListTest {
    public static void main(String[] args) {

        //============METHODS OF ArrayList: ===================
        List<Integer> numbers = new ArrayList<>();  //object of List, pod kapotom length = 10
        numbers.add(0, 5);
        numbers.add(1, 7);
        System.out.println(numbers);  // 5,7

        numbers.add(8);  //overloaded method add without indexes, push this element to the end
        numbers.add(9);  // 5,7,8,9
//        numbers.add(8,12);  //out of bonds because in our example we use only 4 elements length
        System.out.println(numbers);


        List<Integer> numbers1 = new ArrayList<>();
        numbers1.add(20);
        numbers1.add(30);
        System.out.println(numbers1);  // 20,30
        numbers1.addAll(1, numbers);  //in index 1 we add ArrayList numbers  20,5,7,8,9,30
        numbers1.addAll(numbers);  // to the end 20,5,7,8,9,30,5,7,8,9
        System.out.println(numbers1);

        int[] array = {1, 2, 3};
        addAll(numbers, array);  //thats how we can put array into List using method
        System.out.println(numbers);  //5,7,8,9,1,2,3
        addFirst(numbers, array);
        System.out.println(numbers);  //5,7,8,9,1,2,3,1

        int valueDeleted = numbers.remove(1);
        System.out.println(numbers); //delete 7 and return it   5,8,9,1,2,3,1
        System.out.println(valueDeleted); //7
        System.out.println(numbers.get(2));  //9 - print element of List with index 2
        numbers.set(1, 9);  //1 index element 8 changed on 9   5,9,9,1,2,3,1
        System.out.println(numbers);
        System.out.println(numbers.size());   //length 7
        System.out.println(numbers.isEmpty());  //false
        System.out.println(numbers.contains(1));  //true
        System.out.println(numbers.contains(7));  //false

        //======================================TRAIN=========================
        List<Integer> numbersTrain = new ArrayList<>();
        numbersTrain.addAll(numbers);  //5,9,9,1,2,3,1
        System.out.println(numbersTrain);

        changeValue(numbersTrain);  //double values
        System.out.println(numbersTrain);  //10,18,18,2,4,6,2

        List<Integer> numbersTrainNew = new ArrayList<>();
        numbersTrainNew = safeNewArray(numbersTrain);  //doubled values we save without changing original in new List
        System.out.println(numbersTrainNew);  //20,36,36,4,8,12,4

        List<Integer> numbersTrainNew2 = new ArrayList<>();
        numbersTrainNew2.add(15);
        numbersTrainNew2.add(16);
        numbersTrainNew2.add(19);
        System.out.println(numbersTrainNew2); //15,16,19
        removeEvens(numbersTrainNew2);  //delete evens  15,19
        System.out.println(numbersTrainNew2);

        //=========When changing List better not to use loops, because of unexpected mistakes,
        // ========================better - use Iterators============
        //==============!!!!!!================ITERATORS==============!!!!!!!==============

        List<String> words = new ArrayList<>();
        words.add("Hello");
        words.add("world");
        words.add("Ada");
        System.out.println(words);
        System.out.println("Summa of words is " + sumOfWords(words)); //13

    //====================================
    }  //======end of main method=========
    //====================================


    //===========static methods separate from main, but called from main==============
    private static void addAll(List<Integer> numbers, int[] array) { //put array into List using method
        for (int i : array) {   // autoboxing int -> Integer
            numbers.add(i);
        }
    }

    private static void addFirst(List<Integer> numbers, int[] array) { //put  element with index 0 of array into List using method
        if (array.length != 0) {
            numbers.add(array[0]);
        }
    }

    private static void changeValue(List<Integer> numbersTrain) {
        for (int i = 0; i < numbersTrain.size(); i++) {
            numbersTrain.set(i,numbersTrain.get(i) * 2);
        }
    }
    public static List<Integer> safeNewArray(List<Integer> list) {  //return new list
        List<Integer> newList = new ArrayList<>();
        for (Integer i: list) {
            newList.add(i*2);  //in foreach loop - i not index - its a value
        }
        return newList;
    }

    //=========When changing List better not to use loops, because of unexpected mistakes,
    // ========================better - use Iterators============
//    private static void removeEvens(List<Integer> list) {   //BETTER NOT TO MAKE LIKE THIS
//        for (int i = 0; i < list.size(); i++) {
//            if (list.get(i)%2==0) {
//                list.remove(i);
//            }
//        }
//    }
    private static void removeEvens(List<Integer> list) {  // USING ITERATOR
        Iterator <Integer> iterator = list.iterator();
        while (iterator.hasNext()) {  //if we have elements that we didnt check - return true, if nothing to check - false and out
            Integer currentElem = iterator.next();  //get next element from List
            //in variable currentElem now put first element 15 etc
            if (currentElem%2==0) {  //check element - if even - delete
                iterator.remove();
            }
        }
    }
//=====================================================
    private static int sumOfWords(List<String> words) {
        int length = 0;
        for (String value:
             words) {
            length += value.length();
        }
        return length;
    }


//==================================
}   //=====end of class ListTest===
//==================================