import java.util.LinkedList;

public class Task2 {
    public static void main(String[] args) {
        /*
        Реализуйте очередь с помощью LinkedList со следующими методами:
        enqueue() - помещает элемент в конец очереди, dequeue() - возвращает первый элемент из очереди и удаляет его,
        first() - возвращает первый элемент из очереди, не удаляя.
         */
        MyQueue myQueue =  new MyQueue();
        myQueue.enqueue(1);
        myQueue.enqueue(2);
        myQueue.enqueue(3);
        myQueue.enqueue(4);
        System.out.println(myQueue);
        System.out.println(myQueue.dequeue());
        System.out.println(myQueue);
        System.out.println(myQueue.first());
        System.out.println(myQueue);



    }

}
