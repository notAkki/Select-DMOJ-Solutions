import java.util.*;
import java.io.*;

public class Main {
    public static void main (String [] args){
        Scanner in = new Scanner (System.in);
        int a = in.nextInt ();
        int b = in.nextInt ();

        boolean [][] arr = new boolean [a][b];
        int [][] dp = new int [a][b];

        int c = in.nextInt ();
        for (int i = 1; i <= c; i ++){
            int x = in.nextInt ();
            int y = in.nextInt ();
            arr [x-1][y-1] = true;
        }

        for (int i = 0; i < a; i ++){
            if (arr [i][0])
                break;
            dp [i][0] = 1;
        }
        for (int i = 0; i < b; i ++){
            if (arr [0][i])
                break;
            dp [0][i] = 1;
        }

        for (int i = 1; i < a; i ++){
            for (int j = 1; j < b; j ++){
                if (!arr[i][j]){
                    dp[i][j] = dp[i-1][j] + dp[i][j-1];
                }
            }
        }

        System.out.println (dp [a-1][b-1]);

    }
}
