import java.util.*;

public class Main {
    public static void main (String [] args){
        Scanner in = new Scanner (System.in);
        int m = in.nextInt ();
        for (int i = 0; i < m; i ++){
        int h = in.nextInt ();
            int w = in.nextInt ();
            int n = in.nextInt ();
            int treasures = 0;
            int row = 0;
            int col = 0;
            in.nextLine ();

            int [][] arr = new int [h+1][w];

            for (int j = 0; j < w; j ++){
                arr [0][j] = 1;
            }

            for (int j = 1; j <= h; j ++){
                String b = in.nextLine ();
                for (int k = 0; k < w; k ++){
                    char cur = b.charAt(k);
                    if (cur == 'E') arr [j][k] = 0;
                    if (cur == 'D') arr [j][k] = 1;
                    if (cur == 'S') arr [j][k] = 2;
                    if (cur == 'T') arr [j][k] = 3;
                }
            }

            for (int j = 1; j <= n; j ++){
                String move = in.nextLine ();
                if (move.equals ("R")){
                    if (col + 1 < w && arr [row][col+1] != 2){
                        col ++;
                    }
                    else continue;
                }
                if (move.equals ("L")){
                    if (col - 1 >= 0 && arr [row][col-1] != 2)
                        col --;
                    else continue;
                }
                if (move.equals ("D")){
                    if (row + 1 <= h && arr [row+1][col] != 2)
                        row ++;
                    else continue;
                }
                if (arr[row][col] == 3) treasures ++;
                arr[row][col] = 0;

                if (arr[row][col] == 0){
                    int currentRow = row;
                    while (currentRow <= h && arr[currentRow][col] == 0){
                        currentRow ++;
                    }
                    row = currentRow - 1;
                }
            }
            System.out.println (treasures);
        }
    }
}
