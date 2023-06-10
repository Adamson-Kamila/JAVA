import java.awt.desktop.OpenFilesHandler;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class Task4 {
    public static void main(String[] args) {

        ex_3("Test", 20);
    }
    static void ex_3 (String s, int n){
        /*
        Напишите метод, который составит строку, состоящую из 100 повторений слова TEST
        и метод, который запишет эту строку в простой текстовый файл, обработайте исключения.
         */
        String s1 = repeatString(s, n);
        saveToFile(s1);
    }

    static void saveToFile (String s){
        Logger logger = Logger.getAnonymousLogger();
        FileHandler filesHandler = null;
        try {
            filesHandler = new FileHandler("log.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }
        SimpleFormatter formatter = new SimpleFormatter();
        filesHandler.setFormatter(formatter);
        logger.addHandler(filesHandler);
        String path = "agdfg/test.txt";
        try (FileWriter fileWriter = new FileWriter(path, true)){ /*ресурсный блок try (передаются объекты,
        которые мы можем закрыть) */
            fileWriter.write(s);
            fileWriter.flush();
        } catch (Exception e){
            e.printStackTrace();
            logger.log(Level.WARNING, e.getMessage());
        }
        System.out.println("Test");
        filesHandler.close();

    }

    static String repeatString(String s, int n){
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < n; i++) {
            stringBuilder.append(s);
            stringBuilder.append("\n");

        }
        return stringBuilder.toString();
    }
}
