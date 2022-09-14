import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        int n = in.nextInt();
        
        if (n == 1){
            System.out.println ("1");
        }
        else if (n == 2){
            System.out.println ("-1");
        }
        else if (n == 3){
            System.out.println ("1 3 2");
        }
        else {
            System.out.print ("1 3 2 ");
            for (int i = 4; i <= n; i ++){
                if (i == n){
                    System.out.println (i);
                }
                else {
                    System.out.print (i + " ");
                }
                    
            }
        }
    }
}
