import java.util.*;
import java.io.*;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static PrintWriter pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
	static StringTokenizer st;

	static String next() throws IOException {
		while (st == null || !st.hasMoreTokens())
			st = new StringTokenizer(br.readLine().trim());
		return st.nextToken();
	}

	static long readLong() throws IOException {
		return Long.parseLong(next());
	}

	static int readInt() throws IOException {
		return Integer.parseInt(next());
	}

	static double readDouble() throws IOException {
		return Double.parseDouble(next());
	}

	static char readCharacter() throws IOException {
		return next().charAt(0);
	}

	static String readLine() throws IOException {
		return br.readLine().trim();
	}

	public static void main(String[] args) throws IOException {     
		int type = readInt();
		int n = readInt();
		int [] a = new int [n];
		int [] b = new int [n];

		for (int i = 0; i < n; i ++){
			a[i]= readInt();
		}
		for (int i = 0; i < n; i ++){
			b[i]= readInt();
		}

		int ans = 0;

		Arrays.sort (a);
		Arrays.sort (b);

		if (type == 1){

			for (int i = 0; i < n; i ++){
				ans += Math.max(a[i],b[i]);
			}
			System.out.println (ans);
		}
		else {
			for (int i = 0; i < n; i ++){
				ans += Math.max(a[i],b[(n-1)-i]);
			}
			System.out.println (ans);
		}
    }
}
