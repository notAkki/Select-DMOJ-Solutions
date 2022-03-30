import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args){
        Scanner in = new Scanner (System.in);
    
        long a = in.nextLong ();
        long b = in.nextLong ();
        int total = 0;
        long x = b-a;
        int range = (int)x + 1;

        boolean [] arr = new boolean [range];
        
        for (long i = 3; i * i <= b; i += 2) {
            for (long j = b / i; i * j >= a; j -= 2) {
                if (j % 2 == 0) j--;
                if (j < i) break;
                if (arr[(int) (i * j - a)] == false) {
                    arr[(int) (i * j - a)] = true;
                }
            }
        }

        for (int i = 0; i < b - a; i ++){
            if (arr[i] == false)
                total ++;
        }

        System.out.println (total - (x / 2));
    }
}