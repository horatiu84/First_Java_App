import java.io.FileReader;
import java.io.IOException;

public class ReadFromFile {
    /*
    Read the contents of a text file and print the contents to the console using FileReader.

    Steps:

    1. Create a class ReadFromFile.
    2. Import java.io.FileReader, java.io.IOException, and java.io.FileNotFoundException.
    3. Create a method readFile that takes a String file path as a parameter.
    4. Inside the method, use a try-with-resources block to create a FileReader.
    5. Read the contents of the file character by character and print each character.
    6. Catch any IOException that might occur during file reading and print an error message.
    7. Create a new class TestReading and add a main method.
    8. Add a test input file on the root of the project (same level as src and target).
    9. In the main method, create a string with the name of the file.
    10. Call the readFile() method from ReadFromFile with the string of the filename.

     */

    public static void readFile(String file) {
        try(FileReader fileReader = new FileReader(file)) {
            int data;
            while ( (data= fileReader.read()) != -1) {
                System.out.print((char) data);
            }
        }catch (IOException e) {
            System.out.println("We have some error!");
        }
    }


}
