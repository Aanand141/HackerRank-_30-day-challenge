/*
 * Day 29: Bitwise AND | 30 Days Of Code
 * Objective
 * Welcome to the last day! Today, we’re discussing bitwise operations.
 * 
 * Task
 * Given set S = {1, 2, 3, . . . ,N}. Find two integers, A and B (where A < B),
 * from set S such that the value of A&B is the maximum possible and also less
 * than a given integer, K. In this case, & represents the bitwise AND operator.
 * 
 * Function Description
 * Complete the bitwiseAnd function in the editor below.
 * 
 * bitwiseAnd has the following paramter(s):
 * – int N: the maximum integer to consider
 * – int K: the limit of the result, inclusive
 * 
 * Returns
 * – int: the maximum value of A&B within the limit.
 * 
 * Input Format
 * The first line contains an integer, T, the number of test cases.
 * Each of the T subsequent lines defines a test case as 2 space-separated
 * integers, N and K, respectively.
 * 
 * Constraints
 * 1 <= T <= 103
 * 2 <= N <= 103
 * 2 <= K <= N
 * Sample Input
 * 
 * STDIN Function
 * ----- --------
 * 3 T = 3
 * 5 2 N = 5, K = 2
 * 8 5 N = 8, K = 5
 * 2 2 N = 8, K = 5
 * Sample Output
 * 
 * 1
 * 4
 * 0
 */
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class day29{

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int t = scanner.nextInt();

        for (int tItr = 0; tItr < t; tItr++) {
            int n = scanner.nextInt();
            int k = scanner.nextInt();
            int res=0;
            for(int i=0;i<n;i++){
                for(int j=i+1;j<=n;j++){
                    int and=i&j;
                    if(and<k && and > res){
                        res=and;
                    }
                }
            }
           System.out.println(res);
            }  
             scanner.close(); 
          }
       
    }