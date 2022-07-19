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

   public static String str;
   public static String target;
   public static char cur;
   //public static char needed;
   public static int strPos;
   public static int targetPos;

   public static boolean merge (char needed){
      //System.out.println (cur + " " + needed);
      if (cur == needed){
         cur = (char)(needed+1);
         return true;
      }
      else if (cur < needed){
         strPos ++;
         if (strPos >= str.length()){
            return false;
         }
         char temp = cur;
         cur = str.charAt(strPos);
         boolean passed = merge(temp);
         if (passed){
            return merge (needed);
         }
         else {
            return false;
         }
      }
      else {
         return false;
      }
   }

   public static void main (String [] args) throws IOException{
      int n = readInt ();
      for (int i = 0; i < n; i ++){
         String [] arr = readLine().split(" ");
         str = arr[0];
         target = arr[1];
         cur = str.charAt(0);
         strPos = 0; 
         targetPos = 0;
         boolean solvable = false;

         if (target.length() > str.length()){
            System.out.println ("NO");
            continue;
         }

         for (;targetPos < target.length(); targetPos ++){
            char needed = target.charAt(targetPos);
            if (cur == needed){
               strPos ++;
               if (strPos >= str.length() && targetPos == target.length()-1){
                  solvable = true;
                  break;
               }
               else if (strPos >= str.length() && targetPos != target.length()-1){
                  solvable = false;
                  break;
               }
               
               cur = str.charAt(strPos);
               continue;
            }
            else if (cur > needed){
               solvable = false;
               break;
            }
            else {
               if (merge(needed)){
                  strPos ++;
                  if (strPos >= str.length() && targetPos == target.length()-1){
                     solvable = true;
                     break;
                  }
                  else if (strPos >= str.length() && targetPos != target.length()-1){
                     solvable = false;
                     break;
                  }
                  if (strPos < str.length()){
                     cur = str.charAt(strPos);
                  }
               }
               else {
                  solvable = false;
                  break;
               }
            }
         }           
         if (solvable)
            System.out.println ("YES");
         else 
            System.out.println ("NO");
      }
   }
}
