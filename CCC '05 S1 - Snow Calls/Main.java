import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        int n = in.nextInt ();
        in.nextLine ();
        String [] cases = new String [n];
        
        for (int i = 0; i < n; i ++){
            cases [i] = in.nextLine ();
        }
        
        for (int i = 0; i < n; i ++){
            String str = cases[i];
            
            str = str.replaceAll ("-", "");
            if (str.length() > 10){
                str = str.substring (0, 10);
            }
            char [] c =   str.toCharArray ();
            for (int j = 0; j < c.length; j++){
               if (c[j] >= 65 && c[j] <= 67){
                  c[j] = '2';
               }
               else if (c[j] >= 68 && c[j] <= 70){
                  c[j] = '3';
               }
               else if (c[j] >= 71 && c[j] <= 73){
                  c[j] = '4';
               }
               else if (c[j] >= 74 && c[j] <= 76){
                  c[j] = '5';
               }
               else if (c[j] >= 77 && c[j] <= 79){
                  c[j] = '6';
               }
               else if (c[j] >= 80 && c[j] <= 83){
                  c[j] = '7';
               }
               else if (c[j] >= 84 && c[j] <= 86){
                  c[j] = '8';
               }
               else if (c[j] >= 87 && c[j] <= 90){
                  c[j] = '9';
               }
            }
            str = "";
            for (char y: c){
               str += y;
            }
            
            str = str.substring (0, 3) + "-" + str.substring (3, 6) + "-" + str.substring (6);
            System.out.println (str);
        }
        
    }
}