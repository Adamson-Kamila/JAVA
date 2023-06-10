import java.util.*;

public class Task4 {
    public static void main(String[] args) {
        /*
        Во фразе "Добро пожаловать на курс по Java" переставить слова в обратном порядке.
         */
        String lol = newArr();
        String str = "Добро пожаловать на курс по Java";
        String[] arr = str.split("\\s");
        System.out.println(Arrays.toString(arr));

        List<String> list_1 = new ArrayList<>();
        for (int i = 0; i <arr.length ; i++) {
            list_1.add(arr[i]);
        }
        Collections.reverse(list_1);
        String[] newArr =(new String[list_1.size()]);
        for (int i = 0; i < list_1.size(); i++) {
            newArr[i] = list_1.get(i);
        }
        System.out.println(Arrays.toString(newArr));
    }

    public static String newArr (){
        String newList = " ";
        String str = "Добро пожаловать на курс по Java";
        String[] arr = str.split("\\s");

        for (int i = arr.length-1; i > 0 ; i--) {
            newList += arr[i] + " ";

        }
        System.out.println(newList);
        return newList;
    }

}
