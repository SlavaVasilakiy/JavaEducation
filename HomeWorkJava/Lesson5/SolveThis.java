import java.util.Scanner;

public class SolveThis {
    public void solveThis() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        TriangularNumberSolution mySolution = new TriangularNumberSolution();
        int result = mySolution.triangularNumberSolution(n);
        System.out.printf("Triangular number of %d --> %d", n, result);
    }
}
