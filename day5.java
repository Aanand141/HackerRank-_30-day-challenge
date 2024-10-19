/*Given an integer, n, print its first 10 multiples. Each multiple n x i (where 1 <= i <= 10 ) should be printed on a new line in the form: n x i = result.

Example

n = 3

The printout should look like this:

3 * 1 = 3

3 * 2 = 6

3 * 3 = 9

3 * 4 = 12

3 * 5 = 1 * 5

3 * 6 = 18

3 * 7 = 21

3 * 8 = 24

3 * 9 = 27

3 * 10 = 30 */
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



public class day5 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());
        for(int i = 1;i<=10;i++){
          System.out.println(n+" x "+i+" = "+n*i);
        }
        bufferedReader.close();
    }
}
