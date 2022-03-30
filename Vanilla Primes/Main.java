import java.io.*;
import java.util.*; 

public class Main {
    public static void main (String [] args){
        Scanner in = new Scanner (System.in);
        int n = in.nextInt ();
        if (n <= 1){
            System.out.println ("not");
        }
        else {
            for (int i = 2; i < Math.sqrt (n); i ++){
                if (n%i == 0){
                    System.out.println ("not");
                    return;
                }
            }
            System.out.println ("prime");
        }
    }
}
