import java.util.LinkedList;

public class ShortWay {
    public LinkedList<int[]> shortestWay(int[][] field, int startX, int startY, int finishX, int finishY) {
        LinkedList<int[]> quPath = new LinkedList<>();
        int[] move = {finishX, finishY};
        quPath.add(move);
        int minValue = field[move[0]][move[1]];
        if (field[finishX][finishY] == 0) {
            return null;
        } else {
            while (move[0] != startX || move[1] != startY) {
                move = quPath.getLast();
                if (move[0] < field.length - 1) {
                    if (field[move[0] + 1][move[1]] < minValue && field[move[0] + 1][move[1]] > 0) {
                        minValue = field[move[0] + 1][move[1]];
                        quPath.add(new int[]{move[0] + 1, move[1]});
                    }
                }
                if (move[1] < field.length - 1) {
                    if (field[move[0]][move[1] + 1] < minValue && field[move[0]][move[1] + 1] > 0) {
                        minValue = field[move[0]][move[1] + 1];
                        quPath.add(new int[]{move[0], move[1] + 1});
                    }
                }
                if (move[0] > 0) {
                    if (field[move[0] - 1][move[1]] < minValue && field[move[0] - 1][move[1]] > 0) {
                        minValue = field[move[0] - 1][move[1]];
                        quPath.add(new int[]{move[0] - 1, move[1]});
                    }
                }
                if (move[1] > 0) {
                    if (field[move[0]][move[1] - 1] < minValue && field[move[0]][move[1] - 1] > 0) {
                        minValue = field[move[0]][move[1] - 1];
                        quPath.add(new int[]{move[0], move[1] - 1});
                    }
                }
            }
            quPath.add(new int[]{startX, startY});
            return quPath;
        }
    }
}

