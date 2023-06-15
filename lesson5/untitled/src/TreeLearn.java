import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class TreeLearn {
    public static void main(String[] args) {
        /*
        Взять набор строк, например,

        Мороз и солнце день чудесный
        Еще ты дремлешь друг прелестный
        Пора красавица, проснись!

        Написать метод, который отсортирует эти слова по длине с помощью TreeMap.
        Строки с одинаковой длиной не должны "потеряться".
         */
        String line = "Мороз и солнце день чудесный\n" + //Создадим строковую переменную с именем line
                "Еще ты дремлешь друг прелестный\n" +
                "Пора красавица, проснись!";
        ex3(line); //вызов метода ex3
    }
    static void ex3(String line){ //создаем метод, который не будет ничего возвращать,
        // но принимает в себя аргумент типа String с именем line

        //Используем метод replase, который уберет из строки line переносы, запятую и "!" знак,
        // для формирования массива строк. Разделение слов будет происходить по пробелам (32 строка кода -> regex).
        // (при большом количестве знаков препинаний лучше использовать regex)
        line = line.replace("\n", " "); //заменяем перенос строки на пробелы
        line = line.replace(",", ""); //избавляемся от ","
        line = line.replace("!", ""); //избавляемся от "!"
        String[] words = line.split(" "); // Объявляем массив строк, в который поместим line,
        // разделение строк будет происходить по пробелам.
        Map<Integer, List<String>> map = new TreeMap<>(); //Объявляем экземпляр класса map,
        // в котором будут находиться пары ключ:значение, где ключом будет являться длина слова (len),
        // а значением само слово
        for (String word: words) { //Объявляем цикл foreach, в котором пройдемся по String, будем возвращать
            // каждый элемент
            int len = word.length(); //Для того чтобы посчитать длину слова, объявляем переменную типа len,
            // которая будет получать длину текущего слова
            if(map.containsKey(len)){ //проверяем содержит ли map ключ с длиной len, если содержится, значит есть
                // слова с такой длиной
                List<String> list = map.get(len); //получаем список слов определенной длины из map по ключу len
                list.add(word); //добавляем слово в list
            } else { //если такого ключа нет
                List<String> list = new ArrayList<>(); //создаем новый список list
                list.add(word); //в list помещаем слово
                map.put(len, list); //в map записываем новую пару ключ:значение
            }
        }
        System.out.println(map);

    }

}
