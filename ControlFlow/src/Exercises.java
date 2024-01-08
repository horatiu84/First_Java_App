public class Exercises {
    public static void main(String[] args) {
        // EXERCISE 1


        /*
        Based on the age of a visitor, determine the price of an entrance ticket to an amusement park.

    Steps:

    1. Create a main method for all the exercises in this file. The steps will be executed in this main method.

    2. Declare an int variable age.

    3. Assign a value to age.

    4. Use an if statement to determine the ticket price based on the age.

    Free under the age of 5
    5 for the age 5 - 12
    10 for the age 12 - 18
    15 for all other situations
    5. Print the ticket price. Run the code for different ages and verify the result.


         */


        int age = 5;
        int price ;

        if(age<5) {
            System.out.println("The ticket is free!");
            price = 0;
        } else if (age <12) {
            System.out.println("Price for the ticket is 5$");
            price = 5;
        } else if (age<18) {
            System.out.println("Price for the ticket is 10$");
            price = 10;
        } else {
            System.out.println("Price for the ticket is 15$");
            price = 15;
        }

        System.out.println(price);

        // EXERCISE 2

        /*
        Exercise: Comment on a Student's Grade Using Switch Statement
        Provide a comment on a student's grade using a switch statement.

        Steps:

        1. Declare a char variable grade.

        2. Assign a value to grade.

        3. Use a switch statement to comment on the grade. Come up with different comments for A, B, C, D, F. If it’s something else, comment “Invalid grade.”

        4. Print the comment. Run the code for different grades and verify the result.


         */

        char grade = 'F';

        switch (grade) {
            case 'A' :
                System.out.println("Perfect score!");
                break;
            case 'B':
                System.out.println("Almost perfect");
                break;
            case 'C':
                System.out.println("Good, but you can do better");
                break;
            case 'D':
                System.out.println("You need to study more");
                break;
            case 'F':
                System.out.println("You didn't study enough, better luck next time!");
                break;
            default:
                System.out.println("Invalid grade!");
        }


        // EXERCISE 3

        /*

        Use a for loop to print all the values in an array.

        Steps:

        1. Declare an int array numbers.

        2. Assign 5 values to the array.

        3. Use a for loop to iterate over the array and print each value.



         */

        int[] numbers = {1,2,3,4,5};

        for(int i=0; i<numbers.length;i++) {
            System.out.println(numbers[i]);
        }


        //EXERCISE 4

        /*
        Use a while loop to print the first N even numbers.

        Steps:

        1. Declare an int variable n and an int variable counter initialized to 0.

        2. Assign a value to n.

        3. Use a while loop to print the first N even numbers.


         */


        int n=25;
        int counter = 0;
        int numb=0;

        while (counter !=n) {
            if(numb%2 ==0) {
                System.out.println(numb);
                counter++;
            }
            numb++;
        }

        // EXERCISE 5

        /*
        Use a do-while loop to print a sequence of numbers from 1 to N.

        Steps:

        1. Declare an int variable n and an int variable i initialized to 1

        2. Assign a value to n.

        3. Use a do-while loop to print the sequence of numbers from 1 to N.


         */

        System.out.println("EXERCISE 5");

        int x = 15;
        int t = 1;

        do {
            System.out.println(t);
            t++;
        } while (t<=x);

        // EXERCISE 6

        /*
        Use a for-each loop to calculate the sum of an array of integers.

        Steps:

        1. Declare an int array numbers.

        2. Assign 5 values to the array.

        3. Use a for-each loop to calculate the sum of the array.

        4. Print the sum after the loop

         */

        System.out.println("EXERCISE 6");

        int[] numarr = {1,2,3,4,5};
        int sum = 0;

        for(int nr:numarr) {
            sum += nr;
        }
        System.out.println(sum);

        // EXERCISE 7

        /*
        Exercise: Determine the Highest and Lowest Grades Using Control Flow Statements
        Determine the highest and lowest grades in a list of student grades using control flow statements.

        Steps:

        1. Declare an int array grades with grades between 0 and 100.

        2. Assign at least 4 values to the array.

        3. Use a for loop to iterate over the array, and use if statements to determine the highest and lowest grades.


         */


        System.out.println("EXERCISE 7");

        int[] grades = {5,10,25,45,60,75,90,4,92,7,85};
        int min = 100;
        int max = 0;

        for(int i=0; i< grades.length;i++) {
            if(max < grades[i]) {
                max = grades[i];
            }
            if(min>grades[i]) {
                min = grades[i];
            }
        }

        System.out.println("The highest grade is " + max + " and the lowest grade is " + min);


        // EXERCISE 8

        /*
        Exercise: Find the Average of Odd Numbers in an Array Using Control Flow Statements

        Calculate the average of odd numbers in an array using control flow statements.

        Steps:

        1. Declare an int array numbers.

        2. Assign values to the array.

        3. Use a for loop to iterate over the array, and use an if statement to check if the number is odd.

        4. Calculate the sum of the odd numbers and their count.

        5. Calculate the average of the odd numbers.

        6. Print the average after the loop

         */

        System.out.println("EXERCISE 8");

        int[] someArr = {1,2,3,4,5,6,7,8,9,10,15,25,30};
        int oddCount = 0;
        int oddSum = 0;
        double average = 0;

        for(int i=0; i< someArr.length; i++) {
            if(someArr[i]%2 !=0) {
                oddCount++;
                oddSum += someArr[i];
            }
        }
        average = (double) oddSum/oddCount;
        System.out.println("The sum of all odd numbers of this array is " + oddSum + " ,the count is " + oddCount + " and the average is : " + average);
    }
}
