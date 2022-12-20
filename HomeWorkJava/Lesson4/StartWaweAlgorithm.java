import java.util.LinkedList;

public class StartWaweAlgorithm {
    public void Start() {
        Create create = new Create();
        int[][] myLab = create.createField(20, 20);
        int xA = 1;
        int yA = 5;
        int xB = 17;
        int yB = 15;
        AlgorithmSolution mySolution = new AlgorithmSolution();
        mySolution.waveAlgorithm(myLab, xA, yA, xB, yB);
        ShortWay shortestWay = new ShortWay();
        LinkedList<int[]> myWay = shortestWay.shortestWay(myLab, xA, yA, xB, yB);
        Print myPrint = new Print();

        if (myWay == null) {
            System.out.println("No path");
        } else {
            myPrint.printField(myLab, myWay);
        }
    }
}
