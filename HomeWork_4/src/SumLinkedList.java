import java.util.LinkedList;
import java.util.ListIterator;

public class SumLinkedList {
    public static void main(String[] args) {
        /*
        Найдите сумму всех элементов LinkedList, сохраняя все элементы в списке. Используйте итератор
         */
        LinkedList<Integer>list = list();
        System.out.println(list);
        int sum = getSum(list);
        System.out.println(sum);
    }

    static LinkedList<Integer>list(){
        LinkedList<Integer>arr_list = new LinkedList<>();
        for (int i = 0; i < 10; i++) {
            arr_list.add(i);
        }
        return arr_list;
    }
    static int getSum(LinkedList<Integer>list){
        ListIterator<Integer>listIterator = list().listIterator();
        int sum = 0;
        while (listIterator.hasNext()){
            sum += listIterator.next();
        }
        return sum;
    }


}
