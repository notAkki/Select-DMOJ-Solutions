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

   public static ArrayList <Integer> arr;
	public static void main(String[] args) throws IOException {
      for (int i = 0; i < 10; i ++){
         int ans = 0;
         int n = readInt ();
         int last = 0;
         arr = new ArrayList<Integer>();

         for (int j = 0; j < n; j ++){
            int num = readInt ();
            if (num == n){
               last = j;
            }
            arr.add(num);
         }

         for (int j = n-1; j >= 1; j --){
            int pos = arr.indexOf(j);
            if (pos < last){
               last = pos;
               continue;
            }
            else {
               last = 0;
               arr.add(0, arr.remove(pos));
               ans += pos;
               //System.out.print (pos + " ");
            }
            //System.out.println (arr);
         }
         System.out.println (ans);
      }
   }
}