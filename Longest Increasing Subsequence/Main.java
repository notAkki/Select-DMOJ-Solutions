import java.io.*;
import java.util.*;

public class Main {
    public static int lengthOfLIS(int[] nums) {
        ArrayList<Integer> sub = new ArrayList<>();
        sub.add(nums[0]);
        
        for (int i = 1; i < nums.length; i++) {
            int num = nums[i];
            if (num > sub.get(sub.size() - 1)) {
                sub.add(num);
            } else {
                int j = binarySearch(sub, num);
                sub.set(j, num);
            }
        }
        
        return sub.size();
    }
    
    private static int binarySearch(ArrayList<Integer> sub, int num) {
        int left = 0;
        int right = sub.size() - 1;
        int mid = (left + right) / 2;
        
        while (left < right) {
            mid = (left + right) / 2;
            if (sub.get(mid) == num) {
                return mid;
            }
            
            if (sub.get(mid) < num) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        
        return left;
    }
    public static void main (String [] args) throws IOException{
        Scanner in = new Scanner (System.in);
        int a = in.nextInt();

        int [] x = new int [a];
        ArrayList <Integer> d = new ArrayList <Integer>();

        for (int i = 0; i < a; i ++){
            x [i] = in.nextInt();
        }
        System.out.println (lengthOfLIS(x));
    }
}
