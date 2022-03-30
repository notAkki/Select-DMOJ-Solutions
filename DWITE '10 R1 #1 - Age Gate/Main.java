import java.util.*;

public class Main {

    public static String getAge (int day, int month, int year){
        if (year > 1997){
            return "too young";
        }
        if (year == 1997 && month > 10){
            return "too young";
        }
        if (year == 1997 && month == 10 && day > 27){
            return "too young";
        }
        return "old enough";
    }
    public static void main (String [] args){
        Scanner in = new Scanner (System.in);
        String [][] arr = new String [5][3];
        for (int i = 0; i < 5; i++){
            String str = in.nextLine ();
            arr [i] = str.split(" ");
        }

        

        for (int i = 0; i < 5; i ++){
            int day = Integer.parseInt (arr [i][0]);
            int month = Integer.parseInt (arr [i][1]);
            int year = Integer.parseInt (arr [i][2]);
            System.out.println (getAge (day, month, year));
        }
    }
}
