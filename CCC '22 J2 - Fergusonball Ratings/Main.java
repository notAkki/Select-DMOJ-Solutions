import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader (new InputStreamReader (System.in));
        StringTokenizer st = new StringTokenizer (in.readLine());
        
        int n = Integer.parseInt (st.nextToken());
        int total = 0;
        for (int i = 0; i < n; i ++){
            st = new StringTokenizer (in.readLine());
            int s = Integer.parseInt (st.nextToken());
            st = new StringTokenizer (in.readLine());
            int m = Integer.parseInt (st.nextToken());
            
            if (5*s - 3*m > 40)
                total ++;
        }
        
        if (total == n){
            System.out.println (total + "+");
        }
        else {
            System.out.println (total);
        }
    }
}
