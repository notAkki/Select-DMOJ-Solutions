import java.util.*;

public class Main {
    public static void main (String [] args){
        Scanner in = new Scanner (System.in);
        int a = in.nextInt ();
        int b = in.nextInt ();
        int counter = 0;

        for (int i = 1; i <= a; i ++){
            for (int j = 1; j <= b; j ++){
                if (i + j == 10){
                    counter ++;
                }
            }
        }

        if (counter == 1){
            System.out.println ("There is 1 way to get the sum 10.");
        }
        else {
            System.out.println ("There are " + counter + " ways to get the sum 10.");
        }
    }
}
