import java.util.ArrayList;
import java.util.List;

public class TwoArrayLesson {
    public static void main(String[] args) {
         /*
        Каталог товара магазина сохранен в виде двумерного списка List<ArrayList<String> так,
        что на 0 позиции каждого внутреннего списка содержится название жанра,
        а на остальных позициях - название книг. Напишите метод для заполнения данной структуры.

        //Фентези, Гарри Поттер, Властелин колец
        //Сказки, Колобок, Репка
        //Роман, Ешь, молись, люби
        //Психология, Про детей
         */

        List<List<String>> shopBook = new ArrayList<>();
        addBook(shopBook, "фентези", "Гарри Поттер");
        addBook(shopBook, "фентези", "Властелин колец");
        addBook(shopBook, "роман", "Ешь, молись, люби");
        addBook(shopBook, "сказки", "Колобок");
        addBook(shopBook, "психология,", "Про детей");
        addBook(shopBook, "сказки", "Репка");
        System.out.println(shopBook);
    }
    static void addBook(List<List<String>> shopBook, String genre, String name){
        for (int i = 0; i < shopBook.size(); i++) {
            if(shopBook.get(i).get(0).equalsIgnoreCase(genre)){
                shopBook.get(i).add(name);
                return;
            }
        }
        List<String>list = new ArrayList<>();
        list.add(genre);
        list.add(name);
        shopBook.add(list);

    }
}
