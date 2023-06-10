import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class readerFile {
    public static void main(String[] args) {
        File file = new File("File.txt");
        Scanner scanner = null;
        try {
            scanner = new Scanner(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        String res = "";
        while (scanner.hasNext()){
            res += scanner.nextLine()+ "\n";
        }
        System.out.println(res);
    }
}
