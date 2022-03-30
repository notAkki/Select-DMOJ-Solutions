import java.util.*;

public class Main {
    public static void main (String [] args){
        Scanner in = new Scanner (System.in);
        String [][] temp = new String [5][2];
        String line = "";
        int n = 0;

        while (!line.equals("SCHOOL")){
            temp [n][0] = in.nextLine ();
            line = in.nextLine ();
            temp [n][1] = line;
            n ++;
        }

        String [][] to = new String [n][2];
        for (int i = 0; i < n; i ++){
            to [i][0] = temp [i][0];
            to [i][1] = temp [i][1];
        }

        String [][] from = new String [n][2];
        for (int i = 0, j = n - 1; i < n; i ++, j --){
            if (to [j][0].equals("R")){
                from [i][0] = "LEFT";
            }
            else {
                from [i][0] = "RIGHT";
            }
            if (j == 0){
                from [i][1] = "HOME";
                break;
            }
            from [i][1] = to [j - 1][1];
        }

        for (int i = 0; i <n; i ++){
            if (i == n -1){
                System.out.println ("Turn " + from [i][0] + " into your HOME.");
                break;
            }
            System.out.println ("Turn " + from [i][0] + " onto " + from [i][1] + " street.");
        }
    }
}
