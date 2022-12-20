import java.util.Random;

public class Create {
    public int[][] createField(int a, int b) {
        int[][] arr = new int[a][b];
        Random rnd = new Random();
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (i == 0 || j == 0 || i == a - 1 || j == b - 1)
                    arr[i][j] = -1;
                else {
                    arr[i][j] = rnd.nextInt(4) - 1;
                    if (arr[i][j] > -1)
                        arr[i][j] = 0;
                }
            }
        }
        return arr;
    }
}
