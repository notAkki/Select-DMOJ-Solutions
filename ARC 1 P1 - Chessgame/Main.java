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
      int m = readInt ();

      char [][] arr = new char [m][n];
      boolean [][] placeable = new boolean [m][n];

      int total = 0;

      //Row Code

      for (int i = 0; i < n; i ++){
         String str = readLine();
         int numOfPieces = 0;
         int aPos = -1; 
         int bPos = -1;

         for (int j = 0; j < m; j ++){
            arr [j][i] = str.charAt (j);
         }  

         int pos = str.indexOf ('*');

         while (pos > -1){
            numOfPieces ++;
            if (aPos == -1){
               aPos = pos;
            }
            else if (bPos == -1){
               bPos = pos;
            }
            pos = str.indexOf('*', pos + 1);
         }

         if (numOfPieces == 0){
            for (int j = 0; j < m; j ++){
               placeable[j][i] = true;
            }
         }
         else if (numOfPieces == 1){
            for (int j = 0; j < m; j ++){
               placeable[j][i] = true;
            }
            placeable[aPos][i] = false;
         }
         else if (numOfPieces == 2){
            for (int k = aPos; k < bPos; k ++){
               if (k > aPos && k < bPos){
                  placeable[k][i] = true;
               }
            }
            //System.out.println ("Here");
            total += m - (bPos-aPos) -1;
         }
         else {
            //System.out.println ("here?");
            total += m - numOfPieces;
         }
      }
      
      //Column Code

      for (int i = 0; i < m; i ++){
         String str = new String (arr[i]);
         int aPos = str.indexOf('*');
         int bPos = str.indexOf('*', aPos + 1);
         int cPos = str.indexOf('*', bPos + 1);

         if (bPos == -1){
            continue;
         }
         else if (bPos > -1 && cPos == -1){
            for (int j = 0; j < n; j ++){
               if ((j < aPos && placeable [i][j] == true) || (j > bPos && placeable [i][j] == true)){
                  total ++;
               }
               if (j == aPos){
                  j = bPos;
               }
            }
         }
         else if (cPos > -1){
            for (int j = 0; j < n; j ++){
               if (placeable [i][j] == true){
                  total ++;
               }
            }
         }

      }

      /*for (int i = 0; i < m; i ++){
         String str = new String (arr[i]);
         System.out.println(str);
      }*/

      System.out.println (total);
	}
}
