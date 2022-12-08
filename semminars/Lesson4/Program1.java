package semminars.Lesson4;

import java.util.Arrays;

public class Program1 {
    public static void main(String[] args) {
        int[] a = { 1, 9, 9, 0, 2, 8, 0, 9 };
        int max = Arrays.stream(a).max().getAsInt();

        System.out.println(max);

        int[] hash = new int[max + 1];

        for (int i = 0; i < a.length; i++) {
            hash[a[i]]++;
        }

        System.out.println(Arrays.toString(hash));

        for (int i = 0; i < hash.length; i++) {
            if (hash[i] != 0) {
                System.out.printf("%d встречается %d\n", i, hash[i]);
            }
        }
    }
}
