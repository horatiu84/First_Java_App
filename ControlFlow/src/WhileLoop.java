public class WhileLoop {
    public static void main(String[] args) {
        boolean notFound = true;
        while (notFound) {
            int randomNr = (int) (Math.random() * 10)+1;
            System.out.println("Value : " + randomNr);
            if (randomNr == 10) {
                notFound = false;
            }
        }

        // find out the squared numbers form 0 to 100
        int i = 0;
        while (i<100) {
            System.out.println((int)Math.pow(i,2));
            i++;
        }
    }
}
