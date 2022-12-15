package ArraySort;

import java.util.Arrays;

public class ArraySort {
    public static void main(String[] args) {
        int[] masssive = {5, 10, 7, 3};
        int[] result = mergeSortInner(masssive);
        System.out.println(Arrays.toString(result));
    }

    public static int[] mergeSortInner(int [] mass) {
        if (mass.length < 2) {
            return mass;
        }
        int size = mass.length;
        int [] left = new int[size / 2];
        int [] right = new int[size - left.length];
        mergeSortInner(left);
        mergeSortInner(right);
        int[] result = new int[size];
        int index1 = 0;
        int index2 = 1;
        return result;
    }
}
