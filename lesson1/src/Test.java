import java.time.LocalTime;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Task1();
    }

    static void Task1 (){
        /*
        В консоли запросить имя пользователя. В зависимости от текущго времени, вывести приветствие вида
        "Доброе уро, <Имя>!", если время от 05:00 до 11:59
        "Добрый день, <Имя>!", если время от 12:00 до 17:59
        "Добрый вечер, <Имя>!", если время от 18:00 до 22:59
        "Доброй ночи, <Имя>!", если время от 23:00 до 04:59
         */
        System.out.println("Как вас зовут?");
        Scanner scanner = new Scanner(System.in); // Объект Scanner позволяет считывать данные из различных источников ввода
        String name = scanner.nextLine(); //считывает строку, введенную пользователем в консоль и сохраняем ее в переменную 'name'
        LocalTime time = LocalTime.now(); // узнаем текущее время на компьютере
        int hour = time.getHour(); // получаем значения времени из объекта time
        if (hour >=5 && hour< 12){
            System.out.println("Доброе утро, " + name + "!");
        } else if (hour >=12 && hour< 18) {
            System.out.println("Добрый день, " + name + "!");
        } else if (hour >=18 && hour< 23) {
            System.out.println("Добрый вечер, " + name + "!");
        } else {
            System.out.println("Доброй ночи, " + name + "!");
        }
    }
}



