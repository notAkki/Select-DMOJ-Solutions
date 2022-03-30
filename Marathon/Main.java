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
    public static void main (String [] args) throws IOException{
        Scanner in = new Scanner (System.in);
        int n = readInt ();
        int m = readInt ();

        int total = 0;

        int [] a = new int [n];
        int [] ps = new int [n+1]; 
        ps [0] = 0;

        for (int i = 0; i < n; i ++){
            int c = readInt ();
            a [i] = c;
            ps [i + 1] = ps [i] + c;
            total += c;
        }

        for (int i = 0; i < m; i ++){
            int bottom = readInt ();
            int top = readInt ();
            
            System.out.println (total - (ps [top] - ps[bottom-1]));
        }
    }
}
