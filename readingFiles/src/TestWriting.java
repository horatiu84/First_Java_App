public class TestWriting {
    public static void main(String[] args) {
        String file ="testWrite.txt";

        String[] names = {"Horas","Paius","Googalge","Dodu"};

        WriteToFile.writeNames(file,names);
    }
}
