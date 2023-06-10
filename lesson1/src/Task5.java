public class Task5 {
    public static void main(String[] args) {
        /*
        Реализовать функцию возведения числа "а" в степень "b". "a" и "b" - целые числа. Сводя выполняемое
        количество действий к минимуму.
        Пример: a = 3, b = 2 - ответ: 9
        Пример: a = 2, b = -2 - ответ: 0,25
        Пример: a = 3, b = 0 - ответ: 1
         */
        System.out.println(level(2, -2));
        System.out.println(level_1(2, -2));

    }
    static double level (int a, int b) {
        if (a == 1 || b == 0) {
            return 1;
        }
        if (a == 0) {
            return 0;
        }
        double res = 1;
        for (int i = 0; i < Math.abs(b); i++) {
            res*=a; //res = res*a

        }
        return b>0 ? res:1.0/res;
    }
    static double level_1(int a, int b){
        if (a == 1 || b == 0) {
            return 1;
        }
        if (a == 0) {
            return 0;
        } else {
            return Math.pow(a, b);

        }
    }

}
