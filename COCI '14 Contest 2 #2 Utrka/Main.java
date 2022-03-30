import java.util.*;
import java.io.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
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
    public static void main (String [] args) throws IOException {
        int n = readInt ();
        String [] runners = new String [n];
        String [] arr = new String [n-1];
        for (int i = 0; i < n; i ++){
            runners [i] = readLine ();
        }
        for (int i = 0; i < n - 1; i ++){
            arr [i] = readLine ();
        }
        boolean a = true;
        for (int i = 0; i < n; i ++){
            a = true;
            for (int j = 0; j < n -1; j ++){
                if (runners[i].equals(arr[j])){
                    a = false;
                }
            }
            if (a){
                System.out.println (runners [i]);
                return;
            }
        }
    }
}
