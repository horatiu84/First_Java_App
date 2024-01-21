import java.io.FileWriter;
import java.io.IOException;

public class WritingFiles {
    public static void main(String[] args) {

    try(FileWriter writer = new FileWriter("output.txt",true)) {
        writer.write("Bye now!\n");
    }catch(IOException e){
        System.out.println(e.getClass());
        System.out.println(e.getMessage());
    }
    }
}
