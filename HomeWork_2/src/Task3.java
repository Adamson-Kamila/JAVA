import java.io.IOException;
import java.util.Arrays;
import java.util.Random;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class Task3 {
    public static void main(String[] args) {
        int[]arr = new int [] {5,4,3,2,1};
        System.out.println(Arrays.toString(arr));
        getSort(arr);
        System.out.println(Arrays.toString(arr));

    }

    static int[] getArr(int size, int min, int max) {
        int[] arr = new int[size];
        Random random = new Random();
        for (int i = 0; i < size; i++) {
            arr[i] = random.nextInt(min, max+1);
        }
        return arr;
    }

    static  void getSort(int[] arr){
        /*
        [5,4,3,2,1]
        [4,5,3,2,1]  [4,3,5,2,1] [4,3,2,5,1] [4,3,2,1,5]
         */
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
        logger.log(Level.INFO, Arrays.toString(arr));
        int temp = 0;
        for (int j = 0; j < arr.length; j++) {
            for (int i = 1; i < arr.length-j ; i++) {
                if (arr[i] < arr[i-1]) {
                    temp = arr[i-1];
                    arr[i-1] = arr[i];
                    arr[i] = temp;
                }

                logger.log(Level.INFO, Arrays.toString(arr));

            }
        }
        logger.log(Level.INFO, Arrays.toString(arr));
        filesHandler.close();


    }
}
