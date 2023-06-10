import java.util.ArrayList;
import java.util.List;

public class Task1 {
    public static void main(String[] args) {
        /*
        Пусть дан произвольный список целых чисел, удалить из него четные числа
         */
        List<Integer>list = createList(10, 4, 10);
        System.out.println(list);
        removeEven(list);
        System.out.println(list);
    }
    static List<Integer> createList (int size, int min, int max){
        List<Integer> list = new ArrayList<>(size);
        for (int i= 0; i < size ; i++) {
            list.add((int)(Math.random() *(max-min+1)+min));
        }
        return list;
    }
    static List<Integer> removeEven(List<Integer>list){
        for (int i = 0; i < list.size(); i++) {
            /*
            [10, 10, 4, 7, 4, 9, 8, 10, 9, 7]
            [10, 4, 7, 4, 9, 8, 10, 9, 7]
            [4, 7, 4, 9, 8, 10, 9, 7]
            [7, 4, 9, 8, 10, 9, 7]
            [7, 9, 8, 10, 9, 7]
            [7, 9, 10, 9, 7]
            [7, 9, 9, 7]
             */
            if (list.get(i) % 2 == 0) {
                list.remove(i);
                i--;
            }
        }
        return list;
    }
}
