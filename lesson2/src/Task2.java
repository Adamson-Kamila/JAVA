public class Task2 {
    public static void main(String[] args) {
        System.out.println(ex1("aaaabbbcdd"));
    }
    static String ex1(String s){
        /*
        Напишите метод, который сжимает строку.
        Пример: вход aaaabbbcdd.
        Результат: a4b3cd2
         */
        StringBuilder stringBuilder = new StringBuilder();
        char[] arr = s.toCharArray();
        int count = 1;
        for (int i = 1 ; i < arr.length; i++) {
            if (arr[i] == arr[i-1]) {
                count++;
            }else{
                stringBuilder.append(arr[i-1]);
                if (count > 1) {
                    stringBuilder.append(count);
                }
                count = 1;
            }
        }
        stringBuilder.append(arr[arr.length-1]);
        if (count > 1) {
            stringBuilder.append(count);
        }
        return stringBuilder.toString();


    }
}
