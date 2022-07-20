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
      int k = readInt ();
      int size = 0;
      int total = 0;
      int breaks =0;

      for (int i = 0; i <= 20; i ++){
         if (Math.pow(2,i) > k){
            size = (int)Math.pow(2, i);
            break;
         }
         else if ((int)Math.pow(2,i) == k){
            size = (int)Math.pow(2, i);
            System.out.println (size + "  0");
            return;
         }
      }

      while (total < k){
         breaks ++;
         if (total + size/(Math.pow(2,breaks)) > k){
            continue;
         }
         else {
            total += size / (Math.pow(2, breaks));
         }
      }

      System.out.println (size + " " + breaks);

   }
}
