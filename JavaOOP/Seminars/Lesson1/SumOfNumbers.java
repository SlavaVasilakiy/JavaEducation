package Lesson1;

public class SumOfNumbers {
    public void SumOfNumbers(int[] a, int[] result) {
        for (int i = 0; i < a.length - 2; i++) {
            result[i] = a[i] + a[i + 1] + a[i + 2];
        }
    }
}
