import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ExceptionHandeling {
    public static void main(String[] args) {
//        try {
//
//        File file = new File("sample.txt");
//        FileReader reader = new FileReader(file);
//        } catch (FileNotFoundException e) {
//            System.out.println("File not found!");
//        }

        try (FileReader reader = new FileReader("sample.txt")){

        } catch (FileNotFoundException e) {
            System.out.println("File not found!");
        } catch (IOException e) {
            System.out.println("IO Problem!");
        }

        System.out.println("Done!");

    }
}
