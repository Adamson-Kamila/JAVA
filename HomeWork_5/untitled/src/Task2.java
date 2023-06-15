import java.util.*;

public class Task2 {
    public static void main(String[] args) {
         /*
        Пусть дан список сотрудников: Иван Иванов, Светлана Петрова, Кристина Белова, Анна Мусина,
        Анна Крутова, Иван Юрин, Петр Лыков, Павел Чернов, Петр Чернышов, Мария Федорова, Марина Светлова,
         Мария Савина, Мария Рыкова, Марина Лугова, Анна Владимирова, Иван Мечников, Петр Петин, Иван Ежов.
         Написать программу, которая найдет и выведет повторяющиеся имена с количеством повторений.
         Отсортировать по убыванию популярности. Для сортировки использовать TreeMap.
         */
        List<String> list = new ArrayList<>(Arrays.asList( //создаем переменную list с типом данных List<String>,
                // в который с помощью метода asList класса Arrays добавляем список сотрудников
                "Иван", "Иванов",
                "Светлана", "Петрова",
                "Кристина", "Белова",
                "Анна", "Мусина",
                "Анна", "Крутова",
                "Иван", "Юрин",
                "Петр", "Лыков",
                "Павел", "Чернов",
                "Петр", "Чернышов",
                "Мария", "Федорова",
                "Марина", "Светлова",
                "Мария", "Савина",
                "Мария", "Рыкова",
                "Марина", "Лугова",
                "Анна", "Владимирова",
                "Иван", "Мечников",
                "Петр", "Петин",
                "Иван", "Ежов"));

        System.out.println(list);
        get_treemap(list); //вызываем метод get_treemap

    }

    public static void get_treemap(List<String> list) { //создаем метод, который принимает в себя list
        TreeMap<Integer, List<String>> map = new TreeMap<>(Comparator.reverseOrder()); //Создаем экземпляр класса map
        // С типом данных TreeMap<Integer, List<String>>. Компаратор разворачивает список.
        for (String item : list) { //объявляем цикл foreach, в котором пройдемся по элементам item в списке list
            Integer count = 0; //Объявляем переменную count который будет считать количество повторяющихся имен
            for (String object : list) { //Объявляем второй цикл foreach в котором мы пройдемся
                // по элементам (object) в list сравнивая элементы друг с другом
                if (item == object) { //если элемент в первом цикле равен второму, то добавляем count (46 строка)
                    count++;
                }
            }
            if (count == 1) { //Уникальные элементы, по условию задачи нас не интересуют, поэтому мы их пропускаем.
                continue;
            } else if (map.containsKey(count)) { //проверяем, если map содержит ключ, значит он содержит значения.
                List<String> value = map.get(count); //получаем список имен полученных по ключу count
                if (!value.contains(item)) { //если список value не содержит item, то добавляем его
                    // в список value (54 строка)
                    value.add(item);
                }
            } else {
                List<String> value = new ArrayList<>(); //создаем переменную value
                value.add(item); //если ключа нет, то добавляем его и значения (60 строка)
                map.put(count, value);
            }


        }
        System.out.println(map);


    }
}