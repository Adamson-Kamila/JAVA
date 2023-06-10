import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Collection {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        int a = 5;
//        show(list, a);
//        test(list, a);
//        show(list, a);
        int b = a++ + ++a; // 5+1+1+5 | 7+5
        System.out.println(b);
    }
    static void test(List<Integer> list, int a){
        list.add(8);
//        ++a;
        show(list,a);
    }

    static  void  show(List<Integer> list, int a){
        System.out.printf("%s, %d\n",list,a);
    }
}
