import java.util.LinkedList;

public class Print {
    public void printField(int[][] array, LinkedList<int[]> way) {
        for (int k = 0; k < way.size(); k++) {
            int[] point = way.get(k);
            array[point[0]][point[1]] = 1;
        }
        int[] pointF = way.getFirst();
        int[] pointS = way.getLast();
        array[pointF[0]][pointF[1]] = -3;
        array[pointS[0]][pointS[1]] = -2;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (array[i][j] == -1) {
                    System.out.printf("%c", '\u25A0');
                } else if (array[i][j] == 1) {
                    System.out.printf((char) 27 + "[31m\u25A0" + (char) 27 + "[0m");
                } else if (array[i][j] == -2) {
                    System.out.printf((char) 27 + "[32m\u25A0" + (char) 27 + "[0m");
                } else if (array[i][j] == -3) {
                    System.out.printf((char) 27 + "[34m\u25A0" + (char) 27 + "[0m");
                } else {
                    System.out.printf((char) 27 + "[31m " + (char) 27 + "[0m");
                }
            }
            System.out.println();
        }
    }
}

