import java.io.*;
import java.util.*;

public class Main {
    public static void main (String [] args){
        Scanner in = new Scanner (System.in);
        int r = in.nextInt ();
        int g = in.nextInt ();

        if (r < g){
            System.out.println (g-r);
        }
        else {
            if (r%g == 0){
                System.out.println ("0");
            }
            else {
                int a = r%g;
                if (g - a > a){
                    System.out.println (a);
                }
                else {
                    System.out.println (g - a);
                }
            }
        }
    }
}
