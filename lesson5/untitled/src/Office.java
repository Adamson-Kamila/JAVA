import java.util.HashMap;
import java.util.Map;
import java.util.SplittableRandom;

public class Office { //создается класс (это объект, который имеет в себе описание полей и методов)
    private Map<String, String> map = new HashMap<>(); // (создается экземпляр класса/объекта HashMap)
    // создаем структуру, в ней, ниже, будем создавать методы по управлению структурой.

    void add(String numPassports, String lastName){ // создаем метод, который будет принимать в себя данные
        // в нашем случае - это номер паспортов и фамилии сотрудников.

        map.put(numPassports, lastName); // метод put добавляет пару ключ:значение (numPassports:lastName)
    }

     String getByNumPassport(String numPassport){ //метод принимает в себя строку с номером паспорта
        return numPassport + ": " + map.get(numPassport); //возвращает значение типа String
         //метод возвращает номер паспорта + фамилию, которую мы получаем с помощью get, в который передаем номер паспорта
     }

     String getByLastName(String lastName){ //создаем метод, который будет выводить список сотрудников по фамилии
        //метод принимает в себя фамилию
        StringBuilder stringBuilder = new StringBuilder(); //создаём StringBuilder, в который будет добавляться пара
         // ключ значение.
         for (Map.Entry<String, String> entry: map.entrySet()) { //объявляем цикл foreach, в котором пройдем по map.
             //в <> указываем тип ключа и тип значения, даем имя переменной цикла, после : обращаюсь к методу entrySet,
             //который возвращает множество пар ключ значение.
             if (entry.getValue().equals(lastName)){ //вызываем метод getValue который вернет значение текущей пары,
                 // с помощью equals мы сравниваем значение пары с передаваемым параметром, если значение совпадает, то
                 //добавляем данные пары (ключ:значение) в StringBuilder
                 stringBuilder.append(entry.getKey());
                 stringBuilder.append(": ");
                 stringBuilder.append(entry.getValue());
                 stringBuilder.append("\n");
             }
         }
         if (stringBuilder.length() == 0) { //если в map не будет содержаться такого значения, то StringBuilder будет
             //пустым, следовательно, вернем строку "Записей, нет."
             return "Записей, нет. ";
         }
         return stringBuilder.toString();
     }
     String getAllList(){ //создаем метод, который вернет весь список сотрудников
         StringBuilder stringBuilder = new StringBuilder(); //создаём StringBuilder, в который будет добавляться пара
         // ключ значение.
         for (Map.Entry<String, String> entry:map.entrySet()) { //объявляем цикл foreach, в котором пройдем по map.
             // в <> указываем тип ключа и тип значения, даем имя переменной цикла, после : обращаюсь к методу entrySet,
             //который возвращает множество пар ключ значение.
             stringBuilder.append(entry.getKey());
             stringBuilder.append(": ");
             stringBuilder.append(entry.getValue());
             stringBuilder.append("\n");
         }

        return  stringBuilder.toString(); //toString преобразовывает объект в строку.

     }
     String getAllList2(){ //еще один вариант метода возврата списка сотрудников
        //без объявления foreach
        return map.toString(); //методом toString преобразовываем объект в строку.
     }
}
