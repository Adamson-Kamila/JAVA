public class Task_1 {
    public static void main(String[] args) {
        char c1 = 'a';
        char c2 = 'b';
        int n = 10;
        System.out.println(ex0(c1, c2, n));

    }

    static String ex0(char c1, char c2, int n) {
        /*
        Дано четное число N (>0) и символы с1 и с2.
        Написать метод, который вернет строку длины N, которая состоит из чередующихся символов с1 и с2, начиная с с1.
        Ответ: с1с2с1...с2 (всего N символов)
         */
        if ( n % 2 != 0) {
            return "Вы ввели нечетное число";
        }
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < n / 2; i++) {
            stringBuilder.append(c1);
            stringBuilder.append(c2);
        }
        return stringBuilder.toString();
    }
}
