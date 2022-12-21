import java.util.Scanner;
/**
 * В этом блоке происходит запрос числа от пользователя, затем оно передаётся
 * в класс TriangularNumberSolution для вычисления треугольного числа
 * и записывается результат в переменную result
 * после чего ответ выводится в консоль
 */
public class SolveThis {
    public void solveThis() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        TriangularNumberSolution mySolution = new TriangularNumberSolution();
        int result = mySolution.triangularNumberSolution(n);
        System.out.printf("Triangular number of %d --> %d", n, result);
    }
}
