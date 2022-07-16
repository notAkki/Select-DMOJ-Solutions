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
      
      ArrayList <Double> arr = new ArrayList<Double>();
      for (int i = 0; i < n; i ++){
         arr.add((double)readInt());
      }

      while (true){
         int next = readInt ();
         if (next == 77)
            break;
         else if (next == 99){
            int river = readInt () - 1;
            double flow = readInt () / 100.0;
				arr.add (river, arr.get(river)*flow);
				arr.add (river+1, arr.remove(river+1)*(1-flow));
         }
         else if (next == 88){
				int river = readInt() - 1;
				arr.add (river, arr.remove(river)+arr.remove(river));
         }
      }

		//arr.add (0, arr.get(0)*0.5);
		//arr.add (1, arr.remove(1)*0.5);
		for (double num: arr){
			System.out.print ((int)num + " ");
		}

   }
}
