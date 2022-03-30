import java.io.*;
import java.util.*;

public class Main {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;

    static String next() throws IOException {
		while (st == null || !st.hasMoreTokens())
			st = new StringTokenizer(br.readLine().trim());
		return st.nextToken();
	}

    static int readInt() throws IOException {
		return Integer.parseInt(next());
	}

    static String readLine() throws IOException {
		return br.readLine().trim();
	}

    public static void main(String[] args) throws IOException {
        int n = readInt();
        int tCount = 0;
        int sCount = 0;
        
        for (int i = 0; i < n; i ++){
            String str = readLine ();
            for (int j = 0; j < str.length (); j ++){
                if (str.charAt (j)=='t' || str.charAt (j)=='T'){
                    tCount ++;
                }
                if (str.charAt (j)=='s' || str.charAt (j) == 'S'){
                    sCount ++;
                }   
            }
        }
        
        if (tCount > sCount){
            System.out.println ("English");
        }
        else if (sCount > tCount){
            System.out.println ("French");
        }
        else {
            System.out.println ("French");
        }
    }
}