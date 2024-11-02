import java.io.*;
import java.util.*;

public class day8 {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        
        Map<String, Integer> Contact = new HashMap<String,Integer>();
        int n = sc.nextInt();
        for(int i = 0;i<n;i++){
          String name = sc.next();
          int number = sc.nextInt();
          Contact.put(name, number);
        }
        while (sc.hasNext()) {
          String query = sc.next();
          if(Contact.containsKey(query)){
            System.out.println(query+"="+Contact.get(query));
          }
          else{
            System.out.println("Not found");
          }
          
        }
        sc.close();
    }
}
