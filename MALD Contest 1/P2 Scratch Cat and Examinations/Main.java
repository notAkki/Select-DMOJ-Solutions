import java.io.*;
import java.util.*;

public class Main {
    public static void main (String [] args) throws IOException{
        BufferedReader in = new BufferedReader (new InputStreamReader (System.in));
        PrintWriter out = new PrintWriter (System.out);

        StringTokenizer st = new StringTokenizer (in.readLine ());
        int n = Integer.parseInt (st.nextToken());

        for (int i = 0; i < n; i ++){
            st = new StringTokenizer (in.readLine());
            long a = Long.parseLong(st.nextToken());
            long b = Long.parseLong(st.nextToken());

            double mark = Math.ceil ((double)a/b * 100.0) /100.0;
            if (mark > 1){
                System.out.println ("sus");
                continue;
            }
            else if (mark == 1){
                System.out.println ("average");
                continue;
            }
            else if (mark >= 0.98 && mark <= 0.99){
                System.out.println ("below average");
                continue;
            }
            else if (mark >= 0.95 && mark <= 97){
                System.out.println ("can't eat dinner");
                continue;
            }
            else if (mark >= 0.9 && mark <= 0.94){
                System.out.println ("don't come home");
                continue;
            }
            else{
                System.out.println ("find a new home");
                continue;
            }
        }


    }
}
