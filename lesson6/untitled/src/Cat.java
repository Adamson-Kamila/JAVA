import java.util.List;

public class Cat {
    /*
        Продумайте структуру класса Кот. Какие поля и методы будут актуальны для приложения, которое является:
        а) информационной системой ветеринарной клиники
        б)архивом выставки котов
        в) информационной системой театра кошек им. Ю. Д. Куклачева
        Можно записать в текстовом виде, необязательно реализовывать в java.

        (поля = переменные, методы = действия, которые будет совершать кошка или будем делать что-то с кошкой)
        Класс - это некая сущность, которая группирует в себе переменные и действия с этими же переменными
         */
    //Все кассы в JAVA наследуются от класса oblect

    /*
    Конструкторы это методы, которые создают объект класса
     */

    public Cat(String name, String breed, int age, String owner) { //создание конструктора (на моем буке) Fn+Alt+insert
        this.name = name;
        this.breed = breed;
        this.age = age;
        this.owner = owner;
    }

    //private это уровень доступа который делает видимость только внутри текущего класс
    //static в ООП лучше не использовать?
    private String name;
    private String breed;
    private int age;
    private String owner;
    private List<String> healthHistory;

    //создаем геттер (общее название метода), который возвращаем имя
    public String getName(){
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public int getAge(){
        return age;
    }

    @Override
    public String toString() { // метод для корректного вывода в консоль (метод возвращает текстовое
        // представление объекта)
        return "name: " + name + ", breed: " + breed + ", age: " + age + ", owner: " + owner;
        // super не к текущему объекту как this, а к родительскому
        //создадим свой вывод в консоль, убираем super и дальше по тексту, добавляем свое
        // ("name: " + name + ", breed: " + breed + ", age: " + age + ", owner: " + owner; )
    }

    @Override
    public boolean equals(Object obj) { //метод для сравнения двух объектов
        if(this == obj){
            return true;
        }
        if (!(obj instanceof  Cat)){
            return false;
        }
        Cat cat = (Cat) obj;
        return  name.equals(cat.name) && breed.equals(cat.breed) && age == cat.age && owner.equals(cat.owner);

    }

    @Override
    public int hashCode() { //hashCode это метод хранящийся в классе Object, представляет объект в виде числа
        return name.hashCode() + 7*age + 11*breed.hashCode() + 17*owner.hashCode(); //для минимизации коллизии
        // параметры доумножают

    }
    //Для JAVA все объекты разные, даже если в двух объектах одинаковые поля и одинаковые аргументы к ним.
    // Для того, что бы в Set не попадали одинаковые записи используем метод equals и hashCode.
}
