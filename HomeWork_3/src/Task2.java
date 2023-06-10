import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Task2 {
    public static void main(String[] args) {
        /*
        Задан целочисленный список ArrayList. 
        Найти минимальное, максимальное и среднее арифметическое из этого списка. Collections.max()
         */
        List<Integer> list = listFeel(5, 1, 5);
        System.out.println(list);
        List<Integer>minMaxMiddle = getMinMaxMiddle(list);
        System.out.println(minMaxMiddle);

    }

    static List<Integer> listFeel(int size, int min, int max) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            list.add((int) (Math.random() * (max - min + 1) + min));
        }
        return list;
    }

    static List<Integer> getMinMaxMiddle(List<Integer>list)

    {
        List<Integer>templist = new ArrayList<>();
        int min = Collections.min(list);
        templist.add(min);
        int max = Collections.max(list);
        templist.add(max);

        int sum = 0;
        for (int number : list) {
            sum += number;
        }
        double middle = (double) sum / list.size();
        templist.add((int) middle);
        return templist;
    }

}

