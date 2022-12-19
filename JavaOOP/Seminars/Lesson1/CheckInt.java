package Lesson1;

public class CheckInt {
    public void CheckInt(int[] a, int[] result) {
        try {
            Lesson1.SumOfNumbers sum = new Lesson1.SumOfNumbers();
            sum.SumOfNumbers(a, result);
            Lesson1.PrintResult printRes = new Lesson1.PrintResult(result);
        } catch (Exception e) {
            System.out.println("Data not valid");
        }
    }
}

