import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/*
 Дан массив двоичных чисел, например [1,1,0,0,1,1,1], вывести максимальное количество подряд идущих 1
 */

public class Task2 {
    public static void main (String[] args) {
        int[] arr = getarr(7, 0, 1);
        System.out.println(Arrays.toString(arr));
        int rez = numb(arr);
        System.out.println(rez);
    }

    static int[] getarr(int size, int min, int max) { // создаем метод для генерации массива
        Random rnd = new Random(); //создаем объект Random, даем название переменной rnd.
        int[] arr = new int[size]; // создаем массив, выделяем память, в размере указываем размер, в нашем случае, это принимаемый аргумент size.
        for(int i = 0; i < size; i++) {  //заполняем через цикл for
            arr [i] = rnd.nextInt(min, max+1);
        }
        return arr;
    }

    static int numb(int[] arr) {
        int sum = 0; // [1, 1, 0, 0, 1, 1, 1]
        int temp = sum;  // temp = 2 sum = 1
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] ==1) {
                sum++;
            } else {
                if (temp < sum) {
                    temp = sum;

                }
                sum=0;
            }
        }
        return temp < sum ? sum : temp; // используем тернарный оператор (? = if (temp < sum)) sum (True) : temp (False)
    }


}






