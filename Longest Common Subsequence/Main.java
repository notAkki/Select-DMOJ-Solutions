import java.util.*;
import java.io.*;

public class Main {
    public static void main (String [] args){
        Scanner in = new Scanner (System.in);
        int a = in.nextInt ();
        int b = in.nextInt ();

        int [] X = new int [a];
        int [] Y = new int [b];

        for (int i = 0; i < a; i ++){
            X [i] = in.nextInt();
        }
        for (int i = 0; i < b; i ++){
            Y [i] = in.nextInt();
        }

        int [][] dpArr = new int [a+1][b+1];
        
        for (int i = 1; i <= a; i ++){
            for (int j = 1; j <= b; j ++){
                if (X[i-1] == Y [j-1])
                    dpArr[i][j] = dpArr [i-1][j-1] + 1;
                else 
                    dpArr [i][j] = Math.max (dpArr [i-1][j], dpArr[i][j-1]);
            }
        }

        System.out.println (dpArr[a][b]);
    }
}