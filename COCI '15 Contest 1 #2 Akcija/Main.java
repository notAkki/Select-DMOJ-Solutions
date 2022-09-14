import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        int n = in.nextInt();
        int [] arr = new int[n];
        
        for (int i = 0; i < n; i ++){
            arr[i] = in.nextInt();
        }
        
        Arrays.sort(arr);
        
        int total = 0;
        
        for (int i = n-1, count = 1; i >= 0; i --, count ++){
            if (count%3 == 0){
                continue;
            }
            total += arr[i];
        }
        
        System.out.println (total);
    }
}
