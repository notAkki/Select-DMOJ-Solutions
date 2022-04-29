import java.io.*;
import java.util.*;

public class Main {
    public static void main (String [] args) throws IOException {
        BufferedReader in = new BufferedReader (new InputStreamReader (System.in));
        PrintWriter out = new PrintWriter (System.out);

        StringTokenizer st = new StringTokenizer (in.readLine ());
        int n = Integer.parseInt (st.nextToken());
        
        ArrayList <String> orig = new ArrayList <String> ();
        boolean next = false;
        String [] temp = new String [n];
        
        for (int i = 0; i < n; i ++){
            st = new StringTokenizer (in.readLine());
            temp [i] = st.nextToken ();
            if (temp[i].indexOf ("yubo") >= 0){
                orig.add (temp[i]);
                next = true;
                if (i > 0){
                    orig.add (temp [i-1]);
                }
                continue;
            }

            if (next){
                orig.add (temp[i]);
                next = false;
            }
        }

        ArrayList <String> ans = new ArrayList <String>();
        for (String str: orig){
            if (!ans.contains(str)) {
                ans.add(str);
            }
        }
        Collections.sort(ans);

        for (String str: ans){
            System.out.println (str);
        }
    }
}
