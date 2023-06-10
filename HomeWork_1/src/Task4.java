import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {

        /*
        Реализовать простой калькулятор (введите первое число, введите второе число, введите требуемую операцию, ответ)
         */
        Scanner scanner = new Scanner(System.in);
        while (true){
            System.out.println("Выберите пункт. ");
            System.out.println("1. Сложение ");
            System.out.println("2. Вычитание");
            System.out.println("3. Умножение ");
            System.out.println("4. Деление");
            System.out.println("5. Выход");
            int persone = scanner.nextInt();
            int resalt;

            if (persone == 5) {
                break;

            } else if (persone == 1) {
                System.out.println("Введите первое число: ");
                int a = scanner.nextInt();
                System.out.println("Введите второе число: ");
                int b = scanner.nextInt();
                System.out.println("a :" +a);
                System.out.println("b :" +b);
                resalt = a + b;
                System.out.println("Ответ: " + resalt);
            }
            else if (persone == 2) {
                System.out.println("Введите первое число: ");
                int a = scanner.nextInt();
                System.out.println("Введите второе число: ");
                int b = scanner.nextInt();
                System.out.println("a :" +a);
                System.out.println("b :" +b);
                resalt = a - b;
                System.out.println("Ответ: " + resalt);
            }
            else if (persone == 3) {
                System.out.println("Введите первое число: ");
                int a = scanner.nextInt();
                System.out.println("Введите второе число: ");
                int b = scanner.nextInt();
                System.out.println("a :" +a);
                System.out.println("b :" +b);
                resalt = a * b;
                System.out.println("Ответ: " + resalt);
            }
            else if (persone == 4) {
                System.out.println("Введите первое число: ");
                int a = scanner.nextInt();
                System.out.println("Введите второе число: ");
                int b = scanner.nextInt();
                if (b == 0) {
                    System.out.println("Ошибка. На 0 делить нельзя.");
                }
                System.out.println("a :" +a);
                System.out.println("b :" +b);
                resalt = a / b;
                System.out.println("Ответ: " + resalt);
            } else {
                if (persone > 6) {
                    System.out.println("Такого пункта не существует. Попробуйте еще раз.");

                }
            }


        }

    }
}
