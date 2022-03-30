import java.io.*;
import java.util.*;

public class Main {
    public static void main (String [] args){
        Scanner in = new Scanner (System.in);
        int n = in.nextInt ();
        int [][] a = new int [n][3];
        int [][] dp = new int [n][3];

        for (int i = 0; i < n; i ++){
            a [i][0] = in.nextInt ();
            a [i][1] = in.nextInt ();
            a [i][2] = in.nextInt ();
        }

        dp [0][0] = a[0][0];
        dp [0][1] = a[0][1];
        dp [0][2] = a[0][2];

        for (int i = 1; i < n; i ++){
            dp [i][0] = a[i][0] + Math.max (dp[i-1][1], dp[i-1][2]);
            dp [i][1] = a[i][1] + Math.max (dp[i-1][0], dp[i-1][2]);
            dp [i][2] = a[i][2] + Math.max (dp[i-1][0], dp[i-1][1]);
        }

        System.out.println (Math.max (dp[n-1][2], Math.max (dp[n-1][0], dp[n-1][1])));
    }
}
