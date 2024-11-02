/*Task

Problem

Given a base-10 integer. n. convert it to binary (base-2). Then find and print the base-10 integer denoting the maximum number of consecutive 1's in n's binary representation. When working with different bases, it is common to show the base as a subscript.

Example

173 = 125

The binary representation of 12510 is 11111012. In base 10. there are 5 and 1 consecutive ones in twee groups. Print the maximum. 5.

Submissions

Input Format

A single integer, n.

Constraints

• 1 ≤ n ≤ 10°

Output Format

Leaderboard

Print a single base-10 integer that denotes the maximum number of
Sample Input 1

5

Problem

Sample Output 1

1

Submissions

Sample Input 2

13

Sample Output 2

2

A

Leaderboard

Explanation */
import java.io.*;

public class day10 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bufferedReader.readLine().trim());
        bufferedReader.close();

        // Convert to binary
        String binaryString = Integer.toBinaryString(n);

        // Find the maximum number of consecutive 1's
        int maxConsecutiveOnes = 0;
        int currentCount = 0;

        for (char c : binaryString.toCharArray()) {
            if (c == '1') {
                currentCount++;
                if (currentCount > maxConsecutiveOnes) {
                    maxConsecutiveOnes = currentCount;
                }
            } else {
                currentCount = 0;
            }
        }

        System.out.println(maxConsecutiveOnes);
    }
}
