import java.util.LinkedList;
import java.util.Queue;

public class AlgorithmSolution {
    public void waveAlgorithm(int[][] field, int startX, int startY, int finishX, int finishY) {
        Queue<int[]> quPath = new LinkedList<int[]>();
        field[startX][startY] = 1;
        int[] move = {startX, startY};
        quPath.add(move);
        field[finishX][finishY] = 0;
        while (quPath.size() != 0) {
            move = quPath.remove();
            if (move[0] < field.length - 1) {
                if (field[move[0] + 1][move[1]] == 0) {
                    quPath.add(new int[]{move[0] + 1, move[1]});
                    field[move[0] + 1][move[1]] = field[move[0]][move[1]] + 1;
                }
            }
            if (move[1] < field.length - 1) {
                if (field[move[0]][move[1] + 1] == 0) {
                    quPath.add(new int[]{move[0], move[1] + 1});
                    field[move[0]][move[1] + 1] = field[move[0]][move[1]] + 1;
                }
            }
            if (move[0] > 0) {
                if (field[move[0] - 1][move[1]] == 0) {
                    quPath.add(new int[]{move[0] - 1, move[1]});
                    field[move[0] - 1][move[1]] = field[move[0]][move[1]] + 1;
                }
            }
            if (move[1] > 0) {
                if (field[move[0]][move[1] - 1] == 0) {
                    quPath.add(new int[]{move[0], move[1] - 1});
                    field[move[0]][move[1] - 1] = field[move[0]][move[1]] + 1;
                }
            }
        }
    }
}
