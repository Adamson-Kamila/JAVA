import java.util.HashSet;
import java.util.Set;

public class Task {
    public static void main(String[] args) {
        /*
        Подумать над структурой класса Ноутбук для магазина техники - выделить поля и методы. Реализовать в java.
        Создать множество ноутбуков.
        Написать метод, который будет запрашивать у пользователя критерий (или критерии) фильтрации и выведет ноутбуки,
        отвечающие фильтру. Критерии фильтрации можно хранить в Map.
        Например: "Введите цифру, соответствующую необходимому критерию:"
        1 - ОЗУ
        2 - Объем ЖД
        3 - Операционная система
        4 - Цвет …
        Далее нужно запросить минимальные значения для указанных критериев -
         сохранить параметры фильтрации можно также в Map.
        Отфильтровать ноутбуки из первоначального множества и вывести проходящие по условиям.
         */
        NoteBook noteBook = new NoteBook("Lenovo", 4, 128, "windows", "gray");
        NoteBook noteBook_1 = new NoteBook("Acer",6, 240, "windows", "black");
        NoteBook noteBook_2 = new NoteBook("Apple", 8, 256, "macOS", "golden_rose");
        NoteBook noteBook_3 = new NoteBook("Apple",12, 512, "macOS", "white");
        NoteBook noteBook_4 = new NoteBook("Asus",8, 240, "linux", "gray");
        NoteBook noteBook_5 = new NoteBook("Acer", 4, 128, "windows", "gray");


        NoteSet noteSet = new NoteSet();
        noteSet.addInSet(noteBook);
        noteSet.addInSet(noteBook_1);
        noteSet.addInSet(noteBook_2);
        noteSet.addInSet(noteBook_3);
        noteSet.addInSet(noteBook_4);
        noteSet.addInSet(noteBook_5);

        forUser forUser = new forUser();
        NoteBook noteBook_6 = forUser.findNote();
        System.out.println(noteBook);



//        System.out.println(noteSet.find(noteBook_6));
        System.out.println(noteBook_5.equals(noteBook_6));














    }
}
