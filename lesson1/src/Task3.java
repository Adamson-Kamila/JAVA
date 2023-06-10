import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Task3 {
    public static void main(String[] args) {
        /*
        Дан массив arr = [3,2,5,3] и число num = 3. 1 = [3, 3] 2 = [2,5]
        Если в массиве есть числа, равные заданному num, нужно перенести эти значения в конец массива.
        Таким образом, первые несколько (или все) элементов массива должны быть отличны от заданного, а остальные равны ему.
         */
        int [] arr = getArr(7, 1, 9);
        System.out.println(Arrays.toString(arr));
        int [] res = arr_res(arr, 4);
        System.out.println(Arrays.toString(res));
    }
    static int[] getArr (int size, int max, int min) { // в методе getArr массив заполняется рандомными значениями
        Random random = new Random();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = random.nextInt(max, min);

        }
        return arr;
    }

    static int[] arr_res(int[] arr,int vol) {
        /*
        Создаем метод arr_res, который принимает в себя такие аргументы: массив и значение vol.
        Так как, массив в Java неизменяемый, то создадим два пустых списка, в один список будем добавлять значения из
        массива arr которые равны vol, во второй список будем добавлять остальные. Потом, с помощью метода add.All
        в конец списка list_2 добавляем значения из list_1. Следующим шагом, мы создаем пустой массив, который, с помощью
        цикла for заполним значениями из списка list_2
         */
        List<Integer> list_1 = new ArrayList<>();
        List<Integer> list_2 = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == vol) {
                list_1.add(arr[i]);
            } else {
                list_2.add(arr[i]);
            }
        }
//        System.out.println(list_1);
//        System.out.println(list_2);

        list_2.addAll(list_1);
        int[] res_arr = (new int[list_2.size()]);

        for(int i = 0; i <list_2.size(); i++) {
            res_arr[i] = list_2.get(i);
        }

        return res_arr;
    }


}
