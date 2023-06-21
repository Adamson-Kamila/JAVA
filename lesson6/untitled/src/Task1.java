import java.util.*;

public class Task1 {
    public static void main(String[] args) {
        /*
        1. Создайте HashSet, заполните его следующими числами: {3,2,6,1,2,4,5,3}.
        Распечатайте содержимое данного множества.
        2. Создайте LinkedHashSet, заполните его следующими числами: {3,2,6,1,2,4,5,3}.
        Распечатайте содержимое данного множества.
        3. Создайте TreeSet, заполните его следующими числами: {3,2,6,1,2,4,5,3}.
        Распечатайте содержимое данного множества.
         */
        ex1();
    }
    static void ex1(){
        Integer[]arr = new Integer[]{3,2,6,1,2,4,5,3};
        Set<Integer>set1 = new HashSet<>(Arrays.asList(arr));
        Set<Integer>set2 = new LinkedHashSet<>(Arrays.asList(arr)); //запоминает элементы в порядке добавления
        Set<Integer>set3 = new TreeSet<>(Arrays.asList(arr));

        //Все коллекции Set хранят только уникальные значение без дубликатов.
        System.out.println(set1); // [1, 2, 3, 4, 5, 6]
        System.out.println(set2); // [3, 2, 6, 1, 4, 5]
        System.out.println(set3); // [1, 2, 3, 4, 5, 6]
    }
}
