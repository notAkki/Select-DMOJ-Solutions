import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        int n = in.nextInt();
        
        int ans = 0;
        
        if (n%5 == 0){
            ans ++;
        }
        if (n%4 == 0){
            ans ++;
        }
        
        for (int i = n-5; i >= 4; i -= 5){
            if (i%4 == 0){
                ans ++;
            }
        }
        System.out.println (ans);
        
    }
}
