import java.util.LinkedList;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        /*
        Реализовать консольное приложение, которое:
        принимает от пользователя строку вида text-num.
        Нужно расплитить строку по ~, сохранив text в связанный список на позицию num.
        Если введено print~num, выводит строку на позицию num в связанном списке и удаляет ее из списка.

         */
        ex1();
    }

    static void ex1() {
        LinkedList<String> list = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);
        boolean work = true;
        while (work){
            System.out.println("Введите команду: ");
            String line = scanner.nextLine();
            String[] arr = line.split("~");
            int num = Integer.parseInt(arr[1]);
            String text = arr[0];
            switch (text){
                case "print":
                    System.out.println(list.remove(num));
                    break;
                case "exit":
                    System.out.println("До скорой встречи!");
                    work = false;
                    break;
                default:
                    list.add(num, text);
            }
            System.out.println();

        }
    }
}
