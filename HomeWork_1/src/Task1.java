import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        /*
        Вычислить n-ое треугольного число (сумма чисел от 1 до n)
         */
        System.out.println(Task_1());


    }
    public static int Task_1 (){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число: ");
        int num = scanner.nextInt();
        if (num == 1) {
            return 1;
        } else {
            int sum = 0;
            for (int i = 0; i <=Math.abs(num) ; i++) {
                sum = sum+i;
            }
            return sum;
        }

    }
}
