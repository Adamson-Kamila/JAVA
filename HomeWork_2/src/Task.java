import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task {
    public static void main(String[] args) {
        /*
        Дана строка sql-запроса "select * from students where ". Сформируйте часть WHERE этого запроса,
        используя StringBuilder. Данные для фильтрации приведены ниже в виде json-строки.
        Если значение null, то параметр не должен попадать в запрос.
        Параметры для фильтрации: {"name":"Ivanov", "country":"Russia", "city":"Moscow", "age":"null"}
         */

        String data = Task1.readerFile("Students_1.json");
        String query = sqlQuery(data);
        System.out.println(query);
    }
    static String sqlQuery(String filter) {
        String sqlQuery = "SELECT * FROM students";
        if (filter == null || filter.equals("")) {
            return sqlQuery;
        }
        Map<String, ArrayList<String>> fieldsValues = new HashMap<>();
        Pattern pattern = Pattern.compile("\"(.*?)\":\"(.*?)\"");
        Matcher matcher = pattern.matcher(filter);
        while (matcher.find()) {
            String field = matcher.group(1);
            String value = matcher.group(2);
            if (value.equals("null")) {
                continue;
            }
            if (fieldsValues.containsKey(field)) {
                ArrayList<String> foo = fieldsValues.get(field);
                if (!foo.contains(value)) { //если значение полученное по ключу НЕ СОДЕРЖИТ
                    foo.add(value);
                }
            } else {
                ArrayList<String> arrayList = new ArrayList<>();
                arrayList.add(value);
                fieldsValues.put(field,arrayList);
//                fieldsValues.put(field, new ArrayList<>() {{add(value);}});  //тоже самое с 66 по 68 строку
            }
        }
        if (fieldsValues.size()==0) {
            return sqlQuery;
        }
        StringBuilder stringBuilder = new StringBuilder(sqlQuery);
        stringBuilder.append(" WHERE ");
        for (Map.Entry<String, ArrayList<String>> row:
                fieldsValues.entrySet()) {
            stringBuilder.append("students.")
                    .append(row.getKey());
            ArrayList<String> value = row.getValue();
            if (value.size()>1) {
                stringBuilder.append(" IN (");
                for (String string:
                     value) {
                    stringBuilder.append(String.format("'%s', ",string));
                }
                int length = stringBuilder.length();
                stringBuilder.replace(length-2, length-1, ")");
            } else {
                stringBuilder.append(String.format(" = %s",value.get(0)));
            }
            stringBuilder.append("AND ");

        }
        int length = stringBuilder.length();
        stringBuilder.replace(length-4, length-1, ";");
        return stringBuilder.toString();
    }
}