/*Task

Given a string. S. of length N that is indexed from 0 to N-1. print its

even-indexed and odd-indexed characters as 2 space-separated strings on a single line (see the Sample below for more detail).

Note: 0 is considered to be an even index.

Problem

Submissions

Example

s = adbecf

Print abc def

Input Format

The first line contains an integer, T (the number of test cases).

Each line i of the T subsequent lines contain a string. S.

Constraints

1<T<10

• 2 length of S ≤ 10000

Leaderboard

Output Format

For each String Sy (where 0≤ j ≤T-1), print Sy's even-indexed characters */
import java.io.*;
import java.util.*;

public class day6 {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc  = new Scanner(System.in);
        int n = sc.nextInt(); 
        sc.nextLine(); // Consume the newline character
        for(int i = 0; i < n; i++){
            String s = sc.nextLine();
            StringBuilder even = new StringBuilder();
            StringBuilder odd = new StringBuilder();
            for(int j = 0; j < s.length(); j++){
                if(j % 2 == 0){
                    even.append(s.charAt(j));
                } else {
                    odd.append(s.charAt(j));
                }
            }
            System.out.println(even + " " + odd);
        }
    }
}

