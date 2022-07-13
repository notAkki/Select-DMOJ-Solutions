import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader (new InputStreamReader (System.in));
        PrintWriter out = new PrintWriter (new OutputStreamWriter (System.out));
        
        int n = Integer.parseInt (in.readLine());
        String [] arr = new String [n];
        
        for (int i = 0; i < n; i ++){
            arr [i] = in.readLine();
        }
        
        String sub = in.readLine();
        
        ArrayList <Character> next = new ArrayList <Character>();
        
        for (int i = 0; i < n; i ++){
            //System.out.println (arr[i].charAt(arr[i].indexOf(sub)+sub.length()));
            if (arr[i].indexOf(sub) == 0){
                next.add (arr[i].charAt(arr[i].indexOf(sub) + sub.length()));
                //System.out.println (i);
            }
        }
        
        char [] ans = {'*','*','*','*','*','*','*','*','*','*','*','*','*','*','*','*','*','*','*','*','*','*','*','*','*','*','*','*','*','*','*','*'};
        
        for (int i = 0; i < next.size(); i ++){
            ans [next.get(i)-62] = next.get(i); 
        }
        
        for (int i = 0; i < 32; i ++){
            System.out.print (ans[i]);
            if (i == 7 || i == 15 || i == 23){
                System.out.println();
            }
        }
        
        out.close();
    }
}
