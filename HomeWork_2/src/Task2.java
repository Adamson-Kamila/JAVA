import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task2 {
    public static void main(String[] args) {
        String text = "{\"name\":\"Ivanov\", \"country\":\"Russia\", \"city\":\"Moscow\", \"age\":\"null\"}";

        sqlText(text);

    }

    public static void sqlText(String text) {

        /*
        Дана строка sql-запроса "select * from students where ". Сформируйте часть WHERE этого запроса,
        используя StringBuilder. Данные для фильтрации приведены ниже в виде json-строки.
        Если значение null, то параметр не должен попадать в запрос.
        Параметры для фильтрации: {"name":"Ivanov", "country":"Russia", "city":"Moscow", "age":"null"}
         */
        Pattern pattern = Pattern.compile(":.+?\"");
        Matcher matcher = pattern.matcher(text);
        String[] newText = new String[4];
        String targets = "{Ivanov, Russia, Moscow}";
        int index = 0;
        while (matcher.find()) {
            String control = text.substring(matcher.start() + 2, matcher.end() - 2);
            if (control.equals(targets)) {
                newText[index++] = control;
                System.out.println(control);

            }


        }

    }


}
