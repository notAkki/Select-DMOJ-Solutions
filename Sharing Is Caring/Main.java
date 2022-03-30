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
        readInt ();
        int n = readInt ();
        int [] arr = new int [n];
        String [] documents = new String [n];

        for (int i = 0; i < n; i ++){
            readInt ();
            arr[i] = readInt ();
            documents [i] = readLine ();
        }

        int a = readInt ();
        for (int i = 0 ; i < n; i ++){
            if (arr [i] == a){
                System.out.println (documents [i]);
            }
        }
    }    
}
