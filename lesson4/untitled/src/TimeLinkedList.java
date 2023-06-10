import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class TimeLinkedList {
    public static void main(String[] args) {
        /*
        Замерьте время за которое в ArrayList добавляется 10000 элементов.
        Замерьте время за которое в LinkedList добавляется 10000 элементов.
        Сравните с предыдущим.
         */
        ex0();
    }
    static void ex0(){
        List<Integer> list = new ArrayList<>();
        List<Integer>list1 = new LinkedList<>();
        long timeStart = System.currentTimeMillis();
        for(int i = 0; i < 100000; i++){
            list1 .add(i);
        }
        long timeFinish = System.currentTimeMillis();
        System.out.println(timeFinish - timeStart);
    }
}
