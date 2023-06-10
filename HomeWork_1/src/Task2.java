public class Task2 {
    public static void main(String[] args) {
        /*
        Вычислить n! (произведение чисел от 1 до n)
         */
        System.out.println(Task2(5));
    }
    public static int Task2 (int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * Task2(n-1);
    }
}
