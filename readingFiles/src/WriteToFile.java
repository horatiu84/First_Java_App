import java.io.FileWriter;
import java.io.IOException;

public class WriteToFile {
    /*
    Write a list of names to a text file using FileWriter.

    Steps:

    1. Create a class WriteToFile.

    2. Import java.io.FileWriter, java.io.IOException, and java.io.FileNotFoundException.

    3. Create a method writeNames that takes a String file path and a String[] names array as parameters.

    4. Inside the method, use a try-with-resources block to create a FileWriter.

    5. Write each name from the names array to the file, followed by a newline character.

    6. Catch any IOException that might occur during file writing and print an error message.

    7. Create a new class TestWriting and add a main method.

    8. In the main method, create a string with the name of the file. (Please mind, if this is an existing file it will overwrite the content.)

    9. Create an array of names.

    10. Call the writeFile() method from WriteToFile with the string of the filename.

    11. Verify the names appeared in the file.


     */

    public static void writeNames(String file,String[] names) {
        try(FileWriter writer = new FileWriter(file)) {
            for (String name:names ) {
                writer.write(name+"\n");
            }
        } catch (IOException e) {
            System.out.println("There is an error here!" + e.getMessage());
        }
    }
}
