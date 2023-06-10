import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class StackExample {
    public static void main(String[] args) {
        /*
        Написать метод, который принимает массив элементов, помещает их в стек и выводит в консоль содержимое стека.
        Написать метод, который принимает массив элементов, помещает их в очередь и выводит в консоль содержимое очереди.
         */
    }
    static void ex4(){
        Stack stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        while (!stack.isEmpty()){
            System.out.println(stack.pop());
        }
        System.out.println();

        Queue<Integer> queue = new LinkedList<>();
        /*
        Можно заполнить циклом
        for (int i = 1; i < 5; i++){
        queu.add(i); просто добавляется элемент, мы не обращаемся по индексу
        }
         */
        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);
        while (!queue.isEmpty()){
            System.out.println(queue.poll());
        }
    }
}
