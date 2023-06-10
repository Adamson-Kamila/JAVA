public class Task3 {
    public static void main(String[] args) {

        System.out.println(ex2("А роза упала на лапу Азора"));

    }

    static boolean ex2_1(String s){
        s = s.replace( " ", "");
        s = s.toLowerCase();
        char[] arr = s.toCharArray();
        for (int i = 0, j = arr.length-1; i < arr.length / 2; i++, j--) {
            if (arr[i] != arr[j]) {
                return false;
            }
        }
        return true;
    }


    static boolean ex2 (String s){
        /*
        Напишите метод, который принимает на вход строку (String) и определяет является ли строка палиндромом
        (возвращает boolean значение)
         Палиндром - слово или фраза, одинаково читающаяся слева направо и наоборот.
         */
        s = s.replace(" ", "");
        StringBuilder stringBuilder1 = new StringBuilder(s);
        stringBuilder1.reverse();
        return stringBuilder1.toString().equalsIgnoreCase(s);

    }
}
