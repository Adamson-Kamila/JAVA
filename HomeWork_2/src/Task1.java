

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Task1 {
    public static void main(String[] args) {
        String text = "[{\"фамилия\":\"Иванов\",\"оценка\":\"5\",\"предмет\":\"Математика\"}," +
                "{\"фамилия\":\"Петрова\",\"оценка\":\"4\",\"предмет\":\"Информатика\"}," +
                "{\"фамилия\":\"Краснов\",\"оценка\":\"5\",\"предмет\":\"Физика\"}]";


        regular(text);
        String text_json = readerFile("Students.json");
        System.out.println(text_json);
        regular2(text_json);

    }

    static void regular(String s) {
        /*
        Дана json строка [{ "фамилия":"Иванов","оценка":"5","предмет":"Математика"},
        {"фамилия":"Петрова","оценка":"4","предмет":"Информатика"},
        {"фамилия":"Краснов","оценка":"5","предмет":"Физика"}]
        Задача написать метод(ы), который распарсит строку и выдаст ответ вида:
        Студент Иванов получил 5 по предмету Математика.
        Студент Петрова получил 4 по предмету Информатика.
        Студент Краснов получил 5 по предмету Физика.
         */

        String result = s.replaceAll(":", " ");
        String result_1 = result.replaceAll("}", ".\n");
        String result_2 = result_1.replaceAll("[\\[\\]{,\"]", " ");
        String result_3 = result_2.replaceAll("фамилия", "Студент");
        String result_4 = result_3.replaceAll("оценка", "получил");
        String result_5 = result_4.replaceAll("предмет", "по предмету");
        System.out.println(result_5);
    }

    static void regular2(String s) {

        Pattern pattern = Pattern.compile(":.+?\""); //задали правило ленивый поиск
        Matcher matcher = pattern.matcher(s); //ищет (чтобы пройти по всей строке, зададим цикл)
        String[] arr = new String[3];
        int target = 0;
        while (matcher.find()) {
            String control = s.substring(matcher.start() + 2, matcher.end() - 1);
            System.out.println(control);
            arr[target++] = control;
            if (target == arr.length) {
                target = 0;
                out(arr);
            }
        }
    }

    static void out(String[] s) {
        System.out.printf("Студент %s получил %s по предмету %s.\n", s[0], s[1], s[2]);
    }

    static String readerFile(String path) {
        StringBuilder stringBuilder = new StringBuilder();
        try (FileReader fileReader = new FileReader(path)) {
            Scanner scanner = new Scanner(fileReader);
            while (scanner.hasNextLine()) {
                stringBuilder.append(scanner.nextLine());
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return stringBuilder.toString();
    }
}