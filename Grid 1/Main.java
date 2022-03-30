import java.io.*;
import java.util.*;

public class Main {
    public static void main (String [] args){
        Scanner in = new Scanner (System.in);
        int n = in.nextInt ();
        int m = in.nextInt ();
        in.nextLine ();

        boolean [][] arr = new boolean [n][m];
        int [][] dp = new int [n][m];

        for (int i = 0; i < n; i ++){
            for (int j = 0; j < m; j ++){
                String str = in.nextLine ();

                char ch = str.charAt(0);

                if (ch == '.'){
                    arr[i][j] = false;
                }
                else {
                    arr [i][j] = true;
                }
            }
        }

        for (int i = 0; i < n; i ++){
            if (arr [i][0])
                break;
            dp [i][0] = 1;
        }
        for (int i = 0; i < m; i ++){
            if (arr [0][i])
                break;
            dp [0][i] = 1;
        }

        for (int i = 1; i < n; i ++){
            for (int j = 1; j < m; j ++){
                if (!arr[i][j]){
                    dp[i][j] = dp[i-1][j] + dp[i][j-1];
                }
            }
        }

        System.out.println (dp [n-1][m-1]);
    }
}
