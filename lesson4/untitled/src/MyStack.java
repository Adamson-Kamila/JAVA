public class MyStack {
    /*
        Реализовать стек с помощью массива.
        Нужно реализовать методы:
        size(), empty(), push(), peek(), pop().
         */
    Integer[] arr = new Integer[10];
    int size = 0;

    int size(){ //возвращает количество элементов
        return size;

    }
    boolean empty(){ //метод, показывающий есть ли в нашей коллекции элементы
        return size == 0;

    }
    void push(int item){ //добавляет элемент в коллекцию
        if(size == arr.length){
            Integer[]arr2 = new Integer[arr.length + 10];
            System.arraycopy(arr, 0, arr2, 0, arr.length);
            arr = arr2;
        }
        arr[size++] = item;

    }
    int peek(){ //позволяет посмотреть элемент наверху стека, но не удалять, только посмотреть
        return arr[size-1];

    }
    int pop(){ //не только возвращает элемент массива, но и удаляет его
        return arr[--size];

    }
}


