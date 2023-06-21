import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Task2 {
    public static void main(String[] args) {
        /*
        1. Напишите метод, который заполнит массив из 1000 элементов случайными цифрами от 0 до 24
        2. Создайте метод, в который передаться заполненный выше массив и с помощью Set вычислите процент уникальных
        значений в данном массиве и верните его в виде числа с плавающей запятой.
         Для вычисления % используйте формулу:
        процент уникальных чисел = количество уникальных чисел * 100 / общее количество чисел в массиве.

         */
        Integer[] arr = createArray(1000, 0, 24); //вызываем заполненный массив
//        System.out.println(Arrays.toString(arr));// Выводим в консоль :D
        double unicPercent = unicPercent(arr);
        System.out.println("Процент уникальости равен = " + unicPercent);
    }
    static double unicPercent(Integer[] arr){
        Set<Integer> set = new HashSet<>(Arrays.asList(arr));
        double unicPercent = set.size() * 100.0 / arr.length;
        return unicPercent;

    }
    static Integer [] createArray(int len, int min, int max){ //создаем метод, который вернет нам заполненный массив
        // типа Integer. Метод принимает в себя размер массива, min и max значения
      Integer[] arr = new Integer[len]; // Объявляем о создании массива, даем название arr, передаем ему значение len
        for (int i = 0; i < len; i++) { //Объявляем цикл, который пройдет по пустому массиву и заполнит его рандомно
            // числами от 0 до 24 в количестве 1000 элементов
            arr[i] = (int)(Math.random() * (max - min +1) + min);  //Заполняем массив с помощью метода Math.random()
        }
        return arr; //возвращаем заполненный массив
    }


}
