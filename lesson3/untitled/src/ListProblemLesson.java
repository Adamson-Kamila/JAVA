import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

public class ListProblemLesson {
    public static void main(String[] args) {
    createProblem();

    }
    static void createProblem(){
        /*
        Создать список типа ArrayList.
        Поместить в него как строки, так и целые числа.
        Пройти по списку, найти и удалить целые числа.
         */

        List list = new ArrayList();
        list.add(4);
        list.add("15");
        list.add("hello");
        list.add(77);
        list.add(5);
        list.add(4.5);
//        for (int i = 0; i < list.size(); i++) {
//            if (list.get(i) instanceof Integer){ /*оператор instanceof проверяет к какому типу принадлежит объект
//            например Double, String, Integer, Number*/
//                list.remove(i);
//                i--;
//            }
//        }
//        System.out.println(list);
        Iterator iterator = list.iterator(); /* еще один вариант убрать ненужные элементы через Iterator*/
        while(iterator.hasNext()){
            Object o = iterator.next();
            if (o instanceof Integer){
                iterator.remove();
            }
        }
        System.out.println(list);
    }
}
