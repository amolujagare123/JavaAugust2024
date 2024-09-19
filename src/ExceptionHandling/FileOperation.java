package ExceptionHandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class FileOperation {

    public static void main(String[] args) {

        try {
            FileInputStream fis = new FileInputStream("D:\\amol1.txt");
        }
        catch (Exception e)
        {
            System.out.println(" file is not read");
        }
        System.out.println("Program completes ");
    }
}
