import java.util.*;
import java.io.*;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
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
      for (int i = 0;  i < 1; i ++){
         int shirts = readInt ();
         int numEvents = readInt ();
         int days = readInt ();

         int [] week = new int [days];

         for (int j = 0; j < numEvents; j ++){
            week[readInt()-1] ++;
         }
         int ans = 0;
         int totalShirts = shirts;
         for (int j = 0; j < days; j ++){
            if (shirts == 0){
               ans ++;
               shirts = totalShirts;
            }
            shirts --;
            totalShirts += week[j];
            shirts += week[j];
         }
         System.out.println (ans);
      }
   }
}
