public class StackExample1 {
    public static void main(String[] args) {
        /*
        Реализовать стек с помощью массива.
        Нужно реализовать методы:
        size(), empty(), push(), peek(), pop().
         */
        ex4();
    }
    static void ex4(){
        MyStack stack = new MyStack();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(3);
        stack.push(3);
        stack.push(3);
        stack.push(3);
        stack.push(3);
        stack.push(3);
        stack.push(3);
        stack.push(3);
        System.out.println(stack.empty());
        System.out.println("Количество элементов " + stack.size());
        System.out.println(stack.pop());
        System.out.println(stack.peek());


    }
}
