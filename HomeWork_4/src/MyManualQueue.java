public class MyManualQueue {
    /*
    Реализуйте очередь с помощью массива со следующими методами:
        enqueue() - помещает элемент в конец очереди, dequeue() - возвращает первый элемент из очереди и удаляет его,
        first() - возвращает первый элемент из очереди, не удаляя.
     */
    int [] arr = new int[9];
    int last = 0;
    int first = 0;

    public void enqueue(int item){

        arr [last++] = item;  //       1 5 7 3 7 0 1 2 9 ->   [0,0,0,0,0,0,0,0] first = 3
    }

    public Integer dequeue(){
        return  arr[first++];

        // [1 5 7 3 7 0 1 2 9] arr.lenght = arr.
        //  0 1 2 3 4 5 6 7 8
        // int first = 0; int last = 0
    }

    public Integer first(){
        return arr[first];
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = first; i < last; i++) {
                stringBuilder.append(arr[i]).append(" ");
        }
        return stringBuilder.toString();
    }
}
