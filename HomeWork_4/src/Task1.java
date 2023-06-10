import java.util.LinkedList;
import java.util.ListIterator;

public class Task1 {
    public static void main(String[] args) {
        /*
      Пусть дан LinkedList с несколькими элементами.
      Реализуйте метод, который вернет “перевернутый” список.
      Постараться не обращаться к листу по индексам.
         */
        LinkedList<Integer> list1 = ex1();
        System.out.println(list1);
        LinkedList<Integer> list2 =  ex2(list1);
        System.out.println(list2);
    }
static LinkedList<Integer> ex1(){
    LinkedList<Integer> linkedList = new LinkedList<>();
    for (int i = 0; i < 10; i++) {
        linkedList.add(i);
    }

    return linkedList;
}
static LinkedList<Integer> ex2(LinkedList<Integer>linkedList){
    ListIterator<Integer>listIterator = linkedList.listIterator(linkedList.size());
    LinkedList<Integer> list = new LinkedList<>();
    while (listIterator.hasPrevious()){
        list.add(listIterator.previous());
    }
    return list;
}

}
