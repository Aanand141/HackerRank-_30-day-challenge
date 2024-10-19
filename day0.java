
/*Task 
To complete this challenge, you must save a line of input 
from stdin to a variable, print Hello, World. on a single line,
and finally print the value of your variable on a second line. */
import java.io.*;
import java.util.*;

public class day0 {

    public static void main(String[] args) {
        /*
         * Enter your code here. Read input from STDIN. Print output to STDOUT. Your
         * class should be named Solution.
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("Hello, World.");
        String str = sc.nextLine();
        System.out.println(str);
        sc.close();
    }

}
