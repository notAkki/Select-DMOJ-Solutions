import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader (new InputStreamReader (System.in));
        StringTokenizer st = new StringTokenizer (in.readLine());
        
        String str = st.nextToken();
        
        for (int i = 0; i < str.length(); i ++){
            String name = "";
            String temp = "";
            
            while (str.charAt(i) != 43 && str.charAt(i) != 45){
                name += str.charAt(i);
                i ++;
            }
            boolean tighten = str.charAt(i) == 43; i ++;
            while (str.charAt(i) >= 48 && str.charAt(i) <= 57 && i < str.length()){
                temp += str.charAt(i);
                i++;
                if (i == str.length())
                    break;
            }
            int value = Integer.parseInt (temp);
            
            if (tighten){
                System.out.println (name + " tighten " + value);
            }
            else {
                System.out.println (name + " loosen " + value);
            }
            i--;
        }
    }
}
