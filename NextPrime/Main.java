package NextPrime;

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

    public static boolean prime (int n){
        if (n == 0 || n ==1){
            return false;
        }
        if (n == 2){
            return true;
        }
        for (int i = 2; i < n/2; i ++){
            if (n%i == 0){
                return false;
            }
        }
        return true;
    }
    public static void main (String [] args) throws IOException{
        int n = readInt();
        int a = n;
        
        while (true){
            if (prime (a)){
                break;
            }
            a ++;
        }
        System.out.println (a);
    }
}