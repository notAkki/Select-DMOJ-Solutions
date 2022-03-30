import java.util.*;

public class Main {
    public static void main (String [] args){
        Scanner in = new Scanner (System.in);
        int n = in.nextInt ();
        in.nextLine ();
        String [] x = new String [n];
        //String [] y = new String [n/2];
        int correct = 0;
        for (int i = 0; i < n; i ++){
            x [i] = in.nextLine();
        }

        for (int i = 0; i < n; i++){
            String str = in.nextLine();
            if (str.equals(x[i])){
                correct ++;
            }
        }
        System.out.println (correct);
    }
}
