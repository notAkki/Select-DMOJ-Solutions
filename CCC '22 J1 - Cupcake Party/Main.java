import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        
        int r = in.nextInt (); int s = in.nextInt ();
        
        System.out.println ((r*8 + s*3) - 28);
    }
}
