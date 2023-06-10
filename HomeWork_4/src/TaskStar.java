public class TaskStar {
    public static void main(String[] args) {
        /*
        реализовать вторую задачу через собственный класс используя в основе массив
         */
        MyManualQueue manualQueue = new MyManualQueue();

        manualQueue.enqueue(1);
        manualQueue.enqueue(7);
        manualQueue.enqueue(4);
        manualQueue.enqueue(3);
        manualQueue.enqueue(8);
        manualQueue.enqueue(9);
        System.out.println(manualQueue);
        System.out.println(manualQueue.first());
        System.out.println(manualQueue);
        manualQueue.dequeue();
        System.out.println(manualQueue.dequeue());
        System.out.println(manualQueue);
        manualQueue.dequeue();
        System.out.println(manualQueue);
//        System.out.println(manualQueue.first());
//        System.out.println(manualQueue.first());
    }

}
