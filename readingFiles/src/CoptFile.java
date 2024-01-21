import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CoptFile {
    public static void main(String[] args) {
        String source = "testWrite.txt";
        String destination ="testCopy.txt";
        try {
        copyFile(source,destination);
            System.out.println("File was copied succesfully");
        } catch (FileNotFoundException e) {
            System.out.println("Error :" + e.getMessage());
        }
    }
    /*
    Read the contents of a text file using FileReader and write the contents to a new file using FileWriter.

    Steps:

    1. Create a class CopyFile.

    2. Import java.io.FileReader, java.io.FileWriter, java.io.IOException, and java.io.FileNotFoundException.

    3. Create a method copyFile that takes two String file paths as parameters: sourcePath and destinationPath.

    4. Inside the method, use a try-with-resources block to create a FileReader for the source file and a FileWriter for the destination file.

    5. Read the contents of the source file character by character, and write each character to the destination file.

    6. Catch any IOException that might occur during file reading and writing, and print an error message.

    7. Test the functionality in a main method.
     */

    public static void copyFile(String sourcePath, String destinationPath) throws FileNotFoundException {
        try(FileReader reader = new FileReader(sourcePath);
            FileWriter writer = new FileWriter(destinationPath)) {
            int data;
            while ( (data=reader.read()) != -1) {
                writer.write( (char)data );
            }
        }catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

}
