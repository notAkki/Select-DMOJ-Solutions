import java.io.*;
import java.util.*;

public class Main {
    public static void main(String args[]) {
        Scanner in = new Scanner (System.in);
        int n = in.nextInt ();
        
        if (n == 2){
            int a = in.nextInt ();
            int b = in.nextInt ();

            System.out.println (Math.abs(a-b));
            return;
        }

        int [] temp = new int [1001];
        
        for (int i = 0; i < n; i ++){
            int a = in.nextInt ();
            temp [a] ++;
        }
        
        TreeMap <Integer, Integer> map = new TreeMap <Integer, Integer>(Collections.reverseOrder());
        
        for (int i = 1; i < 1001; i ++){
            if (temp[i] == 0)
                continue;
            
            map.put (temp[i], i);
        }

        Map.Entry<Integer,Integer> pos1 = map.entrySet().iterator().next();
        Map.Entry<Integer,Integer> pos2 = map.entrySet().iterator().next();
        Map.Entry<Integer,Integer> pos3 = map.entrySet().iterator().next();
                
        boolean firstCase = pos1.getKey() == pos2.getKey();
        boolean secondCase = pos1.getKey() != pos2.getKey() && pos2.getKey() == pos3.getKey();

        System.out.println (map);

        /*if (firstCase){
            for (int i = 0; i < n; i ++){

            }
        }
        else if (secondCase){

        }
        else {

        }*/

    }
}