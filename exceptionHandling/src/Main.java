public class Main {
    public static void main(String[] args) {
        try {
            print("Hello everyone");
        } catch (WrongInputException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("Done!");
    }

    public static void print(String s) throws WrongInputException {
        if(s.length() <10) {
            System.out.println(s);
        } else {
            throw new WrongInputException("The string is too long");
        }
    }
}