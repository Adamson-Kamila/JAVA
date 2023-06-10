import java.util.LinkedList;

public class MyQueue {
    /*
        Реализуйте очередь с помощью LinkedList со следующими методами:
        enqueue() - помещает элемент в конец очереди, dequeue() - возвращает первый элемент из очереди и удаляет его,
        first() - возвращает первый элемент из очереди, не удаляя.
         */

    private LinkedList<Integer> list = new LinkedList<>();
    public void enqueue(int item){

        list.addLast(item);
    }

    public Integer dequeue(){
        return list.pollFirst();

    }

    public Integer first(){

        return list.peekFirst();
    }

    @Override
    public String toString() {

        return "MyQueue" + list.toString();
    }
}
