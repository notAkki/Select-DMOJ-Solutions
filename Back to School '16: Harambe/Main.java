import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        String str = in.nextLine();
        
        int upper = 0;
        int lower = 0;
        
        for (int i = 0; i < str.length(); i ++){
            char cur = str.charAt(i);
            if (cur >= 97){
                lower ++;
            }
            else if (cur >= 65){
                upper ++;
            }
        }
        
        if (upper>lower){
            System.out.println (str.toUpperCase());
        }
        else if (lower > upper){
            System.out.println (str.toLowerCase());
        }
        else {
            System.out.println (str);
        }
        
    }
}
