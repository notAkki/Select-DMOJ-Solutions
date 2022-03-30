import java.util.*;

public class Main {
    public static void main (String [] args){
        Scanner in = new Scanner (System.in);
        int n = in.nextInt ();
        in.nextLine ();
        if (n == 0) {
            return;
        }
        if (n == 1){
            String str = in.nextLine ();
            System.out.println (str.substring (0, str.indexOf(" ")));
            return;
        }

        String [][] input = new String [n][4];
        int [] score = new int [n];
        int largest = 0;
        int largeLoc = 0;
        int second = 0;
        int secondLoc = 0;
        for (int i = 0; i < n; i ++){
            String str = in.nextLine ();
            input [i] = str.split (" ");
            int r = Integer.parseInt (input [i][1]);
            int s = Integer.parseInt (input [i][2]);
            int d = Integer.parseInt (input [i][3]);
            score [i] = (2*r) + (3*s) + d;
            if (score [i] > largest){
                second = largest;
                secondLoc = largeLoc;
                largest = score[i];
                largeLoc = i;
            }
            else if (score [i] < largest && score [i] > second){
                second = score [i];
                secondLoc = i;
            }
        }

        ArrayList <Integer> list = new ArrayList <Integer>();
        ArrayList <Integer> sList = new ArrayList <Integer>();
        for (int i = 0; i < score.length; i ++){
            if (score[i] == largest){
                list.add (i);
            }
            if (score [i] == second){
                sList.add (i);
            }
        }

        if (list.size() > 1){
            String first = "ZZZZZZZZZZZZZZZZZZZZ";
            String secondS = "ZZZZZZZZZZZZZZZZZZZZ";
            for (int i = 0; i < list.size(); i ++){
                String str = input [list.get(i)][0];
                if (str.compareTo(first) < 0){
                    secondS = first;
                    first = str;
                }
                else if (str.compareTo(first) > 0 && str.compareTo (secondS) < 0){
                    secondS = str;
                }
            }
            System.out.println (first);
            System.out.println (secondS);
            return;
        }

        if (sList.size() > 1){
            String secondS = "ZZZZZZZZZZZZZZZZZZZZ";
            for (int i = 0; i < sList.size(); i ++){
                String str = input[sList.get(i)][0];
                if (str.compareTo(secondS) < 0){
                    secondS = str;
                }
            }
            System.out.println (input[largeLoc][0]);
            System.out.println (secondS);
            return;
        }

        System.out.println (input [largeLoc][0]);
        System.out.println (input [secondLoc][0]);
    }
}
