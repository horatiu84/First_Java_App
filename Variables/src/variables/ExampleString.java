package variables;

public class ExampleString {
    public static void main(String[] args) {


        //STRINGS : not primitives

        String multi = """
                Hi, this is a multiline String.
                It's a loveley syntax.
                """;
        System.out.println(multi);

        String s = "hi";
        String s1 = "hello";

        // how to compare two strings ( since they are objects)

        boolean same = s.equals(s1);
        System.out.println(same);

        System.out.println(s.toUpperCase());
        System.out.println(s);

        s = s.toUpperCase();
        System.out.println(s);


        String substring = s1.substring(1,2);
        System.out.println(substring);

        boolean startsWith = s1.startsWith("h");
        System.out.println(startsWith);

        System.out.println(s1.length());

        System.out.println(s1.charAt(3));
    }
}
