import java.util.*;
import java.io.*;

public class Main {
    public static void main (String [] args){ 
        Scanner in = new Scanner (System.in);
        int n = in.nextInt ();
        int [] nums = new int [n];
        int max = 0;
        for (int i = 0; i < n; i ++){
            nums [i] = in.nextInt ();
        }

        int [] dp = new int [n];
        dp [0] = nums[0];
        if (nums [1] > nums [0]){
            dp [1] = nums [1];
            max = nums [1];
        }
        else {
            dp [1] = nums [0];
            max = nums [0];
        }

        for (int i = 2; i < n; i ++){
            if ((nums [i] + dp [i - 2]) > dp [i - 1]){
                dp [i] = nums [i] + dp [i - 2];
                max = nums [i] + dp [i - 2];
            }
            else {
                dp [i] = dp [i - 1];
            }
        }
        System.out.println (max);
    }
}
