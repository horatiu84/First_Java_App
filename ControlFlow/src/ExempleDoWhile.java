import java.util.Scanner;

public class ExempleDoWhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input;

        do {
            System.out.println("Enter yout name:");
            input = scanner.nextLine();
        } while (input.length() <2);
    }
}
