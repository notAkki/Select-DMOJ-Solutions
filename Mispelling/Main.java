import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        int n = in.nextInt ();
        in.nextLine ();
        
        for (int i = 1; i <= n; i ++){
            int a = in.nextInt ();
            String word = in.nextLine().substring(1);
            
            word = word.substring(0, a-1) + word.substring (a);
            System.out.println (i + " " + word);
        }
    }
}
