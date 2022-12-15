package Seminars.Lesson1;

public class CheckInt {
    public void CheckInt(int[] a, int[] result) {
        try {
            SumOfNumbers sum = new SumOfNumbers();
            sum.SumOfNumbers(a, result);
            PrintResult printRes = new PrintResult(result);
        } catch (Exception e) {
            System.out.println("Data not valid");
        }
    }
}

