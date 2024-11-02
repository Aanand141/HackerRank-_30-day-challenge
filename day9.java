/*Today, we are learning about an algorithmic concept called recursion. Check

out the Tutorial tab for learning materials and an instructional video.

Recursive Method for Calculating Factorial

factorial(N) = { 1 N<1 Nx factorial(N-1) otherwise

Submissions

Function Description

Complete the factorial function in the editor below. Be sure to use recursion.

factorial has the following paramter:

int n: an integer

Returns

⚫int: the factorial of n

Note: If you fail to use recursion or fail to name your recursive function factorial or Factorial, you will get a score of 0.

Input Format

A single integer, n (the argument to pass to factorial). */
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class  Result {

    /*
     * Complete the 'factorial' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER n as parameter.
     */

    public static int factorial(int n) {
    // Write your code 
    if(n==0){
      return 1;
    }
    return n*factorial(n-1);

    }

}

public class day9 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        int result = Result.factorial(n);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
