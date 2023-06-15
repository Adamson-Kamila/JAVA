import java.util.*;

public class prime {
    /*
    Реализуйте структуру телефонной книги с помощью HashMap, учитывая, что 1 человек может иметь несколько телефонов.
     */
    public static void main(String[] args) {


        Map<String, String> phoneBook = getBook(); //Объявляем переменную phoneBook с типом данных Map<String, String>,
        // в котором вызываем метод getBook()
        Contact contact = getContact(); //Объявляем переменную contact в котором вызываем метод getContact()
        addToBook(phoneBook, contact); //Вызываем метод addToBook в который передаем переменную phoneBook(10) и
        // contact (12)
        Contact contact1 = getContact();
        addToBook(phoneBook, contact1);
        Contact contact2 = getContact();
        addToBook(phoneBook, contact2);
        System.out.println(phoneBook);

    }

    private static Contact getContact() { //Создаем Contact, в котором будет номер телефона и ФИО.
        //Создаем ФИО
        List<String> fullName = getList();//Создаем переменную fullName, в которой вызываем метод getList()
        addToList(fullName, "Фамилию");//с помощью метода addToLis добавляем в список fullName данные
        // считанные с консоли, с консоли считываем с помощью метода getString
        addToList(fullName, "Имя");
        addToList(fullName, "Отчество");
        String fullNameText = String.join(" ", fullName); //Объединяем ФИО
        //Создаем телефон
        String phone = getString("Телефон");
        return new Contact(fullNameText, phone); //создание нового экземпляра Contact и инициализация полей


    }

    private record Contact(String fullName, String phone) { //структура, хранящая поля ФИО, телефон
    }

    public static List<String> getList() {//Создаем метод getList, в котором создаем список list.
        // Метод вызываем в 25 строке
        return new ArrayList<String>(); //( тоже самое как List<String> list = new ArrayList<>(); return list;)

    }

    public static void addToList(List<String> list, String intro) {
        String surname = getString(intro);
        list.add(surname);
    }

    private static String getString(String intro) { //создаем метод для приглашения
        // к вводу в консоль и считывания с нее
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Введите %s\n", intro); // %s параметр для подстановки
        return scanner.nextLine();

    }

    public static Map<String, String> getBook() {
        return new HashMap<>();
    }

    public static void addToBook(Map<String, String> book, Contact contact) {
        book.put(contact.phone(), contact.fullName());

    }

}
