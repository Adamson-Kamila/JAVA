import java.util.HashSet;
import java.util.Set;

public class Task3 {
    public static void main(String[] args) {
        /*
        Продумайте структуру класса Кот. Какие поля и методы будут актуальны для приложения, которое является:
        а) информационной системой ветеринарной клиники
        б)архивом выставки котов
        в) информационной системой театра кошек им. Ю. Д. Куклачева
        Можно записать в текстовом виде, необязательно реализовывать в java.

        1. Реализуйте 1 из методов класса Cat из предыдущего задания, можно использовать не все предложенные поля и
        методы. (с 20 по 25 строка кода в классе Cat)
        2. Создайте несколько экземпляров этого класса, выведите их в консоль. (17, 18 строка)
        3. Добейтесь того, чтобы при выводе в консоль объекта типа Cat, выводилась его кличка, цвет и возраст
        (или другие параметры на ваш выбор). (Создала метод toString в классе Cat 44 строка)
         */

        Cat cat = new Cat("Мурзик", "Мейнкун", 3, "хозяин");
        Cat cat1 = new Cat("Мурка", "Бенгальская", 2, "хозяин");
        Cat cat2 = new Cat("Мурка", "Бенгальская", 2, "хозяин");
        Cat cat3 = new Cat("Пушистик", "Персидская", 3, "хозяин");

//        System.out.println(cat.getName()); //Так как поля в классе Cat закрыты с помощью private,
        // напрямую мы к ним обратиться не сможем, поэтому для того, чтобы, например,
        // получить имя кошки, мы, создаем в классе Cat метод getName. И уже через экземпляр класса вызываем
        // нужный нам метод.
        cat.setName("Мурзик");
//        System.out.println(cat.getName());
//        System.out.println(cat); //Cat@5f184fc6
//        System.out.println(cat); // name: Мурзик, breed: Мейнкун, age: 3, owner: хозяин (после того как создали метод
        // public String toString() )
//        System.out.println(cat1);
//        System.out.println(cat2.equals(cat1));
        Set<Cat> cats = new HashSet<>();
        cats.add(cat);
        cats.add(cat1);
        cats.add(cat2);
        cats.add(cat3);
//        for (Cat catAll: cats) {
//            System.out.println(catAll);
//        }
        for (Cat catAll1: cats) {
            if(catAll1.getAge() == 3){
                System.out.println(catAll1);
            }


        }


    }
}