import java.io.*;
import java.util.*;

public class Main{
    public static void main (String [] args){
        Scanner in = new Scanner (System.in);
        int a = in.nextInt ();
        int [] arr = new int [a];
        for (int i = 0; i < a; i ++){
            arr [i] = in.nextInt ();
        }

        int [] dp = new int [a];
        dp [1] = Math.abs(arr[0]-arr[1]);

        for (int i = 2; i < a; i ++){
            dp[i] = Math.min(Math.abs(arr[i] - arr[i - 1]) + dp[i - 1], Math.abs(arr[i] - arr[i - 2]) + dp[i - 2]);
        }
        System.out.println (dp[a-1]);
    }
}