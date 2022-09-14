import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        int n = in.nextInt();
        ArrayList <Boolean> arr = new ArrayList <Boolean>();
        
        for (int i = 0; i < n; i ++){
            int a = in.nextInt ();
            
            if (a == 4) {
                if (arr.contains (false) && arr.contains (true)){
                    System.out.println ("false true");
                }
                else if (arr.contains(false)){
                    System.out.println ("false");
                }
                else if (arr.contains (true)){
                    System.out.println ("true");
                }
                else {
                    System.out.println();
                }
                continue;
            }
            boolean bool = in.nextBoolean();
            
            if (a == 1){
                if (arr.contains(bool))
                    System.out.println (false);
                else {
                    arr.add (bool);
                    System.out.println ("true");
                }
            }
            else if (a == 2){
                if (arr.contains(bool)) {
                    arr.remove (bool);
                    System.out.println ("true");
                }
                else
                    System.out.println (false);
            }
            else if (a == 3){
                System.out.println (arr.indexOf(bool));
            }
        }
    }
}
