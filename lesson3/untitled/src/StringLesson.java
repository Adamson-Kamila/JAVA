public class StringLesson {
    public static void main(String[] args) {
        ex_0();

    }
    static void ex_0(){
        // Даны следующи строки, сравнить их с помощью метода equals() класса Object
        String s1 = "Hello";
        String s2 = "Hello";
        String s3 = s1;
        String s4 = "H"+"e"+"l"+"l"+"o";
        String s5 = new String("Hello");
        String s6 = new String(new char[]{'H', 'e', 'l', 'l', 'o'});
        System.out.println(s1 == s2);  // если сравнивать с помощью ==, то 14,15,16 строка будет true
        System.out.println(s1 == s3);  // 17, 18, в свою очередь false, так как знак == сравнивает ссылки
        System.out.println(s1 == s4);
        System.out.println(s1 == s5);
        System.out.println(s1 == s6);

        System.out.println(s1.equals(s2)); // при сравнении с помощью equals() все будет true, так как equals() сравнивает
        System.out.println(s1 == s2);      // значения

        System.out.println(s1.hashCode());



    }

}
