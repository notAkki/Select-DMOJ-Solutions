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
      int n = readInt ();
      int a = readInt ();
      int b = readInt ();
      int c = readInt ();

      int round = 0;

      while (n > 0){
         round ++;
         a += 1;
         n --;

         if (a == 35){
            n += 30;
            a = 0;
         }
         if (n == 0)
            break;

         round ++;
         b += 1;
         n --;

         if (b == 100){
            n += 60;
            b = 0;
         }
         if (n == 0)
            break;

         round ++;
         c += 1;
         n --;

         if (c == 10){
            n += 9;
            c = 0;
         }
         
         if (n == 0)
            break;
      }

      System.out.println ("Martha plays " + round + " times before going broke.");
   }
}
