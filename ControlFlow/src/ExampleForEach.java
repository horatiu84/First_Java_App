public class ExampleForEach {
    public static void main(String[] args) {
        int[] nrs = {0,1,2,3,4,5,6,7,8,9};

        int sum = 0;

        for (int nr:nrs) {
            System.out.println(nr);
            sum += nr;
        }
        System.out.println("The sum is : " + sum);


        //Example Break and continue


        for (int nr:nrs) {
            if(nr%2 == 0) {
                continue;
            }
            System.out.println(nr);
        }
    }
}
