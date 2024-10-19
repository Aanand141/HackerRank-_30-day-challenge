
/*Task:
Complete the code in the editor below. The variables i, d, and s are already declared and initialized for you. 
You must:
1.Declare 3 variables: one of type int, one of type double, and one of type String.
2.Read 3 lines of input from stdin (according to the sequence given in the Input Format section below) 
and initialize your 3 variables.
3.Use the + operator to perform the following operations:
	1.Print the sum of i plus your int variable on a new line.
	2.Print the sum of d plus your double variable to a scale of one decimal place on a new line.
	3.Concatenate s with the string you read as input and print the result on a new line.
Note: If you are using a language that doesn't support using  for string concatenation (e.g.: C),
      you can just print one variable immediately following the other on the same line. 
      The string provided in your editor must be printed first, immediately followed by the string you read as input. */
import java.io.*;
import java.util.*;

public class day1 {

    public static void main(String[] args) {
        /*
         * Enter your code here. Read input from STDIN. Print output to STDOUT. Your
         * class should be named Solution.
         */
        Scanner sc = new Scanner(System.in);
        // Read Integer
        int n = sc.nextInt();

        // reading Double
        double d = sc.nextDouble();

        // Consuming the new Line Character
        sc.nextLine();

        // Reading string
        String str = sc.nextLine();

        // Performing the calculation
        int sum = n + (int) d;
        Double e = d + d;
        String newStr = "HackerRank " + str;

        // Printing the results
        System.out.println(sum);
        System.out.println(e);
        System.out.println(newStr);

        sc.close();

    }
}
