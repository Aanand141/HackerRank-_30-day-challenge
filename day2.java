/*Given the meal price (base cost of a meal),
 tip percent (the percentage of the meal price being added as tip), 
and tax percent (the percentage of the meal price being added as tax) for a meal,
 find and print the meal's total cost. Round the result to the nearest integer. 
 Explanation

Editorial

Given:

meal_cost = 12. tip_percent = 20. tax_percent = 8

Calculations:

tip = 12 and 12/100 x 20 = 2.4

tax = 8  and 8/100 × 12 = 0.96

total_cost = meal_cost+tip + tax = 12+2.4+0.96 = 15.36

round(total_cost) = 15

We round total_cost to the nearest integer and print the result, 15.
 
 */

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

class Result {

    /*
     * Complete the 'solve' function below.
     *
     * The function accepts following parameters:
     *  1. DOUBLE meal_cost
     *  2. INTEGER tip_percent
     *  3. INTEGER tax_percent
     */

    public static void solve(double meal_cost, int tip_percent, int tax_percent) {
    // Write your code here
    double tip = meal_cost/100*(double)tip_percent;
    double tax = (double)tax_percent/100*meal_cost;
    double total_cost = meal_cost+tip+tax;
    System.out.println(Math.round(total_cost));

    }

}

public class day2{
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        double meal_cost = Double.parseDouble(bufferedReader.readLine().trim());

        int tip_percent = Integer.parseInt(bufferedReader.readLine().trim());

        int tax_percent = Integer.parseInt(bufferedReader.readLine().trim());

        Result.solve(meal_cost, tip_percent, tax_percent);

        bufferedReader.close();
    }
}
