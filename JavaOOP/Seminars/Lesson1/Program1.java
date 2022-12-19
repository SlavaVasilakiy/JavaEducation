package Lesson1;

public class Program1 {
    public static void main(String[] args) {
        int[] a = {1, 2, 5, 4, 3, 4, 5, 3, 4, 5, 6};
        int[] result = new int[a.length - 2];
        CheckInt check = new CheckInt();
        check.CheckInt(a, result);
    }
}

